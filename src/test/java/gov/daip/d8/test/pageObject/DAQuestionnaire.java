package gov.daip.d8.test.pageObject;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.Iterator;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class DAQuestionnaire extends PageObject {

	DAHomepage daHomepage;

	// *************************************************************************
	// FindBy / private variables section

	@FindBy(xpath = "//*[@id='questionnaire_form']/div[1]/div[2]/div/div[1]/label/input")
	private WebElementFacade employment;

	@FindBy(xpath = "//*[@id='result_count']")
	private WebElementFacade benefitCounter;

	@FindBy(xpath = "//*[@class='program_title']")
	private List<WebElementFacade> FOAExpandedResults;

	@FindBy(xpath = "//*[@type='checkbox']")
	private List<WebElementFacade> checkboxQuestionnaireButtons;

	@FindBy(id = "stateSelector")
	private WebElementFacade stateSelector;

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

	public int getResultsVal() {
		int i = Integer.parseInt(benefitCounter.getText());
		return i;
	}
}