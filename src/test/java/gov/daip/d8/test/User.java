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
	public void clickGetAssistanceMenuLinks(String menuLinks) {
		if ((menuLinks.equals("address look-up"))) {
			daHomepage.clickAddressLookUp();
		} else if ((menuLinks.equals("find assistance"))) {
			daHomepage.clickFindAssistance();
		} else if ((menuLinks.equals("apply online"))) {
			daHomepage.clickApplyOnline();
		} else if ((menuLinks.equals("check your status"))) {
			daHomepage.clickCheckYourStatus();
		} else if ((menuLinks.equals("forms of assistance"))) {
			daHomepage.clickFormsOfAssistance();
		} else if ((menuLinks.equals("community leaders"))) {
			daHomepage.clickCommLeaders();
		} else if ((menuLinks.equals("other recovery help"))) {
			daHomepage.clickOtherHelp();
		} else if ((menuLinks.equals("application checklist"))) {
			daHomepage.clickApplicationChecklist();
		} else if ((menuLinks.equals("forms"))) {
			daHomepage.clickForms();
		}
	}

	/*@Step
	public void clickSpanishGetAssistanceTab(String menuLinks) {
		if (menuLinks.equals("buscador de direcciones")) {
			daHomepage.clickSpanishAddressLookUp();
		} else if (menuLinks.equals("encontrar ayuda")) {
			daHomepage.clickSpanishFindAssistance();
		} else if (menuLinks.equals("solicitar asistencia")) {
			daHomepage.clickSpanishApplyOnline();
		} else if (menuLinks.equals("revisar estatus")) {
			daHomepage.clickSpanishCheckStatus();
		} else if (menuLinks.equals("formas de asistencia")) {
			daHomepage.clickSpanishAssistanceCategory();
		} else if (menuLinks.equals("otra ayuda para recuperación")) {
			daHomepage.clickSpanishOtherHelp();
		} else if (menuLinks.equals("líderes comunitarios")) {
			daHomepage.clickSpanishCommLeaders();
		} else if (menuLinks.equals("lista de verificación para aplicarse")) {
			daHomepage.clickSpanishApplicationChecklist();
		} else if (menuLinks.equals("formularios")) {
			daHomepage.clickSpanishForms();
		}
	}*/
	
	@Step
	public void clickInfoMenuLinks(String menuLinks) {
		if (menuLinks.equals("news feeds")) {
			daHomepage.clickNewsFeeds();
		} else if (menuLinks.equals("immediate needs")) {
			daHomepage.clickImmediateNeeds();
		} else if (menuLinks.equals("moving forward")) {
			daHomepage.clickMovingForward();
		} else if (menuLinks.equals("disabilities or access and functional needs")) {
			daHomepage.clickDisabilities();
		} else if (menuLinks.equals("older americans")) {
			daHomepage.clickOlderAmericans();
		} else if (menuLinks.equals("children and families")) {
			daHomepage.clickChildrenAndFamilies();
		} else if (menuLinks.equals("disaster types")) {
			daHomepage.clickDisasterTypes();
		} else if (menuLinks.equals("foreign disasters")) {
			daHomepage.clickForeignDisasters();
		} else if (menuLinks.equals("fact sheets")) {
			daHomepage.clickFactSheets();
		}
	}
	
	@Step
	public void clickAboutMenuLinks(String menuLinks) {
		if (menuLinks.equals("overview")) {
			daHomepage.clickOverview();
		} else if (menuLinks.equals("partners")) {
			daHomepage.clickPartners();
		}
	}
	
	@Step
	public void clickHelpMenuLinks(String menuLinks) {
		if (menuLinks.equals("faqs")) {
			daHomepage.clickFaqs();
		} else if (menuLinks.equals("contact us")) {
			daHomepage.clickContactUs();
		} else if (menuLinks.equals("privacy policy")) {
			daHomepage.clickPrivacyPolicy();
		} else if (menuLinks.equals("accessibility")) {
			daHomepage.clickAccessibility();
		} else if (menuLinks.equals("download plug-ins")) {
			daHomepage.clickDownload();
		}
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
		case "get assistance":
		case "obtener asistencia":
		case "information":
		case "información":
		case "about us":
		case "acerca de":
		case "help":
		case "ayuda":
		case "community leaders":
		case "líderes comunitarios":
		case "forms of assistance":
		case "formas de asistencia":
		case "immediate needs":
		case "necesidades inmediatas":
		case "moving forward":
		case "community resources":
		case "próximo paso":
		case "disabilities or access and functional needs":
		case "discapacidades o necesidades funcionales y de acceso":
		case "older americans":
		case "adultos mayores estadounidenses":
		case "children and families":
		case "niños y familias":
		case "disaster types":
		case "los Recursos del desastre":
			// TODO: Should this assertion be done on all pages?
			// If so, delete all cases above this and move this assertion to
			// after switch
			Assert.assertEquals(expectedPageName.toLowerCase(), daHomepage.pullPageTitle().toLowerCase());
			break;
			
		case "other recovery help":
		case "otra ayuda para recuperación":
		case "application checklist":
		case "lista de verificación para aplicarse":
		case "forms":
		case "formularios":
		case "news feeds":
		case "canales de noticias \"feeds\"":
		case "foreign disasters":
		case "desastres en el extranjero":
		case "fact sheets":
		case "hojas de datos":
		case "overview":
		case "descripción general":
		case "partners":
		case "socios":
		case "contact us":
		case "contáctenos":
		case "privacy policy":
		case "política de privacidad":
		case "accessibility":
		case "accesibilidad":
		case "download plug-ins":
		case "descargar plug-ins":
			Assert.assertEquals(expectedPageName.toLowerCase(), daHomepage.pullPageSubTitle().toLowerCase());
			break;
			
		case "faqs":
			Assert.assertEquals("Frequently Asked Questions (FAQs)", daHomepage.pullPageSubTitle());
			break;
		case "preguntas Comunes":
			Assert.assertEquals("Preguntas Comunes", daHomepage.pullPageSubTitle());
			break;
			
		case "home":
		case "inicio":
		case "address look-up":
		case "buscador de direcciónes":
			Assert.assertEquals(true, daHomepage.addressLookupIsDisplayed());
			break;	
		
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
	public void checkSpanishDisasterState() {
		Assert.assertEquals(daHomepage.checkSpanishDisasterStatesEdit(), daHomepage.checkDisasterStates());
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
	public void shouldSeeSpanishTitle() {
		Assert.assertEquals("Tormentas Severas (en inglés)", daLanding.stormTitle());
		Assert.assertEquals("Huracanes (en inglés)", daLanding.hurricaneTitle());
		Assert.assertEquals("Terremotos (en inglés)", daLanding.earthquakesTitle());
		Assert.assertEquals("Sequía (en inglés)", daLanding.droughtTitle());
		Assert.assertEquals("Incendios Forestales (en inglés)", daLanding.wildfireTitle());
	}
	
	@Step
	public void onCommunityLeadersPage() {
		drupalPage.openAt("https://staging.disasterassistance.gov/get-assistance/community-leaders/?mobile=unL9HuS");
	}
	
	@Step
	public void onSpanishCommunityLeadersPage() {
		drupalPage.openAt("https://staging.disasterassistance.gov/es/obtener-asistencia/líderes-comunitarios/?mobile=unL9HuS");
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
	public void declaredSpanishDisasters() {
		daHomepage.typeSpanishAddressLookUp();
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
	public void verifyFOAExpandedContentVisible() {
		int i = daQues.getResultsVal(); 
		daQues.getFOAResultsPage();
		Assert.assertEquals(i, daQues.getNumEmploymentResults());
	}
	
	@Step
	public void seesFOAFooter() {
		Assert.assertTrue(daQues.foaFooterIsVisible());
	}
	
	@Step
	public void clicksNextFOA() {
		daQues.clickNextFOA();
	}
	
	@Step
	public void testsApplyOnlineAccordions() {
		Assert.assertEquals(3, daQues.numApplyOnlineFOAs());
	}
	
	@Step
	public void clicksApplyOnline() {
		daQues.clickApplyOnline();
	}
	
	@Step
	public void shouldSeeDAC() {
		daHomepage.pause(2000);
		boolean dacPageVisible = (daQues.checkStatusPageIsDisplayed() || daQues.dacPageIsDisplayed());
		Assert.assertEquals(true, dacPageVisible);
	} 
	
	@Step
	public void checkTwitterFeedBlock() throws FeedException {
		daLanding.checkTwitterFeedBlock();
	}
	
	@Step
	public void checkTwitterFeed() throws FeedException {
		daLanding.checkTwitterFeed();
	}
	
	@Step
	public void clickCategoryType() {
		daLanding.clickCategoryType();
		daLanding.clickFirstCategoryTypes();
	}
	
	@Step 
	public void get90Results() {
		Assert.assertEquals("Showing 1 - 10 of 90 results View 10 50 All", daLanding.getResults());
	}
	
	@Step
	public void get90SpanishResults() {
		Assert.assertEquals("Mostrando 1 - 10 de 90 resultados Ver 10 50 Todos", daLanding.getResults());
	}
	
	@Step 
	public void clickNextCategoryType() {
		daLanding.clickCategoryType();
		daLanding.clickNextCategoryTypes();
	}
	
	@Step 
	public void get112Results() {
		Assert.assertEquals("Showing 1 - 10 of 112 results View 10 50 All", daLanding.getResults());
	}
	
	@Step
	public void get112SpanishResults() {
		Assert.assertEquals("Mostrando 1 - 10 de 112 resultados Ver 10 50 Todos", daLanding.getResults());
	}
	
	@Step 
	public void clickFederalAgency() {
		daLanding.clickFederalAgency();
		daLanding.clickFirstSevenFederalAgencies();
	}
	
	@Step
	public void get43Results() {
		Assert.assertEquals("Showing 1 - 10 of 43 results View 10 50 All", daLanding.getResults());
	}
	
	@Step
	public void get43SpanishResults() {
		Assert.assertEquals("Mostrando 1 - 10 de 43 resultados Ver 10 50 Todos", daLanding.getResults());
	}
	
	@Step
	public void clickNextFederalAgency() {
		daLanding.clickFederalAgency();
		daLanding.clickNextFederalAgencies();
	}
	
	@Step
	public void get38Results() {
		Assert.assertEquals("Showing 1 - 10 of 38 results View 10 50 All", daLanding.getResults());
	}
	
	@Step
	public void get38SpanishResults() {
		Assert.assertEquals("Mostrando 1 - 10 de 38 resultados Ver 10 50 Todos", daLanding.getResults());
	}
}