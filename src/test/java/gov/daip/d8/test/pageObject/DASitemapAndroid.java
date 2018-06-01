package gov.daip.d8.test.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class DASitemapAndroid extends PageObject {

	// *************************************************************************
	// FindBy / private variables section
	
	//@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/li[1]/a")
	//private WebElementFacade home;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/li[1]/a")
	private WebElementFacade home;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[1]/a")
	private WebElementFacade addressSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[2]/a")
	private WebElementFacade findAssistanceSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[3]/a")
	private WebElementFacade applyOnlineSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[4]/a")
	private WebElementFacade checkStatusSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[5]/a")
	private WebElementFacade formsOfAssistanceSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[6]/a")
	private WebElementFacade communityLeadersSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[7]/a")
	private WebElementFacade otherHelpSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[8]/a")
	private WebElementFacade applicationChecklistSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[9]/a")
	private WebElementFacade formsSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/li[1]/a")
	private WebElementFacade newsFeedsSitemap;

	@FindBy(xpath = "/html/body/div[3]/div/section/ul[1]/ul[2]/li[2]/a")
	private WebElementFacade immediateNeedsSitemap;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[2]/li[1]/a")
	private WebElementFacade evacuateSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[2]/li[2]/a")
	private WebElementFacade lovedOnesSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[2]/li[3]/a")
	private WebElementFacade emergencyFoodSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[2]/li[4]/a")
	private WebElementFacade shelterSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[2]/li[5]/a")
	private WebElementFacade medicalSitemap;

	@FindBy(xpath = "/html/body/div[3]/div/section/ul[1]/ul[2]/li[3]/a")
	private WebElementFacade movingForwardSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[3]/li[1]/a")
	private WebElementFacade yourHomeSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[3]/li[2]/a")
	private WebElementFacade businessSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[3]/li[3]/a")
	private WebElementFacade financesSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[3]/li[4]/a")
	private WebElementFacade healthSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[3]/li[5]/a")
	private WebElementFacade officialDocumentsSitemap;

	@FindBy(xpath = "/html/body/div[3]/div/section/ul[1]/ul[2]/li[4]/a")
	private WebElementFacade disabilitiesSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[4]/li[1]/a")
	private WebElementFacade disabilitiesOnlineResources;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[4]/li[2]/a")
	private WebElementFacade disabilitiesDownload;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[4]/li[3]/a")
	private WebElementFacade disabilitiesVideos;
	
	@FindBy(xpath = "/html/body/div[3]/div/section/ul[1]/ul[2]/li[5]/a")
	private WebElementFacade olderAmericansSitemap;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[5]/li[1]/a")
	private WebElementFacade olderOnlineResources;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[5]/li[2]/a")
	private WebElementFacade olderDownload;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[5]/li[3]/a")
	private WebElementFacade olderVideos;

	@FindBy(xpath = "/html/body/div[3]/div/section/ul[1]/ul[2]/li[6]/a")
	private WebElementFacade childrenSitemap;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[1]/a")
	private WebElementFacade childrenResources;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[2]/a")
	private WebElementFacade childrenDownload;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a")
	private WebElementFacade childrenVideos;
	
	@FindBy(xpath = "/html/body/div[3]/div/section/ul[1]/ul[2]/li[7]/a")
	private WebElementFacade disasterTypesSitemap;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[1]/a")
	private WebElementFacade overview;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[2]/a")
	private WebElementFacade biologicalSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[3]/a")
	private WebElementFacade chemicalSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[4]/a")
	private WebElementFacade droughtSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[5]/a")
	private WebElementFacade earthquakeSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[6]/a")
	private WebElementFacade fireSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[7]/a")
	private WebElementFacade floodSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[8]/a")
	private WebElementFacade heatSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[9]/a")
	private WebElementFacade hurricaneSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[10]/a")
	private WebElementFacade landslideSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[11]/a")
	private WebElementFacade radiationSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[12]/a")
	private WebElementFacade tornadoSitemap;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[13]/a")
	private WebElementFacade tsunami;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[14]/a")
	private WebElementFacade volcano;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[15]/a")
	private WebElementFacade wildfires;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[16]/a")
	private WebElementFacade winterStorm;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/li[8]/a")
	private WebElementFacade foreignDisasters;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/li[9]/a")
	private WebElementFacade factSheets;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[3]/li[2]/a")
	private WebElementFacade partners;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[4]/li[1]/a")
	private WebElementFacade faqs;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[4]/li[2]/a")
	private WebElementFacade contactUs;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[4]/li[3]/a")
	private WebElementFacade privacyPolicy;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[4]/li[4]/a")
	private WebElementFacade accessibility;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/section/ul[1]/ul[4]/li[5]/a")
	private WebElementFacade downloadPlugIns;

	// *************************************************************************
	// Functions

	public void clickOnHome() {
		home.click();
	}

	public void clickAddresslookUp() {
		addressSitemap.click();
	}

	public void clickFindAssistance() {
		findAssistanceSitemap.click();
	}

	public void clickApplyOnline() {
		applyOnlineSitemap.click();
	}

	public void clickCheckStatusSitemap() {
		checkStatusSitemap.click();
	}

	public void clickFormsAssistance() {
		formsOfAssistanceSitemap.click();
	}

	public void clickCommunityLeaders() {
		communityLeadersSitemap.click();
	}

	public void clickOtherHelp() {
		otherHelpSitemap.click();
	}

	public void clickApplicationChecklist() {
		applicationChecklistSitemap.click();
	}

	public void clickForms() {
		formsSitemap.click();
	}

	public void clickNewsFeeds() {
		newsFeedsSitemap.click();
	}

	public void clickImmediateNeeds() {
		immediateNeedsSitemap.click();
	}

	public void clickEvacuate() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[9]/a");
		evacuateSitemap.click();
	}

	public void clickLovedOnes() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[9]/a");
		lovedOnesSitemap.click();
	}

	public void clickEmergencyFood() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[9]/a");
		emergencyFoodSitemap.click();
	}

	public void clickEmergencyShelter() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[9]/a");
		shelterSitemap.click();
	}

	public void emergencyMedical() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[9]/a");
		medicalSitemap.click();
	}

	public void movingForward() {
		movingForwardSitemap.click();
	}

	public void yourHome() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[9]/a");
		yourHomeSitemap.click();
	}

	public void clickBusiness() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[9]/a");
		businessSitemap.click();
	}

	public void clickFinance() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[9]/a");
		financesSitemap.click();
	}

	public void clickHealth() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[9]/a");
		healthSitemap.click();
	}

	public void clickOfficialDocs() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[9]/a");
		officialDocumentsSitemap.click();
	}

	public void clickDisabilitiesOnlineResources() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[9]/a");
		disabilitiesOnlineResources.click();
	}
	
	public void clickDisabilitiesDownload() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[9]/a");
		disabilitiesDownload.click();
	}
	
	public void clickDisabilitiesVideos() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[1]/li[9]/a");
		disabilitiesVideos.click();
	}

	public void clickOlderOnlineResources() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[4]/li[1]/a");
		olderOnlineResources.click();
	}
	
	public void clickOlderDownload() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[4]/li[1]/a");
		olderDownload.click();
	}
	
	public void clickOlderVideos() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[4]/li[1]/a");
		olderVideos.click();
	}

	public void clickChildrenOnlineResources() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[4]/li[1]/a");
		childrenResources.click();
	}
	
	public void clickChildrenDownload() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[4]/li[1]/a");
		childrenDownload.click();
	}
	
	public void clickChildrenVideos() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[4]/li[1]/a");
		childrenVideos.click();
	}

	public void clickDisasterTypes() {
		disasterTypesSitemap.click();
	}

	public void clickBiological() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		biologicalSitemap.click();
	}

	public void clickChemical() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		chemicalSitemap.click();
	}

	public void clickDrought() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		droughtSitemap.click();
	}

	public void clickEarthquake() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		earthquakeSitemap.click();
	}

	public void clickFire() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		fireSitemap.click();
	}

	public void clickFlood() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		floodSitemap.click();
	}

	public void clickHeat() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		heatSitemap.click();
	}

	public void clickHurricane() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		hurricaneSitemap.click();
	}

	public void clickLandslide() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		landslideSitemap.click();
	}

	public void clickRadiation() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		radiationSitemap.click();
	}

	public void clickTornado() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		tornadoSitemap.click();
	}

	public void clickTsunami() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		tsunami.click();
	}

	public void clickVolcano() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		volcano.click();
	}

	public void clickWildfires() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		wildfires.click();
	}

	public void clickWinterStorms() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		winterStorm.click();
	}

	public void clickForeignDisasters() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		foreignDisasters.click();
	}

	public void clickFactSheets() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		factSheets.click();
	}

	public void clickPartners() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[6]/a");
		partners.click();
	}

	public void clickFaqs() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[6]/a");
		faqs.click();
	}

	public void clickContactUs() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[6]/a");
		contactUs.click();
	}

	public void clickPrivacyPolicy() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[6]/a");
		privacyPolicy.click();
	}

	public void clickAccessibility() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[6]/a");
		accessibility.click();
	}

	public void clickDownloadPlugIns() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[7]/li[6]/a");
		downloadPlugIns.click();
	}
	
	public void clickOverview() {
		scrollTo("/html/body/div[1]/div[3]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a");
		overview.click();
	}
	public void scrollTo(String path) {
		WebElement element = getDriver().findElement(By.xpath(path));
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
