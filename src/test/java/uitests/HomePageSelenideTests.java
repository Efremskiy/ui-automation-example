package uitests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import ui.HomePageSelenide;
import ui.WebDriverHandlerSelenide;

import static org.testng.Assert.assertTrue;

public class HomePageSelenideTests {

    @AfterMethod
    public void afterMethod() {
        WebDriverHandlerSelenide.closeBrowser();
    }

    @Test
    public void test() {
        HomePageSelenide homePageSelenide = new HomePageSelenide();
        homePageSelenide.open();
        homePageSelenide.waitForLogoToBeDisplayed();
        assertTrue(homePageSelenide.isLogoDisplayed());
    }
}
