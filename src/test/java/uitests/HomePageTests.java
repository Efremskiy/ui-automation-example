package uitests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import ui.HomePage;
import ui.HomePageWithPF;
import ui.WebDriverHandler;

import static org.testng.Assert.assertTrue;

public class HomePageTests {

    @AfterMethod
    public static void afterMethod() {
        WebDriverHandler.closeBrowser();
    }

    @Test
    public void homePageSmokeTest() {
        HomePage homePage = new HomePage();
        homePage.open();
        assertTrue(homePage.isLogoDisplayed(), "Logo wasn't displayed");
    }

    @Test
    public void homePageSmokePFTest() {
        HomePageWithPF homePageWithPF = new HomePageWithPF();
        homePageWithPF.open();
        homePageWithPF.waitForLogoToBeDisplayed();
//        assertTrue(homePageWithPF.isLogoDisplayed(), "Logo wasn't displayed");
    }
}
