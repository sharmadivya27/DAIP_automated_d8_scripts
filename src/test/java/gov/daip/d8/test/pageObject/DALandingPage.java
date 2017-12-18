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

	@FindBy(xpath = "//*[@id='block-aggregatorfeed']/h3")
	private WebElementFacade hurricanes;

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

	public String hurricaneTitle() {
		return hurricanes.getText();
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
}