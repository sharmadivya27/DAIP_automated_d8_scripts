package gov.daip.d8.test.pageObject;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.ArrayList;
import java.util.List;
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
		//driver.manage().window().maximize(); 
		this.setImplicitTimeout(10, TimeUnit.SECONDS); 
	} 
	
	public void mobilePage() {
		getDriver().manage().window().setSize(new Dimension(500, 500));
	}    

	public void clearCookies() {
		this.getDriver().manage().deleteAllCookies();
	}
	
	public String processWindows() {
        // Store the current window handle
        String winHandleBefore = getDriver().getWindowHandle();
        
        // Perform the click operation that opens new window

        // Switch to new window opened
        List<String> browserTabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(browserTabs.get(1));
    
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("page loading");
            } catch (InterruptedException e) {
            }
            // To check page ready state.
            if (!getDriver().getCurrentUrl().equals("about:blank")) {
                System.out.println("done");
                break;    
            }
        }
    
        // Perform the actions on new window
        Serenity.takeScreenshot();
        String windowUrl = getDriver().getCurrentUrl();
        System.out.println(windowUrl);

        // Close the new window, if that window no more required
        getDriver().close();
        
        // Switch back to original browser (first window)
        getDriver().switchTo().window(winHandleBefore);

        // Continue with original browser (first window)
        return windowUrl;
        
    }
}