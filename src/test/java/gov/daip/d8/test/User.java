package gov.daip.d8.test;

import net.thucydides.core.annotations.Step;

import org.junit.Assert;

import gov.daip.d8.test.pageObject.DAPage;
import gov.daip.d8.test.pageObject.DAHomepage;
import gov.daip.d8.test.pageObject.DALandingPage;
import gov.daip.d8.test.pageObject.DAQuestionnaire;
import gov.daip.d8.test.pageObject.DrupalPage;
import gov.daip.d8.test.exceptions.LocalResourcesException;
import gov.daip.d8.test.exceptions.FeedException;
import gov.daip.d8.test.exceptions.StateException;

/*************************************************************************
 * The "user" that is performing all of the actions on the web page. Provides an
 * extra layer of abstraction so all the functions called are named to emulate
 * actions that a real user would perform.
 * 
 * @author Chris Viqueira
 * @author Divya Sharma
 ************************************************************************/

public class User {

	DAPage dapage;
	DAHomepage daHomepage;
	DALandingPage daLanding;
	DAQuestionnaire daQues;
	DrupalPage drupalPage;

	/*********************************************/

	@Step
	public void home() {
		daHomepage.getDriver().get("https://www.disasterassistance.gov");
	}

	@Step
	public void clickIcon() {
		dapage.clickIcon();
	}

	@Step
	public void seeHome() {
		Assert.assertEquals("Home | DisasterAssistance.gov | Access to Disaster Help and Resources",
				dapage.shouldSeeHome());
	}

	/*********************************************/
	
	@Step
	public void open_page(String directoryPath) {
		dapage.clearCookies();

		String url = dapage.defaultUrl + directoryPath;
		if (dapage.defaultUrl.contains("staging")) {
			url += "?mobile=unL9HuS";
		}

		daHomepage.openAt(url);
	}
	
	@Step
	public void clickMainLink(String mainLink) {
		if ((mainLink.equals("find assistance")) || (mainLink.equals("encontrar ayuda"))) {
			daHomepage.clickAssistanceMainLink();
			daHomepage.pause(2000);
		} else if ((mainLink.equals("apply online")) || (mainLink.equals("solicitar asistencia"))) {
			daHomepage.clickApplyOnlineMainLink();
			daHomepage.pause(2000);
		} else if ((mainLink.equals("check status")) || (mainLink.equals("revisar estatus"))) {
			daHomepage.clickCheckStatusMainLink();
			daHomepage.pause(2000);
		}
	}
	
	/************************************************************************
	 * Runs the assertions to make sure a page is valid using simple checks such
	 * as comparing the page title.
	 *
	 * @param expectedPageName
	 *            : name of the page being tested
	 *************************************************************************/
	@Step
	public void shouldSeePage(String expectedPageName) {
		switch (expectedPageName) {
		case "find assistance":
			Assert.assertEquals(true, daHomepage.questionnaireIsDisplayed());
			break;
		case "encontrar ayuda":
			Assert.assertEquals(true, daHomepage.questionnaireIsDisplayed());
			break;
		case "revisar estatus":
		case "solicitar asistencia":
		case "check your status":
		case "apply online":
			boolean dacPageVisible = (daHomepage.checkStatusPageIsDisplayed() || daHomepage.dacPageIsDisplayed());
			Assert.assertEquals(true, dacPageVisible);
			break;
			
		default:
			System.err.println("INVALID PAGE SENT");
			break;
		} // end switch
	}
	
	@Step
	public void checkDisasterMap() throws StateException {
		daHomepage.checkDisasterMap();
	}
	
	@Step
	public void checkStates() throws StateException {
		daHomepage.checkStates();
	}
	
	@Step 
	public void checkDisasterState() {
		Assert.assertEquals(daHomepage.checkDisasterStatesEdit(), daHomepage.checkDisasterStates());
	}
	
	@Step
	public void lookUpLocation() {
		daHomepage.lookUpLocation();
	}

	@Step
	public void verifyLocalResources() throws LocalResourcesException {
		daHomepage.verifyLocalResourcesResults();
	}
	
	@Step
	public void shouldSeeTitle() {
		Assert.assertEquals("Severe Storms", daLanding.stormTitle());
		Assert.assertEquals("Hurricanes", daLanding.hurricaneTitle());
		Assert.assertEquals("Earthquakes", daLanding.earthquakesTitle());
		Assert.assertEquals("Drought", daLanding.droughtTitle());
		Assert.assertEquals("Wildfires", daLanding.wildfireTitle());
	}
	
	@Step
	public void onCommunityLeadersPage() {
		drupalPage.openAt("https://staging.disasterassistance.gov/get-assistance/community-leaders/?mobile=unL9HuS");
	}
	
	@Step
	public void clickQuickSearch(String quickSearch) {
		if ((quickSearch.equals("Community Preparedness")) || (quickSearch.equals("Preparación para la comunidad"))) {
			daLanding.clickCommunityPreparedness();
		} else if ((quickSearch.equals("Disaster Recovery Resources")) || (quickSearch.equals("Recursos para recuperación de desastre"))) {
			daLanding.clickDisasterRecoveryResources();
		} else if ((quickSearch.equals("Emergency Shelter and Housing")) || (quickSearch.equals("Viviendas y refugios de emergencia"))) {
			daLanding.clickEmergencyShelterHousing();
		} else if ((quickSearch.equals("How Can You Help?")) || (quickSearch.equals("¿Como puede ayudar?"))) {
			daLanding.clickHowCanYouHelp();
		} else if ((quickSearch.equals("Infrastructure, Utilities, and Other Public Assistance")) || (quickSearch.equals("Infraestructura, servicios públicos y otra asistencia pública"))) {
			daLanding.clickInfrastructure();
		} 
	}
	
	@Step
	public void quickSearchResults() {
		Assert.assertTrue(daLanding.communityResults());
	}

	@Step
	public void openDisasterDACPage() {
		daHomepage.openAt("https://www.disasterassistance.gov/drupal_api/declaredStates");
	}
	
	@Step 
	public void declaredDisasters() {
		daHomepage.typeAddressLookUp();
	}
	
	@Step
	public void disasterResults() {
		Assert.assertTrue(daHomepage.disasterAppears());
	}
	
	@Step 
	public void getEmploymentResults() {
		daQues.clickEmploymentCheckbox();
		daQues.getFOAResultsPage();
	}
	
	@Step 
	public void verifyEmploymentResultsAndVisibility() {
		Assert.assertEquals(9, daQues.getNumQuesResults());
	}
	
	@Step
	public void completeQuestionnaire() {
		daQues.completeFullQuestionnaire();
		daHomepage.pause(1000);
	}
	
	@Step
	public void checkResults() {
		int i = daQues.getResultsVal();
		daQues.getFOAResultsPage(); 
		Assert.assertEquals(i, daQues.getNumQuesResults());
	}
	
	@Step
	public void checkTwitterFeedBlock() throws FeedException {
		daLanding.checkTwitterFeedBlock();
	}
	
	@Step
	public void checkTwitterFeed() throws FeedException {
		daLanding.checkTwitterFeed();
	}
}