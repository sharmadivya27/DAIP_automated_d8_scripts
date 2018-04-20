package gov.daip.d8.test.pageObject;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
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
	
	@FindBy(xpath = "/html/body/table/tbody/tr[6]/td/a")
	private WebElementFacade checkContactUs;
	
	@FindBy(xpath = "//span[contains(., 'Disaster Assistance Center') or contains(.,'Centro de Asistencia por Desastre')]")
	private WebElementFacade dacPage;
	
	@FindBy(xpath = "//*[@id='apply_now']")
	private WebElementFacade applyNow;
	
	@FindBy(xpath = "//*[@id=\"results_next\"]")
	private WebElementFacade foaMobileNext;
	
	@FindBy(xpath = "//*[@id=\"foa_submit\"]")
	private WebElementFacade getResultsButton;
	
	@FindBy(xpath="//*[@id=\"category_select\"]")
	private WebElementFacade mobileBenefitCounter;
	

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
	
	public void getMobileFOAResultsPage() {
		daHomepage.pause(3000);
		this.evaluateJavascript("window.scrollBy(0,500)", "");
		daHomepage.pause(1000);
		this.evaluateJavascript("window.scrollBy(0,500)", "");
		daHomepage.pause(1000);
		this.evaluateJavascript("window.scrollBy(0,500)", "");
		daHomepage.pause(3000);
		this.evaluateJavascript("window.scrollBy(0,-1500)", "");
		mobileBenefitCounter.click();
		mobileBenefitCounter.click();
	}
	
	public void getSpanishFOAResultsPage() {
		daHomepage.pause(3000);
		//this.evaluateJavascript("window.scrollBy(0,500)", "");
		daHomepage.pause(1000);
		//this.evaluateJavascript("window.scrollBy(0,500)", "");
		daHomepage.pause(1000);
		//this.evaluateJavascript("window.scrollBy(0,500)", "");
		daHomepage.pause(2000);
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
		//getResultsButton.click();
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
	
	public int getMobileResultsVal() {
		//String x = getResultsButton.getText().replace("Get 63 Results", "63");
		String x = getResultsButton.getText().replaceAll("\\D+","");
		int i = Integer.parseInt(x);
		System.out.println(x);
		getResultsButton.click();
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
	
	public void clickMobileNextFOA() {
		WebElement element = getDriver().findElement(By.xpath("//*[@id=\"results_next\"]"));
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.evaluateJavascript("window.scrollBy(0,-200)", "");
		foaMobileNext.click();
	}
	
	public void clickApplyOnline() {
		applyNow.click();
	}
	
	public void clickMobileApplyOnline() {
		this.evaluateJavascript("window.scrollBy(0,-500)", "");
		applyNow.click();
	}
	
	public void clickSpanishApplyOnline() {
		daHomepage.pause(3000); 
		this.evaluateJavascript("window.scrollBy(0,-50)", "");
		applyNow.click();		
	}
	
	public boolean checkStatusPageIsDisplayed() {
		return checkStatusPageContent.isDisplayed();
	}
	
	public boolean dacPageIsDisplayed() {
		return dacPage.isDisplayed();
	}
	
	public boolean contactUsIsDisplayed() {
		return checkContactUs.isDisplayed();
	}
}