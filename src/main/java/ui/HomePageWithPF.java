package ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageWithPF {

    private static final String URL = "https://www.xm.com/#";

    @FindBy(css = "#navigation-collapse .logo")
    private WebElement logo;

    @FindBy(css = "some css")
    private WebElement button;

    public HomePageWithPF() {
        PageFactory.initElements(WebDriverHandler.getDriver(), this);
    }

    public void open() {
        WebDriverHandler.openPage(URL);
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    public void waitForLogoToBeDisplayed() {
        WebDriverHandler.getWait().until(ExpectedConditions.visibilityOf(logo));
    }

    public void clickOnSubmitButton() {
        if (button.isEnabled()) {
            button.click();
            if (button.isDisplayed()) {
                throw new RuntimeException();
            }
        } else {
            throw new RuntimeException();
        }
    }
}
