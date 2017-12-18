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
	
	@FindBy(xpath = "//*[@id='block-imagelinksblock']/div/div/div[1]/div/a/img")
	private WebElementFacade assistanceMainLink;
	
	@FindBy(xpath = "//*[@id='block-imagelinksblock']/div/div/div[2]/div/a/img")
	private WebElementFacade applyOnlineMainLink;
	
	@FindBy(xpath = "//*[@id='block-imagelinksblock']/div/div/div[3]/div/a/img")
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
	
	// *************************************************************************
	// Functions
	
	public void lookUpLocation() {
		pause(4000);
		localResourcesTextbox.sendKeys("New York, NY");
		localResourcesSearch.click();
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
		getDriver().get("https://edit.staging.disasterassistance.gov/");
		for (int i = 0; i < disasterStates.size(); i++) {
			editState += disasterStates.get(i).getText().replaceAll("to see if your county is in a declared area", "")
					.replaceAll("Select", "");
		}
		return editState;
	}
	
	/*************************************************************************
	 * Checks the currently declared disasters in prod.  
	 * 
	*************************************************************************/
	String state; 

	public String checkDisasterStates() {   
		for (int i = 0; i < disasterStates.size(); i++) {
			state += disasterStates.get(i).getText().replaceAll("to see if your county is in a declared area", "")
					.replaceAll("Select", "");
		}
		return state;
	}
	
	/*************************************************************************
	 * Finds the second declared disaster state on the DAC feed. 
	 * 
	*************************************************************************/
	public String getDeclaredDisasterState() {
		String declaredStates =  declaredDisasterDAC.getText();
		String[] states = declaredStates.split(",");
		state = states[1].replaceAll("\"", "");
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
		this.openAt("https://staging.disasterassistance.gov/?mobile=unL9HuS");
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
	
	public void pause(long time) {
		try { 
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace(); 
		}
	}
}