package gov.daip.d8.test.pageObject;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
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
	
	@FindBy(xpath = "//*[@id=\"block-twitterblock-2\"]")
	private WebElementFacade mobileTwitterFeedBlock;

	@FindBy(xpath = "//*[@id='block-severe-storms']/h3")
	private WebElementFacade severeStorms;

	@FindBy(xpath = "//*[@id='block-wildfire']/h3")
	private WebElementFacade wildfire;

	@FindBy(xpath = "//*[@id='block-earthquakes']/h3")
	private WebElementFacade earthquakes;

	@FindBy(xpath = "//*[@id='block-drought']/h3")
	private WebElementFacade drought;

	@FindBy(xpath = "//*[@id='block-communityleadersresultspage']/div[1]/div/div/div[2]")
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
	                  
	@FindBy(xpath = "//*[@class='modal-bar']")
	private WebElementFacade mobileResults;
	
	//@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/div/div/div[1]/div[2]/div")
	//private WebElementFacade mobileResults;

	@FindBy(xpath = "//*[@id='edit-category-select']")
	private WebElementFacade searchCategoryButton;

	@FindBy(xpath = "//*[@id='edit-agency-select']")
	private WebElementFacade searchAgencyButton;

	@FindBy(xpath = "//*[@id='edit-elasticsearch-query']")
	private WebElementFacade searchBar;

	@FindBy(xpath = "//*[@id='edit-submit-desktop']")
	private WebElementFacade communityLeadersSearch;
	
	/********************Mobile***********************/
	@FindBy(xpath = "//*[@id='drupal-modal']/div/div/div[3]/button")
	private WebElementFacade searchMobileCategoryButton;
	
	@FindBy(xpath = "//*[@id='edit-submit-mobile']")
	private WebElementFacade communityLeadersMobileSearch;
	                 
	@FindBy(xpath = " /html/body/div[1]/div[3]/div/section/div/div/div[1]/div[2]/div/div/a")
	private WebElementFacade refineSearch;
	
	@FindBy(xpath = "//*[contains(@id,'edit-filter-by-mobile')]/div[1]/label")
	private WebElementFacade mobileCategoryType;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-category-list-214')]")
	private WebElementFacade mobileCareerDev;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-category-list-215')]")
	private WebElementFacade mobileDisability;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-category-list-216')]")
	private WebElementFacade mobileDisaster;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-category-list-217')]")
	private WebElementFacade mobileEducation;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-category-list-218')]")
	private WebElementFacade mobileEnergy;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-category-list-219')]")
	private WebElementFacade mobileFood;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-category-list-220')]")
	private WebElementFacade mobileGrants;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-category-list-221')]")
	private WebElementFacade mobileHousing;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-category-list-222')]")
	private WebElementFacade mobileInsurance;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-category-list-223')]")
	private WebElementFacade mobileLegal;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-category-list-224')]")
	private WebElementFacade mobileLiving;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-category-list-225')]")
	private WebElementFacade mobileLoan;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-category-list-226')]")
	private WebElementFacade mobileMental;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-category-list-227')]")
	private WebElementFacade mobileSocial;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-category-list-228')]")
	private WebElementFacade mobileVeterans;
	
	@FindBy(xpath = "//*[contains(@id,'edit-filter-by-mobile')]/div[2]/label")
	private WebElementFacade mobileFederalAgency;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-agency-title-list')]/div[1]/label")
	private WebElementFacade mobileDOL;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-agency-title-list')]/div[2]/label")
	private WebElementFacade mobileDOA;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-agency-title-list')]/div[3]/label")
	private WebElementFacade mobileDHS;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-agency-title-list')]/div[4]/label")
	private WebElementFacade mobileDHHS;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-agency-title-list')]/div[5]/label")
	private WebElementFacade mobileDHUD;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-agency-title-list')]/div[6]/label")
	private WebElementFacade mobileDOI;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-agency-title-list')]/div[7]/label")
	private WebElementFacade mobileDOJ;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-agency-title-list')]/div[8]/label")
	private WebElementFacade mobileSBA;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-agency-title-list')]/div[9]/label")
	private WebElementFacade mobileSSA;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-agency-title-list')]/div[10]/label")
	private WebElementFacade mobileDOE;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-agency-title-list')]/div[11]/label")
	private WebElementFacade mobileDOT;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-agency-title-list')]/div[12]/label")
	private WebElementFacade mobileOPM;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-agency-title-list')]/div[13]/label")
	private WebElementFacade mobileVA;
	
	@FindBy(xpath = "//*[contains(@id,'edit-mobile-agency-title-list')]/div[14]/label")
	private WebElementFacade mobileUSPS;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/article/div/div/p")
	private WebElementFacade clbody;
	// *************************************************************************
	// Functions
	
	DAHomepage daHomepage;

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
	
	public void checkMobileTwitterFeed() throws FeedException {
		this.evaluateJavascript("window.scrollTo(0,document.body.scrollHeight)");

		int expected = 3;

		// NOTE(Chris):
		// Have to switch iframe to see element could cause other issues (maybe)
		List<WebElement> recentTweets = this.getDriver().switchTo().frame("twitter-widget-1")
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
		if (!twitterFeedBlock.isVisible() && !mobileTwitterFeedBlock.isVisible()) {
			throw new FeedException("Twitter feed not visible");
		}
	}

	/*************************************************************************
	 * Checks if the Community Leaders search box contains any of these
	 * keywords.
	 * 
	 *************************************************************************/
	public boolean communityResults() {
		return quickSearchResult.containsText("Community") || quickSearchResult.containsText("Recovery")
				|| quickSearchResult.containsText("housing") || quickSearchResult.containsText("Volunteers")
				|| quickSearchResult.containsText("Utilities") || quickSearchResult.containsText("infraestructura")
				|| quickSearchResult.containsText("comunidad") || quickSearchResult.containsText("gobierno")
				|| quickSearchResult.containsText("Vivienda") || quickSearchResult.containsText("Disaster");  
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
	
	public void clickMobileHowCanYouHelp() {
		this.evaluateJavascript("window.scrollBy(0,200)", "");
		howCanYouHelp.click();
	}

	public void clickInfrastructure() {
		infrastructure.click();
	}
	
	public void clickMobileInfrastructure() {
		this.evaluateJavascript("window.scrollBy(0,200)", "");
		infrastructure.click();
	}

	public void clickCategoryType() {
		categoryType.click();
	}
	
	public void clickRefineSearch() {
		refineSearch.click();
	}
	
	public void clickMobileCategoryType() {
		//clickRefineSearch();
		mobileCategoryType.click();
	}

	public void clickFederalAgency() {
		federalAgency.click();
	}
	
	public void clickMobileFederalAgency() {
		daHomepage.pause(3000);
		//clickRefineSearch();
		System.out.println(mobileFederalAgency.getText());
		mobileFederalAgency.click();
		System.out.println("I clicked the button");
	}

	public void clickMobileFirstCategoryTypes() {
		mobileCareerDev.click();
		mobileDisability.click();
		mobileDisaster.click();
		mobileEducation.click();
		mobileEnergy.click();
		mobileFood.click();
		mobileGrants.click();
		searchMobileCategoryButton.click();
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

	public void clickMobileNextCategoryTypes() {
		mobileHousing.click();
		mobileInsurance.click();
		mobileLegal.click();
		mobileLiving.click();
		WebElement element = getDriver().findElement(By.xpath("//*[contains(@id,'edit-mobile-category-list-224')]"));
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mobileLoan.click();
		mobileMental.click();
		mobileSocial.click();
		mobileVeterans.click();
		searchMobileCategoryButton.click();
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

	public void clickMobileFirstSevenFederalAgencies() {
		mobileDOL.click();
		mobileDOA.click();
		mobileDHS.click();
		mobileDHHS.click();
		mobileDHUD.click();
		mobileDOI.click();
		mobileDOJ.click();
		searchMobileCategoryButton.click();
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

	public void clickMobileNextFederalAgencies() {
		mobileSBA.click();
		mobileSSA.click();
		mobileDOE.click();
		WebElement element = getDriver().findElement(By.xpath("//*[contains(@id,'edit-mobile-agency-title-list')]/div[13]/label"));
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mobileDOT.click();
		mobileOPM.click();
		mobileVA.click();
		mobileUSPS.click();
		searchMobileCategoryButton.click();
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
	
	public String getMobileResults() {
		System.out.println(mobileResults.getText());
		return mobileResults.getText().replaceAll("\\D+","");
	}

	public void typeIntoSearchBar() {
		searchBar.click();
		searchBar.type("disaster");
		communityLeadersSearch.click();
		daHomepage.pause(2000);
	}
	
	public void typeIntoMobileSearchBar() throws AWTException {
		searchBar.click();
		searchBar.sendKeys("disaster");
		//searchBar.type("disaster");
		System.out.println("finished typing");
		daHomepage.pause(2000);
		//clbody.click();
		communityLeadersMobileSearch.click();
		daHomepage.pause(5000);
	}
}