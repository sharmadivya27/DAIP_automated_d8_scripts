package gov.daip.d8.test.pageObject;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.concurrent.TimeUnit;

/*************************************************************************
 * Using Selenium Webdriver, this class handles web related code such as pulling
 * elements from the given site.
 *
 * @author Chris Viqueira
 * @author Divya Sharma
 *************************************************************************/

public class DAPage extends PageObject {
	
	/*********************************************/

	@FindBy(xpath = "logo")
	private WebElementFacade homeLogo;

	public void clickIcon() {
		homeLogo.click();
	}

	public String shouldSeeHome() {
		return this.getTitle();
	}

	/*********************************************/
	private String env = System.getProperty("environment");
	public String defaultUrl = "http://" + env + ".disasterassistance.gov";


	public DAPage(WebDriver driver) {
		super(driver);
		driver.manage().window().maximize(); 
		this.setImplicitTimeout(10, TimeUnit.SECONDS); 
	} 
	
	public void mobilePage() {
		getDriver().manage().window().setSize(new Dimension(500, 500));
	}    

	public void clearCookies() {
		this.getDriver().manage().deleteAllCookies();
	}
}