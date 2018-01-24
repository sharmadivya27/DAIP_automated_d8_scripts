package gov.daip.d8.test.pageObject;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class DAQuestionnaire extends PageObject {

	DAHomepage daHomepage;

	// *************************************************************************
	// FindBy / private variables section

	@FindBy(xpath = "//*[@id='2211_1']")
	private WebElementFacade employment;

	@FindBy(xpath = "//*[@id='result_count']")
	private WebElementFacade benefitCounter;

	@FindBy(xpath = "//*[@class='program_title']")
	private List<WebElementFacade> FOAExpandedResults;

	@FindBy(xpath = "//*[@type='checkbox']")
	private List<WebElementFacade> checkboxQuestionnaireButtons;

	@FindBy(id = "stateSelector")
	private WebElementFacade stateSelector;
	
	@FindBy(xpath = "//div[@class='panel-heading']")
	private List<WebElementFacade> FOAChecklistAccordions;
	
	@FindBy(xpath = "//*[@class[contains(., 'col-xs-offset-2')]]")
	//@FindBy(xpath = "//*[@id='results_next']")
	private List<WebElementFacade> FOAfooter;
	
	@FindBy(xpath = "//*[@id='pageContent']")
	private WebElementFacade checkStatusPageContent;
	
	@FindBy(xpath = "//span[contains(., 'Disaster Assistance Center') or contains(.,'Centro de Asistencia por Desastre')]")
	private WebElementFacade dacPage;
	
	@FindBy(xpath = "//*[@id='apply_now']")
	private WebElementFacade applyNow;

	// *************************************************************************
	// Functions

	public void clickEmploymentCheckbox() {
		employment.click();
	}

	public void getFOAResultsPage() {
		daHomepage.pause(3000);
		this.evaluateJavascript("window.scrollBy(0,500)", "");
		daHomepage.pause(1000);
		this.evaluateJavascript("window.scrollBy(0,500)", "");
		daHomepage.pause(1000);
		this.evaluateJavascript("window.scrollBy(0,500)", "");
		daHomepage.pause(3000);
		benefitCounter.click();
	}

	public int getNumQuesResults() {
		daHomepage.pause(3000);
		return FOAExpandedResults.size();
	}

	/*************************************************************************
	 * Completes the entire FOA questionnaire checking every box, saying yes to
	 * every question, and picking a state.
	 * 
	 *************************************************************************/
	public void completeFullQuestionnaire() {
		//FIXME does not include yes/no buttons 
		daHomepage.pause(8000);
		Iterator<WebElementFacade> iter = checkboxQuestionnaireButtons.iterator();
		while (iter.hasNext()) {
			WebElementFacade temp = iter.next();
			temp.click();
			this.evaluateJavascript("window.scrollBy(0,50)", "");
		}
		stateSelector.sendKeys("Alabama");
		this.evaluateJavascript("window.scrollBy(0,50)", "");
		//////////// getResultsButton.click();
	} 
	
	/*************************************************************************
	 * Opens and closes each accordion on the final page of the questionnaire
	 * and returns the number of content sections it could see
	 * 
	 * @return number of content sections visible
	 *************************************************************************/
	public int numApplyOnlineFOAs() {
		Iterator<WebElementFacade> iter = FOAChecklistAccordions.iterator();
		int contentCounter = 0;

		while (iter.hasNext()) {
			WebElementFacade accordion = iter.next();

			if (accordion.isDisplayed()) {
				contentCounter++;
			}

		}

		return contentCounter;

	}
	
	public int getnumApplyOnlineFOA() {
		return FOAChecklistAccordions.size();
	}

	public int getResultsVal() {
		int i = Integer.parseInt(benefitCounter.getText());
		return i;
	}
	
	public int getNumEmploymentResults() {
		return FOAExpandedResults.size();
	}
	
	public List<WebElement> getFOAFooter() {
		return this.getDriver()
				.findElements(By.xpath("//*[@class[contains(., 'col-xs-offset-2')]]"));
	}
	
	public void clickNextFOA() {
		List<WebElement> footer = getFOAFooter();
		footer.get(footer.size() - 1).click();
	}
	
	public void clickApplyOnline() {
		applyNow.click();
	}
	
	public boolean checkStatusPageIsDisplayed() {
		return checkStatusPageContent.isDisplayed();
	}
	
	public boolean dacPageIsDisplayed() {
		return dacPage.isDisplayed();
	}
}