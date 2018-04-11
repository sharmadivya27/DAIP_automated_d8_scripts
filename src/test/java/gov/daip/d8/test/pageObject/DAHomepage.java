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
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][1]")
	private WebElementFacade accountability;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][2]")
	private WebElementFacade privacy;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][3]")
	private WebElementFacade foia;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][4]")
	private WebElementFacade accessibilityFooter;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][5]")
	private WebElementFacade planWriting;

	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][6]")
	private WebElementFacade femaGov;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][7]")
	private WebElementFacade femaMobileApp;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][8]")
	private WebElementFacade readyGov;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][9]")
	private WebElementFacade dhsGov;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][10]")
	private WebElementFacade usaGov;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][11]")
	private WebElementFacade usaGovBus;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][12]")
	private WebElementFacade cfdaGov;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][13]")
	private WebElementFacade whiteHouse;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][14]")
	private WebElementFacade inspectorGeneral;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][15]")
	private WebElementFacade noFearAct;

	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][16]")
	private WebElementFacade budgetPerformance;
	
	@FindBy(xpath = "//*[@class='footer-menu-item col-md-3'][17]")
	private WebElementFacade siteMap;
	
	@FindBy(xpath = "/html/body/nav/div/div[2]/div[1]/button")
	private WebElementFacade USASearch;
	
	@FindBy(xpath = "//*[@class='desktop-usa-search-input form-control popover-content']")
	private WebElementFacade USASearchTextField;
	
	@FindBy(xpath = "//*[@class='desktop-usa-search-btn btn']")
	private WebElementFacade USASearchSubmit;
	
	@FindBy(xpath = "//*[@id='result-1']/span")
	private WebElementFacade USASearchResult;

	@FindBy(xpath = "//*[@id='btnCancel']")
	private WebElementFacade captchaCancel;
	
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
	
	public void clickCancel() {
		captchaCancel.click();
	}
	
	public void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}