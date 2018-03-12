package gov.daip.d8.test.pageObject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;

import gov.daip.d8.test.exceptions.FeedException;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class DALandingPage extends PageObject {
	
	// *************************************************************************
	// FindBy / private variables section
	
	@FindBy(xpath = "//*[@id='block-twitterblock']")
	private WebElementFacade twitterFeedBlock;

	@FindBy(xpath = "//*[@id='block-severe-storms']/h3")
	private WebElementFacade severeStorms;

	@FindBy(xpath = "//*[@id='block-wildfire']/h3")
	private WebElementFacade wildfire;

	@FindBy(xpath = "//*[@id='block-earthquakes']/h3")
	private WebElementFacade earthquakes;

	@FindBy(xpath = "//*[@id='block-drought']/h3")
	private WebElementFacade drought;
	
	@FindBy(xpath = "//*[@id='block-communityleadersresultspage']/div[1]/div/div[1]/div[2]")
	private WebElementFacade quickSearchResult;
	
	@FindBy(xpath = "//*[@id='block-communityleadersresultspage']/div[2]")
	private WebElementFacade communityPreparedness;

	@FindBy(xpath = "//*[@id='block-communityleadersresultspage']/div[3]")
	private WebElementFacade disasterRecoveryResources;
	
	@FindBy(xpath = "//*[@id='block-communityleadersresultspage']/div[4]")
	private WebElementFacade emergencyShelterHousing;

	@FindBy(xpath = "//*[@id='block-communityleadersresultspage']/div[5]")
	private WebElementFacade howCanYouHelp;

	@FindBy(xpath = "//*[@id='block-communityleadersresultspage']/div[6]")
	private WebElementFacade infrastructure;
	
	@FindBy(xpath = "//*[@id='edit-filter-by-1']")
	private WebElementFacade categoryType;
	
	@FindBy(xpath = "//*[@id='edit-filter-by-2']")
	private WebElementFacade federalAgency;
	
	@FindBy(xpath = "//*[@id='edit-category-list-214']")
	private WebElementFacade careerAssistance;
	
	@FindBy(xpath = "//*[@id='edit-category-list-215']")
	private WebElementFacade disabilityAssistance;
	
	@FindBy(xpath = "//*[@id='edit-category-list-216']")
	private WebElementFacade disasterRelief;
	
	@FindBy(xpath = "//*[@id='edit-category-list-217']")
	private WebElementFacade educationTraining;
	
	@FindBy(xpath = "//*[@id='edit-category-list-218']")
	private WebElementFacade energyAssistance;
	
	@FindBy(xpath = "//*[@id='edit-category-list-219']")
	private WebElementFacade foodNutrition;
	
	@FindBy(xpath = "//*[@id='edit-category-list-220']")
	private WebElementFacade grants;
	
	@FindBy(xpath = "//*[@id='edit-category-list-221']")
	private WebElementFacade housing;
	
	@FindBy(xpath = "//*[@id='edit-category-list-222']")
	private WebElementFacade insurance;
	
	@FindBy(xpath = "//*[@id='edit-category-list-223']")
	private WebElementFacade legalCounsel;
	
	@FindBy(xpath = "//*[@id='edit-category-list-224']")
	private WebElementFacade livingAssistance;
	
	@FindBy(xpath = "//*[@id='edit-category-list-225']")
	private WebElementFacade loanRepayment;
	
	@FindBy(xpath = "//*[@id='edit-category-list-226']")
	private WebElementFacade mentalHealth;
	
	@FindBy(xpath = "//*[@id='edit-category-list-227']")
	private WebElementFacade socialSecurity;
	
	@FindBy(xpath = "//*[@id='edit-category-list-228']")
	private WebElementFacade veterans;
	
	@FindBy(xpath = "//*[@id='edit-agency-title-list-usda']")
	private WebElementFacade USDA;
	
	@FindBy(xpath = "//*[@id='edit-agency-title-list-ed']")
	private WebElementFacade ED;
	
	@FindBy(xpath = "//*[@id='edit-agency-title-list-hhs']")
	private WebElementFacade HHS;
	
	@FindBy(xpath = "//*[@id='edit-agency-title-list-dhs']")
	private WebElementFacade DHS;
	
	@FindBy(xpath = "//*[@id='edit-agency-title-list-hud']")
	private WebElementFacade HUD;
	
	@FindBy(xpath = "//*[@id='edit-agency-title-list-doj']") 
	private WebElementFacade DOJ;
	
	@FindBy(xpath = "//*[@id='edit-agency-title-list-dol']")
	private WebElementFacade DOL;
	
	@FindBy(xpath = "//*[@id='edit-agency-title-list-va']")
	private WebElementFacade VA;
	
	@FindBy(xpath = "//*[@id='edit-agency-title-list-doi']")
	private WebElementFacade DOI;
	
	@FindBy(xpath = "//*[@id='edit-agency-title-list-treasury']")
	private WebElementFacade treasury;
	
	@FindBy(xpath = "//*[@id='edit-agency-title-list-opm']")
	private WebElementFacade OPM;
	
	@FindBy(xpath = "//*[@id='edit-agency-title-list-usps']")
	private WebElementFacade USPS;
	
	@FindBy(xpath = "//*[@id='edit-agency-title-list-sba']")
	private WebElementFacade SBA;
	
	@FindBy(xpath = "//*[@id='edit-agency-title-list-ssa']")
	private WebElementFacade SSA;
	
	@FindBy(xpath = "//*[@class='desktop-header']")
	private WebElementFacade results;
	
	@FindBy(xpath = "//*[@id='edit-category-select']")
	private WebElementFacade searchCategoryButton;
	
	@FindBy(xpath = "//*[@id='edit-agency-select']")
	private WebElementFacade searchAgencyButton;
	
	@FindBy(xpath = "//*[@id='edit-elasticsearch-query']")
	private WebElementFacade searchBar;
	
	@FindBy(xpath = "//*[@id='edit-submit-desktop']")
	private WebElementFacade communityLeadersSearch;
	
	// *************************************************************************
	// Functions
	
	/*************************************************************************
	 * Checks that the twitter feed is visible with the most recent tweets.
	 * 
	 *************************************************************************/
	public void checkTwitterFeed() throws FeedException {
		this.evaluateJavascript("window.scrollTo(0,document.body.scrollHeight)");

		int expected = 3;

		// NOTE(Chris):
		// Have to switch iframe to see element could cause other issues (maybe)
		List<WebElement> recentTweets = this.getDriver().switchTo().frame("twitter-widget-0")
				.findElements(By.xpath("//ol[@class='timeline-TweetList']/li"));
		Iterator<WebElement> twiterator = recentTweets.iterator();

		if (recentTweets.size() != expected) {
			throw new FeedException("Expected: <" + expected + ">, actual value: <" + recentTweets.size() + ">");
		}
		while (twiterator.hasNext()) {
			if (!twiterator.next().isDisplayed()) {
				throw new FeedException("Twitter feed not visible");
			}
		}
	}
	
	/*************************************************************************
	 * Verifies that the FEMA twitter feed is visible on the homepage.
	 * 
	 *************************************************************************/
	public void checkTwitterFeedBlock() throws FeedException {
		if (!twitterFeedBlock.isVisible()) {
			throw new FeedException("Twitter feed not visible");
		}  
	}
	
	/*************************************************************************
	 * Checks if the Community Leaders search box contains any of these
	 * keywords.
	 * 
	 *************************************************************************/
	public boolean communityResults() {
		return quickSearchResult.containsText("Community") || quickSearchResult.containsText("community")
				|| quickSearchResult.containsText("Preparedness") || quickSearchResult.containsText("recovery")
				|| quickSearchResult.containsText("leaders") || quickSearchResult.containsText("housing")
				|| quickSearchResult.containsText("Shelter") || quickSearchResult.containsText("Volunteers")
				|| quickSearchResult.containsText("Utilities") || quickSearchResult.containsText("Public Assistance")
				|| quickSearchResult.containsText("checklist") || quickSearchResult.containsText("Infrastructure")
				|| quickSearchResult.containsText("Governments") || quickSearchResult.containsText("Guide")
				|| quickSearchResult.containsText("Checklists") || quickSearchResult.containsText("infraestructura")
				|| quickSearchResult.containsText("comunidad") || quickSearchResult.containsText("gobierno")
				|| quickSearchResult.containsText("refugio") || quickSearchResult.containsText("Vivienda")
				|| quickSearchResult.containsText("desastres") || quickSearchResult.containsText("Lista");
	}

	public String stormTitle() {
		return severeStorms.getText();
	}
 
	public String wildfireTitle() {
		return wildfire.getText();
	}

	public String earthquakesTitle() {
		return earthquakes.getText();
	}

	public String droughtTitle() {
		return drought.getText();
	}
	
	public void clickCommunityPreparedness() {
		communityPreparedness.click();
	}

	public void clickDisasterRecoveryResources() {
		disasterRecoveryResources.click();
	}

	public void clickEmergencyShelterHousing() {
		emergencyShelterHousing.click();
	}

	public void clickHowCanYouHelp() {
		howCanYouHelp.click();
	}

	public void clickInfrastructure() {
		infrastructure.click();
	}
	
	public void clickCategoryType() {
		categoryType.click();
	}
	
	public void clickFederalAgency() {
		federalAgency.click();
	}
	
	public void clickFirstCategoryTypes() {
		careerAssistance.click();
		disabilityAssistance.click();
		disasterRelief.click();
		educationTraining.click();
		energyAssistance.click();
		foodNutrition.click();
		grants.click();
		searchCategoryButton.click();
	}
	
	public void clickNextCategoryTypes() {
		housing.click();
		insurance.click();
		legalCounsel.click();
		livingAssistance.click();
		loanRepayment.click();
		mentalHealth.click();
		socialSecurity.click();
		veterans.click();
		searchCategoryButton.click();
	}
	
	public void clickFirstSevenFederalAgencies() {
		USDA.click();
		ED.click();
		HHS.click();
		DHS.click();
		HUD.click();
		DOJ.click();
		DOL.click();
		this.evaluateJavascript("window.scrollBy(0,500)", "");
		this.evaluateJavascript("window.scrollBy(0,500)", "");
		searchAgencyButton.click();
	}
	
	public void clickNextFederalAgencies() {
		VA.click();
		SBA.click();
		SSA.click();
		DOI.click();
		treasury.click();
		this.evaluateJavascript("window.scrollBy(0,500)", "");
		OPM.click();
		USPS.click();
		this.evaluateJavascript("window.scrollBy(0,500)", "");
		this.evaluateJavascript("window.scrollBy(0,500)", "");
		searchAgencyButton.click();
	}
	
	public String getResults() {
		return results.getText(); 
	}
	
	public void typeIntoSearchBar() {
		searchBar.click();
		searchBar.type("disaster");
		communityLeadersSearch.click();
	}
}