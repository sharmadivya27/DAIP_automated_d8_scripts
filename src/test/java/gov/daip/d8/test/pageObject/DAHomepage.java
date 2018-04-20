package gov.daip.d8.test.pageObject;

import java.util.Iterator;
import java.util.List;

import gov.daip.d8.test.exceptions.StateException;
import gov.daip.d8.test.exceptions.LocalResourcesException;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class DAHomepage extends PageObject {

	// *************************************************************************
	// FindBy / private variables section
	
	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][1]/a")
	private WebElementFacade getAssistanceTab;
	
	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][1]/ul/li[1]/a")
	private WebElementFacade addressLookUpMenu;
	
	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][1]/ul/li[2]/a")
	private WebElementFacade findAssistance;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][1]/ul/li[3]/a")
	private WebElementFacade applyOnline;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][1]/ul/li[4]/a")
	private WebElementFacade checkYourStatus;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][1]/ul/li[5]/a")
	private WebElementFacade formsOfAssistance;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][1]/ul/li[6]/a")
	private WebElementFacade communityLeaders;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][1]/ul/li[7]/a")
	private WebElementFacade otherHelp;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][1]/ul/li[8]/a")
	private WebElementFacade applicationChecklist;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][1]/ul/li[9]/a")
	private WebElementFacade forms;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][2]/a")
	private WebElementFacade informationTab;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][2]/ul/li[1]/a")
	private WebElementFacade newsFeeds;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][2]/ul/li[2]/a")
	private WebElementFacade immediateNeeds;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][2]/ul/li[3]/a")
	private WebElementFacade movingForward;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][2]/ul/li[4]/a")
	private WebElementFacade disabilities;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][2]/ul/li[5]/a")
	private WebElementFacade olderAmericans;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][2]/ul/li[6]/a")
	private WebElementFacade childrenFamilies;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][2]/ul/li[7]/a")
	private WebElementFacade disasterTypes;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][2]/ul/li[8]/a")
	private WebElementFacade foreignDisasters;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][2]/ul/li[9]/a")
	private WebElementFacade factSheets;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][3]/a")
	private WebElementFacade aboutUsTab;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][3]/ul/li[1]/a")
	private WebElementFacade overview;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][3]/ul/li[2]/a")
	private WebElementFacade partners;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][4]/a")
	private WebElementFacade helpTab;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][4]/ul/li[1]/a")
	private WebElementFacade faqs;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][4]/ul/li[2]/a")
	private WebElementFacade contactUs;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][4]/ul/li[3]/a")
	private WebElementFacade privacyPolicy;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][4]/ul/li[4]/a")
	private WebElementFacade accessibility;

	@FindBy(xpath = "//*[@class='desktop-main-menu-dropdown dropdown'][4]/ul/li[5]/a")
	private WebElementFacade downloadPlugIns;

	@FindBy(xpath = "//*[@class='header-page-title col-md-12']")
	private WebElementFacade pageTitle;

	@FindBy(xpath = "//*[@class='basic-page-label']")
	private WebElementFacade pageSubtitle;

	@FindBy(xpath = "//*//div[@class='address-lookup']")
	private WebElementFacade addressLookup;

	@FindBy(xpath = "//*[@id='svg2']")
	private WebElementFacade disasterMap;

	@FindBy(xpath = "//*[@class='state single-state-group selected']")
	private List<WebElementFacade> disasterStates;

	@FindBy(xpath = "//*[@class='state']")
	private List<WebElementFacade> greyStates;

	@FindBy(xpath = "//*[@id=\"local-resources-input\"]")
	private WebElementFacade localResourcesTextbox;

	@FindBy(xpath = "//*[@id='local-resources-button']")
	private WebElementFacade localResourcesSearch;

	@FindBy(xpath = "//*[@class='location-item clickable']")
	private List<WebElementFacade> localResourcesResults;

	@FindBy(xpath = "//*[@id='block-imagelinksblock']/div/div/a[1]/div/div/img")
	private WebElementFacade assistanceMainLink;

	@FindBy(xpath = "//*[@id='block-imagelinksblock']/div/div/a[2]/div/div/img")
	private WebElementFacade applyOnlineMainLink;

	@FindBy(xpath = "//*[@id='block-imagelinksblock']/div/div/a[3]/div/div/img")
	private WebElementFacade checkStatusMainLink;

	@FindBy(xpath = "//*[@id='block-questionnaireblock']")
	private WebElementFacade questionnaire;

	@FindBy(xpath = "//*[@id='pageContent']")
	private WebElementFacade checkStatusPageContent;

	@FindBy(xpath = "//span[contains(., 'Disaster Assistance Center') or contains(.,'Centro de Asistencia por Desastre')]")
	private WebElementFacade dacPage;

	@FindBy(xpath = "/html/body/pre")
	private WebElementFacade declaredDisasterDAC;

	@FindBy(xpath = "//*[@id='disaster-lookup-search']")
	private WebElementFacade addressLookUpTextField;

	@FindBy(xpath = "//*[@id='disaster-lookup-submit']")
	private WebElementFacade addressLookUpButton;

	@FindBy(xpath = "//*[@id='desktop-disaster-table']/table/tbody/tr/td[2]/a")
	private WebElementFacade disasterName;
	
	@FindBy(xpath = "//*[@id='mobile-disaster-table']/tbody/tr[3]/td/a")
	private WebElementFacade disasterMobileName;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][1]")
	private WebElementFacade accountability;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][5]")
	private WebElementFacade privacy;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][9]")
	private WebElementFacade foia;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][13]")
	private WebElementFacade accessibilityFooter;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][17]")
	private WebElementFacade planWriting;

	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][2]")
	private WebElementFacade femaGov;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][6]")
	private WebElementFacade femaMobileApp;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][10]")
	private WebElementFacade readyGov;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][14]")
	private WebElementFacade dhsGov;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][3]")
	private WebElementFacade usaGov;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][7]")
	private WebElementFacade usaGovBus;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][11]")
	private WebElementFacade cfdaGov;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][15]")
	private WebElementFacade whiteHouse;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][4]")
	private WebElementFacade inspectorGeneral;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][8]")
	private WebElementFacade noFearAct;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][12]")
	private WebElementFacade budgetPerformance;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][16]")
	private WebElementFacade siteMap;
	
	@FindBy(xpath = "/html/body/nav/div/div[2]/div[1]/button")
	private WebElementFacade USASearch;
	
	@FindBy(xpath = "//*[@class='desktop-usa-search-input form-control popover-content']")
	private WebElementFacade USASearchTextField;
	
	@FindBy(xpath = "//*[@class='desktop-usa-search-btn btn']")
	private WebElementFacade USASearchSubmit;
	
	@FindBy(xpath = "//*[@id='result-1']/span")
	private WebElementFacade USASearchResult;
	
	/***********Mobile Code****************/
	              
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[1]/button")
	private WebElementFacade navMenu;
	                  
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[1]/a")
	private WebElementFacade getMobileHomeTab;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[2]/a")
	private WebElementFacade getMobileAssistanceTab;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[2]/ul/li[1]/a")
	private WebElementFacade getMobileAddressLookUp;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[2]/ul/li[2]/a")
	private WebElementFacade getMobileFindAssistance;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[2]/ul/li[3]/a")
	private WebElementFacade getMobileApplyOnline;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[2]/ul/li[4]/a")
	private WebElementFacade getMobileCheckYourStatus;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[2]/ul/li[5]/a")
	private WebElementFacade getMobileFormsOfAssistance;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[2]/ul/li[6]/a")
	private WebElementFacade getMobileCommunityLeaders;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[2]/ul/li[7]/a")
	private WebElementFacade getMobileOtherRecoveryHelp;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[2]/ul/li[8]/a")
	private WebElementFacade getMobileApplicationChecklist;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[2]/ul/li[9]/a")
	private WebElementFacade getMobileForms;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[3]/a")
	private WebElementFacade getMobileInformationTab;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[3]/ul/li[1]/a")
	private WebElementFacade getMobileNewsFeeds;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[3]/ul/li[2]/a")
	private WebElementFacade getMobileImmediateNeeds;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[3]/ul/li[3]/a")
	private WebElementFacade getMobileMovingForward;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[3]/ul/li[4]/a")
	private WebElementFacade getMobileDisabilitiesOrAccess;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[3]/ul/li[5]/a")
	private WebElementFacade getMobileOlderAmericans;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[3]/ul/li[6]/a")
	private WebElementFacade getMobileChildrenAndFamilies;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[3]/ul/li[7]/a")
	private WebElementFacade getMobileDisasterTypes;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[3]/ul/li[8]/a")
	private WebElementFacade getMobileForeignDisasters;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[3]/ul/li[9]/a")
	private WebElementFacade getMobileFactSheets;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[4]/a")
	private WebElementFacade getMobileAboutUsTab;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[4]/ul/li[1]/a")
	private WebElementFacade getMobileOverview;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[4]/ul/li[2]/a")
	private WebElementFacade getMobilePartners;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[5]/a")
	private WebElementFacade getMobileHelpTab;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[5]/ul/li[1]/a")
	private WebElementFacade getMobileFaqs;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[5]/ul/li[2]/a")
	private WebElementFacade getMobileContactUs;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[5]/ul/li[3]/a")
	private WebElementFacade getMobilePrivacyPolicy;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[5]/ul/li[4]/a")
	private WebElementFacade getMobileAccessibility;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/nav/ul/li[5]/ul/li[5]/a")
	private WebElementFacade getMobileDownloadPlugins;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/div[2]/a")
	private WebElementFacade getMobileSpanish;
	
	@FindBy(xpath = "//*[@id=\"logo\"]")
	private WebElementFacade disasterAssistanceLogo;
	
	@FindBy(xpath = "//*[@id=\"addressLookupSearchHelpBlock\"]/label")
	private WebElementFacade addressBody;
	
	@FindBy(xpath = "//*[@id=\"disaster-lookup-submit\"]")
	private WebElementFacade mobileSearchButton;
	
	// *************************************************************************
	// Functions

	public void mouseOverGetAssistanceTab() {
		/*
		 * Actions action = new Actions(getDriver());
		 * action.moveToElement(getAssistanceTab).perform();
		 */
		getAssistanceTab.click();
	}

	public void clickAddressLookUp() {
		pause(2000);
		mouseOverGetAssistanceTab();
		addressLookUpMenu.click();
	}

	public void clickFindAssistance() {
		mouseOverGetAssistanceTab();
		findAssistance.click();
	}

	public void clickApplyOnline() {
		mouseOverGetAssistanceTab();
		applyOnline.click();
	}

	public void clickCheckYourStatus() {
		mouseOverGetAssistanceTab();
		checkYourStatus.click();
	}

	public void clickFormsOfAssistance() {
		mouseOverGetAssistanceTab();
		formsOfAssistance.click();
	}

	public void clickCommLeaders() {
		mouseOverGetAssistanceTab();
		communityLeaders.click();
	}

	public void clickOtherHelp() {
		mouseOverGetAssistanceTab();
		otherHelp.click();
	}

	public void clickApplicationChecklist() {
		mouseOverGetAssistanceTab();
		applicationChecklist.click();
	}

	public void clickForms() {
		mouseOverGetAssistanceTab();
		forms.click();
	}

	public void mouseOverInfoTab() {
		informationTab.click();
	}

	public void clickNewsFeeds() {
		mouseOverInfoTab();
		newsFeeds.click();
	}

	public void clickImmediateNeeds() {
		mouseOverInfoTab();
		immediateNeeds.click();
	}

	public void clickMovingForward() {
		mouseOverInfoTab();
		movingForward.click();
	}

	public void clickDisabilities() {
		mouseOverInfoTab();
		disabilities.click();
	}

	public void clickOlderAmericans() {
		mouseOverInfoTab();
		olderAmericans.click();
	}

	public void clickChildrenAndFamilies() {
		mouseOverInfoTab();
		childrenFamilies.click();
	}

	public void clickDisasterTypes() {
		mouseOverInfoTab();
		disasterTypes.click();
	}

	public void clickForeignDisasters() {
		mouseOverInfoTab();
		foreignDisasters.click();
	}

	public void clickFactSheets() {
		mouseOverInfoTab();
		factSheets.click();
	}

	public void mouseOverAboutTab() {
		aboutUsTab.click();
	}

	public void clickOverview() {
		mouseOverAboutTab();
		overview.click();
	}

	public void clickPartners() {
		mouseOverAboutTab();
		partners.click();
	}

	public void mouseOverHelpTab() {
		helpTab.click();
	}

	public void clickFaqs() {
		mouseOverHelpTab();
		faqs.click();
	}

	public void clickContactUs() {
		mouseOverHelpTab();
		contactUs.click();
	}

	public void clickPrivacyPolicy() {
		mouseOverHelpTab();
		privacyPolicy.click();
	}

	public void clickAccessibility() {
		mouseOverHelpTab();
		accessibility.click();
	}

	public void clickDownload() {
		mouseOverHelpTab();
		downloadPlugIns.click();
	}

	public String pullPageTitle() {
		return pageTitle.getText();
	}

	public String pullPageSubTitle() {
		return pageSubtitle.getText();
	}

	public boolean addressLookupIsDisplayed() {
		return addressLookup.isDisplayed();
	}

	public void lookUpLocation() {
		pause(4000);
		localResourcesTextbox.sendKeys("New York, NY");
		localResourcesSearch.click();
	}
	
	public void clickAccountability() {
		accountability.click();
	}
	
	public void clickFemaGov() {
		femaGov.click();
	}
	
	public void clickUsaGov() {
		usaGov.click();
	}
	
	public void clickInspectorGeneral() {
		inspectorGeneral.click();
	}
	
	public void clickPrivacy() {
		privacy.click();
	}

	public void clickFemaMobileApp() {
		femaMobileApp.click();
	}
	
	public void clickUsaGovBus() {
		usaGovBus.click();
	}
	
	public void clickNoFearAct() {
		noFearAct.click();
	}
	
	public void clickFoia() {
		foia.click();
	}
	
	public void clickReadyGov() {
		readyGov.click();
	}
	
	public void clickCfdaGov() {
		cfdaGov.click();
	}
	
	public void clickBudgetPerformance() {
		budgetPerformance.click();
	}
	
	public void clickAccessibilityFooter() {
		accessibilityFooter.click();
	}
	
	public void clickDhsGov() {
		dhsGov.click();
	}
	
	public void clickWhiteHouse() {
		whiteHouse.click();
	}
	
	public void clickSiteMap() {
		siteMap.click();
	}
	
	public void clickPlanWriting() {
		planWriting.click();
	}
	
	
	/*********** Mobile code************/
	
	public void clickNavMenu() {
		navMenu.click();
	}
	
	public void clickMobileHome() {
		getMobileHomeTab.click();
	}
	
	public void clickMobileAssistance() {
		getMobileAssistanceTab.click();
	}
	
	public void clickMobileInformation() {
		getMobileInformationTab.click();
	}
	
	public void clickMobileAboutUs() {
		getMobileAboutUsTab.click();
	}
	
	public void clickMobileHelp() {
		getMobileHelpTab.click();
	}
	
	public void clickMobileAddressLookUp() {
		getMobileAddressLookUp.click();
	}
	
	public void clickMobileFindAssistance() {
		getMobileFindAssistance.click();
	}
	
	public void clickMobileApplyOnline() {
		getMobileApplyOnline.click();
	}
	
	public void clickMobileCheckYourStatus() {
		getMobileCheckYourStatus.click();
	}
	
	public void clickMobileFormsOfAssistance() {
		getMobileFormsOfAssistance.click();
	}
	
	public void clickMobileCommunityLeaders() {
		getMobileCommunityLeaders.click();
	}
	
	public void clickMobileOtherRecoveryHelp() {
		getMobileOtherRecoveryHelp.click();
	}
	
	public void clickMobileApplicationChecklist() {
		getMobileApplicationChecklist.click();
	}
	
	public void clickMobileForms() {
		getMobileForms.click();
	}
	
	public void clickMobileNewsFeeds() {
		getMobileNewsFeeds.click();
	}
	
	public void clickMobileImmediateNeeds() {
		getMobileImmediateNeeds.click();
	}
	
	public void clickMobileMovingFoward() {
		getMobileMovingForward.click();
	}
	
	public void clickMobileDiabilitiesorAccess() {
		getMobileDisabilitiesOrAccess.click();
	}
	
	public void clickMobileOlderAmericans() {
		getMobileOlderAmericans.click();
	}
	
	public void clickMobileChildrenAndFamilies() {
		getMobileChildrenAndFamilies.click();
	}
	
	public void clickMobileDisasterTypes() {
		getMobileDisasterTypes.click();
	}
	
	public void clickMobileForeignDisasters() {
		getMobileForeignDisasters.click();
	}
	
	public void clickMobileFactSheets() {
		getMobileFactSheets.click();
	}
	
	public void clickMobileOverview() {
		getMobileOverview.click();
	}
	
	public void clickMobilePartners() {
		getMobilePartners.click();
	}
	
	public void clickMobileFaqs() {
		getMobileFaqs.click();
	}
	
	public void clickMobileContactUs() {
		getMobileContactUs.click();
	}
	
	public void clickMobilePrivacyPolicy() {
		getMobilePrivacyPolicy.click();
	}
	
	public void clickMobileAccessibility() {
		getMobileAccessibility.click();
	}
	
	public void clickMobileDownloadPlugins() {
		getMobileDownloadPlugins.click();
	}
	
	public void clickMobileSpanish() {
		getMobileSpanish.click();
	}
	
	public void clickMobileSearch() {
		mobileSearchButton.click();
	}
	
	/*************************************************************************
	 * Verifies that local resources results are visible and appear on the
	 * homepage.
	 * 
	 *************************************************************************/
	public void verifyLocalResourcesResults() throws LocalResourcesException {
		Iterator<WebElementFacade> localResourcesIter = localResourcesResults.iterator();
		while (localResourcesIter.hasNext()) {
			WebElementFacade resource = localResourcesIter.next();
			if (!resource.isVisible()) {
				throw new LocalResourcesException("Local resource not visible");
			}
		}
	}

	/*************************************************************************
	 * Verifies that the disaster map is visible on the homepage.
	 * 
	 *************************************************************************/
	public void checkDisasterMap() throws StateException {
		this.evaluateJavascript("arguments[0].scrollIntoView(true);", disasterMap);

		if (!disasterMap.isVisible()) {
			throw new StateException("Disaster map not visible");
		}
	}

	/*************************************************************************
	 * Checks if all states with disasters are clickable on the disaster map and
	 * if all other states are visible.
	 * 
	 *************************************************************************/
	public void checkStates() throws StateException {
		Iterator<WebElementFacade> disasterStateIter = disasterStates.iterator();
		Iterator<WebElementFacade> greyStateIter = greyStates.iterator();
		while (disasterStateIter.hasNext()) {
			WebElementFacade state = disasterStateIter.next();
			if (!state.isEnabled()) {
				throw new StateException("Unclickable state.");
			}
		}
		while (greyStateIter.hasNext()) {
			WebElementFacade state = greyStateIter.next();
			if (!state.isVisible()) {
				throw new StateException("State not visible.");
			}
		}
	}

	/*************************************************************************
	 * Checks the currently declared disasters in edit.
	 * 
	 *************************************************************************/
	String editState;

	public String checkDisasterStatesEdit() {
		getDriver().get("https://edit.disasterassistance.gov/");
		for (int i = 0; i < disasterStates.size(); i++) {
			editState += disasterStates.get(i).getText().replaceAll("to see if your county is in a declared area", "")
					.replaceAll("Select", "");
		}
		return editState;
	}

	/*************************************************************************
	 * Checks the currently declared disasters in edit in Spanish.
	 * 
	 *************************************************************************/
	public String checkSpanishDisasterStatesEdit() {
		//FIX THIS !!! 
		getDriver().get("https://edit.disasterassistance.gov/es");
		for (int i = 0; i < disasterStates.size(); i++) {
			editState += disasterStates.get(i).getText().replaceAll("to see if your county is in a declared area", "")
					.replaceAll("Select", "").replaceAll("daip_disaster_map_select_desc", "")
					.replaceAll("daip_disaster_map_select", "");
		}
		pause(2000);
		return editState;
	}

	/*************************************************************************
	 * Checks the currently declared disasters in prod.
	 * 
	 *************************************************************************/
	String state;
	//FIX THIS !!!!
	public String checkDisasterStates() {
		for (int i = 0; i < disasterStates.size(); i++) {
			state += disasterStates.get(i).getText().replaceAll("to see if your county is in a declared area", "")
					.replaceAll("Select", "").replaceAll("daip_disaster_map_select_desc", "")
					.replaceAll("daip_disaster_map_select", "");
		}
		pause(2000);
		return state; 
	}

	/*************************************************************************
	 * Finds the second declared disaster state on the DAC feed.
	 * 
	 *************************************************************************/
	public String getDeclaredDisasterState() {
		String declaredStates = declaredDisasterDAC.getText();
		String[] states = declaredStates.split(",");
		state = states[1].replaceAll("\"", "").replaceAll("]", "");
		this.openAt("https://www.disasterassistance.gov/drupal_api/declaredCounties/" + state);
		return state;
	}

	/*************************************************************************
	 * Finds the second declared disaster county on the DAC feed.
	 * 
	 *************************************************************************/
	public String getDeclaredDisasterCounty() {
		String declaredCounties = declaredDisasterDAC.getText();
		String[] counties = declaredCounties.split(",");
		return counties[1].replaceAll("\"", "");
	}

	/*************************************************************************
	 * Types the declared disaster state and county into the Address Look-up
	 * search field.
	 * 
	 *************************************************************************/
	public void typeAddressLookUp() {
		String state = getDeclaredDisasterState();
		String county = getDeclaredDisasterCounty();
		this.openAt("https://www.disasterassistance.gov");
		addressLookUpTextField.click();
		addressLookUpTextField.type(county + "," + state);
		addressLookUpButton.click();
		pause(4000);
	}
	
	/*************************************************************************
	 * Types the declared disaster state and county into the Address Look-up
	 * search field from the Address Look-Up page.
	 * 
	 *************************************************************************/
	public void typeAddressLookUpPage() {
		String state = getDeclaredDisasterState();
		String county = getDeclaredDisasterCounty();
		this.openAt("https://www.disasterassistance.gov/get-assistance/address-lookup");
		addressLookUpTextField.click();
		addressLookUpTextField.type(county + "," + state);
		addressLookUpButton.click();
		pause(4000);
	}
	
	/*************************************************************************
	 * Types the declared disaster state and county into the Address Look-up
	 * search field from the Address Look-Up page.
	 * 
	 *************************************************************************/
	public void typeMobileAddressLookUpPage() {
		String state = getDeclaredDisasterState();
		String county = getDeclaredDisasterCounty();
		this.openAt("https://www.disasterassistance.gov/get-assistance/address-lookup");
		addressLookUpTextField.click();
		addressLookUpTextField.type(county + "," + state);
		addressBody.click();
		mobileSearchButton.click();
		pause(4000);
	}

	/*************************************************************************
	 * Types the declared disaster state and county into the Spanish Address
	 * Look-up search field.
	 * 
	 *************************************************************************/
	public void typeSpanishAddressLookUp() {
		String state = getDeclaredDisasterState();
		String county = getDeclaredDisasterCounty();
		this.openAt("https://www.disasterassistance.gov/es");
		addressLookUpTextField.click();
		addressLookUpTextField.type(county + "," + state);
		addressLookUpButton.click();
		pause(4000);
	}
	
	/*************************************************************************
	 * Types the declared disaster state and county into the Address Look-up
	 * search field from the Address Look-Up page.
	 * 
	 *************************************************************************/
	public void typeAddressLookUpPageSpanish() {
		String state = getDeclaredDisasterState();
		String county = getDeclaredDisasterCounty();
		this.openAt("https://www.disasterassistance.gov/es/obtener-asistencia/buscador-de-direcciones");
		addressLookUpTextField.click();
		addressLookUpTextField.type(county + "," + state);
		addressLookUpButton.click();
		pause(4000);
	}

	/*************************************************************************
	 * Checks if the state and county typed has a current disaster.
	 * 
	 *************************************************************************/
	public boolean disasterAppears() {
		return disasterName.isDisplayed();
	}
	
	public boolean disasterMobileAppears() {
		return disasterMobileName.isDisplayed();
	}

	public void clickAssistanceMainLink() {
		assistanceMainLink.click();
	}

	public void clickApplyOnlineMainLink() {
		applyOnlineMainLink.click();
	}

	public void clickCheckStatusMainLink() {
		checkStatusMainLink.click();
	}

	public boolean questionnaireIsDisplayed() {
		return questionnaire.isDisplayed();
	}

	public boolean checkStatusPageIsDisplayed() {
		return checkStatusPageContent.isDisplayed();
	}

	public boolean dacPageIsDisplayed() {
		return dacPage.isDisplayed();
	}
	
	public boolean disasterAssistanceIsDisplayed() {
		return disasterAssistanceLogo.isDisplayed();
	}
	
	public String getUrl() {
		return getDriver().getCurrentUrl();
	}
	
	public boolean URLMobileFlag() {
		return getUrl().contains("mobileBrowser=True"); 
	}
	
	/*************************************************************************
	 * Types the pre/early declared disaster state and county into the Address 
	 * Look-up search field.
	 * 
	 *************************************************************************/
	public void typePreAddressLookUp() {
		String state = getDeclaredDisasterState();
		this.openAt("https://www.disasterassistance.gov");
		addressLookUpTextField.click();
		addressLookUpTextField.type(state);
		addressLookUpButton.click();
		pause(4000);
	}
	
	/*************************************************************************
	 * Finds the pre/early declared disaster state on the DAC feed.
	 * 
	 *************************************************************************/
	public String getPreDeclaredDisasterState() {
		String declaredStates = declaredDisasterDAC.getText();
		String[] states = declaredStates.split(",");
		state = states[1].replaceAll("\"", "").replaceAll("]", "");
		this.openAt("https://www.disasterassistance.gov/drupal_api/declaredCounties/" + state);
		return state;
	}
	
	public void typeIntoUSASearch() {
		USASearch.click();
		USASearchTextField.click();
		USASearchTextField.type("disaster");
		USASearchSubmit.click();
	}
	
	public boolean viewUSASearchResults() {
		return USASearchResult.isCurrentlyVisible();  
	}
	
	public void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/*************************************************************************
	 * Finds if nav menu items are visible in mobile.
	 * 
	 *************************************************************************/
	public boolean getHomeTabVisible() {
		return getMobileHomeTab.isVisible();
	}
	
	public boolean getAssistanceTabVisible() {
		return getMobileAssistanceTab.isVisible();
	}
	
	public boolean getInformationTabVisible() {
		return getMobileInformationTab.isVisible();
	}
	
	public boolean getAboutUsTabVisible() {
		return getMobileAboutUsTab.isVisible();
	}
	
	public boolean getHelpTabVisible() {
		return getMobileHelpTab.isVisible();
	}
	
	public boolean getAddressLookUpVisible() {
		return getMobileAddressLookUp.isVisible();
	}
	
	public boolean getFindAssistanceVisible() {
		return getMobileFindAssistance.isVisible();
	}
	
	public boolean getApplyOnlineVisible() {
		return getMobileApplyOnline.isVisible();
	}
	
	public boolean getCheckYourStatusVisible() {
		return getMobileCheckYourStatus.isVisible();
	}
	
	public boolean getFormsOfAssistanceVisible() {
		return getMobileFormsOfAssistance.isVisible();
	}
	
	public boolean getCommunityLeadersVisible() {
		return getMobileCommunityLeaders.isVisible();
	}
	
	public boolean getOtherRecoveryHelpVisible() {
		return getMobileOtherRecoveryHelp.isVisible();
	}
	
	public boolean getApplicationChecklistVisible() {
		return getMobileApplicationChecklist.isVisible();
	}
	
	public boolean getFormsVisible() {
		return getMobileForms.isVisible();
	}
	
	public boolean getNewsFeedsVisible() {
		return getMobileNewsFeeds.isVisible();
	}
	
	public boolean getImmediateNeedsVisible() {
		return getMobileImmediateNeeds.isVisible();
	}
	
	public boolean getMovingForwardVisible() {
		return getMobileMovingForward.isVisible();
	}
	
	public boolean getDisabilitiesOrAccessVisible() {
		return getMobileDisabilitiesOrAccess.isVisible();
	}
	
	public boolean getOlderAmericansVisible() {
		return getMobileOlderAmericans.isVisible();
	}
	
	public boolean getChildrenAndFamiliesVisible() {
		return getMobileChildrenAndFamilies.isVisible();
	}
	
	public boolean getDisasterTypesVisible() {
		return getMobileDisasterTypes.isVisible();
	}
	
	public boolean getForeignDisastersVisible() {
		return getMobileForeignDisasters.isVisible();
	}
	
	public boolean getFactSheetsVisible() {
		return getMobileFactSheets.isVisible();
	}
	
	public boolean getOverviewVisible() {
		return getMobileOverview.isVisible();
	}
	
	public boolean getPartnersVisible() {
		return getMobilePartners.isVisible();
	}
	
	public boolean getFaqsVisible() {
		return getMobileFaqs.isVisible();
	}
	
	public boolean getContactUsVisible() {
		return getMobileContactUs.isVisible();
	}
	
	public boolean getPrivacyPolicyVisible() {
		return getMobilePrivacyPolicy.isVisible();
	}
	
	public boolean getAccessibilityVisible() {
		return getMobileAccessibility.isVisible();
	}
	
	public boolean getDownloadPluginsVisible() {
		return getMobileDownloadPlugins.isVisible();
	}
	
	public boolean getSpanishVisible() {
		return getMobileSpanish.isVisible();
	}
}