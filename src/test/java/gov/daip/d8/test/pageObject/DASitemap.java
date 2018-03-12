package gov.daip.d8.test.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class DASitemap extends PageObject {
		
	// *************************************************************************
	// FindBy / private variables section
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/li[1]/a")
	private WebElementFacade home;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[1]/li[1]/a")
	private WebElementFacade addressSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[1]/li[2]/a")
	private WebElementFacade findAssistanceSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[1]/li[3]/a")
	private WebElementFacade applyOnlineSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[1]/li[4]/a")
	private WebElementFacade checkStatusSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[1]/li[5]/a")
	private WebElementFacade formsOfAssistanceSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[1]/li[6]/a")
	private WebElementFacade communityLeadersSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[1]/li[7]/a")
	private WebElementFacade otherHelpSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[1]/li[8]/a")
	private WebElementFacade applicationChecklistSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[1]/li[9]/a")
	private WebElementFacade formsSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/li[1]/a")
	private WebElementFacade newsFeedsSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/li[2]/a")
	private WebElementFacade immediateNeedsSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[1]/li[1]/a")
	private WebElementFacade evacuateSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[1]/li[2]/a")
	private WebElementFacade lovedOnesSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[1]/li[3]/a")
	private WebElementFacade emergencyFoodSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[1]/li[4]/a")
	private WebElementFacade shelterSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[1]/li[5]/a")
	private WebElementFacade medicalSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/li[3]/a")
	private WebElementFacade movingForwardSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[2]/li[1]/a")
	private WebElementFacade yourHomeSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[2]/li[2]/a")
	private WebElementFacade businessSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[2]/li[3]/a")
	private WebElementFacade financesSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[2]/li[4]/a")
	private WebElementFacade healthSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[2]/li[5]/a")
	private WebElementFacade officialDocumentsSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/li[4]/a")
	private WebElementFacade disabilitiesSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/li[5]/a")
	private WebElementFacade olderAmericansSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/li[6]/a")
	private WebElementFacade childrenSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/li[7]/a")
	private WebElementFacade disasterTypesSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[6]/li[2]/a")
	private WebElementFacade biologicalSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[6]/li[3]/a")
	private WebElementFacade chemicalSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[6]/li[4]/a")
	private WebElementFacade droughtSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[6]/li[5]/a")
	private WebElementFacade earthquakeSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[6]/li[6]/a")
	private WebElementFacade fireSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[6]/li[7]/a")
	private WebElementFacade floodSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[6]/li[8]/a")
	private WebElementFacade heatSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[6]/li[9]/a")
	private WebElementFacade hurricaneSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[6]/li[10]/a")
	private WebElementFacade landslideSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[6]/li[11]/a")
	private WebElementFacade radiationSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[6]/li[12]/a")
	private WebElementFacade tornadoSitemap;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[6]/li[13]/a")
	private WebElementFacade tsunami;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[6]/li[14]/a")
	private WebElementFacade volcano;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[6]/li[15]/a")
	private WebElementFacade wildfires;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/ul[6]/li[16]/a")
	private WebElementFacade winterStorm;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/li[8]/a")
	private WebElementFacade foreignDisasters;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[2]/li[9]/a")
	private WebElementFacade factSheets;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[3]/li[2]/a")
	private WebElementFacade partners;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[4]/li[1]/a")
	private WebElementFacade faqs;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[4]/li[2]/a")
	private WebElementFacade contactUs;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[4]/li[3]/a")
	private WebElementFacade privacyPolicy;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[4]/li[4]/a")
	private WebElementFacade accessibility;
	
	@FindBy(xpath = "/html/body/div[4]/div/section/ul[1]/ul[4]/li[5]/a")
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
		evacuateSitemap.click();
	}
	
	public void clickLovedOnes() {
		lovedOnesSitemap.click();
	}
	
	public void clickEmergencyFood() {
		emergencyFoodSitemap.click();
	}
	
	public void clickEmergencyShelter() {
		shelterSitemap.click();
	}
	
	public void emergencyMedical() {
		medicalSitemap.click();
	}
	
	public void movingForward() {
		movingForwardSitemap.click();
	}
	
	public void yourHome() {
		yourHomeSitemap.click();
	}
	
	public void clickBusiness() {
		businessSitemap.click();
	}
	
	public void clickFinance() {
		financesSitemap.click();
	}
	
	public void clickHealth() {
		healthSitemap.click();
	}
	
	public void clickOfficialDocs() {
		officialDocumentsSitemap.click();
	}
	
	public void clickDisabilities() {
		disabilitiesSitemap.click();
	}
	
	public void clickOlderAmericans() {
		olderAmericansSitemap.click();
	}
	
	public void clickChildrenFamilies() {
		childrenSitemap.click();
	}
	
	public void clickDisasterTypes() {
		disasterTypesSitemap.click();
	}
	
	public void clickBiological() {
		biologicalSitemap.click();
	}
	
	public void clickChemical() {
		chemicalSitemap.click();
	}
	
	public void clickDrought() {
		droughtSitemap.click();
	}
	
	public void clickEarthquake() {
		earthquakeSitemap.click();
	}
	
	public void clickFire() {
		fireSitemap.click();
	}
	
	public void clickFlood() {
		floodSitemap.click();
	}
	
	public void clickHeat() {
		heatSitemap.click();
	}
	
	public void clickHurricane() {
		hurricaneSitemap.click();
	}
	
	public void clickLandslide() {
		landslideSitemap.click();
	}
	
	public void clickRadiation() {
		radiationSitemap.click();
	}
	
	public void clickTornado() {
		tornadoSitemap.click();
	}
	
	public void clickTsunami() {
		tsunami.click();
	}
	
	public void clickVolcano() {
		volcano.click();
	}
	
	public void clickWildfires() {
		wildfires.click();
	}
	
	public void clickWinterStorms() {
		winterStorm.click();
	}
	
	public void clickForeignDisasters() {
		foreignDisasters.click();
	}
	
	public void clickFactSheets() {
		factSheets.click();
	}
	
	public void clickPartners() {
		partners.click();
	}
	
	public void clickFaqs() {
		faqs.click();
	}
	
	public void clickContactUs() {
		contactUs.click();
	}
	
	public void clickPrivacyPolicy() {
		privacyPolicy.click();
	}
	
	public void clickAccessibility() {
		accessibility.click();
	}
	
	public void clickDownloadPlugIns() {
		downloadPlugIns.click();
	}
}