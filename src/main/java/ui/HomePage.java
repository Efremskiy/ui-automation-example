package ui;

import org.openqa.selenium.By;

public class HomePage {

    private static final String URL = "https://www.xm.com/#";

    private static final String logo = "#navigation-collapse .logo";
    private static final String buttonLocator = "asdasdasd";

    public void open() {
        WebDriverHandler.openPage(URL);
    }

    public boolean isLogoDisplayed() {
        return WebDriverHandler.getDriver().findElement(By.cssSelector(logo)).isDisplayed();
    }

    public void clickOnSubmitButton() {
        if(WebDriverHandler.getDriver().findElement(By.cssSelector(buttonLocator)).isEnabled()){
            WebDriverHandler.getDriver().findElement(By.cssSelector(buttonLocator)).click();
            if(WebDriverHandler.getDriver().findElement(By.cssSelector(buttonLocator)).isDisplayed()){
                throw new RuntimeException();
            }
        } else {
            throw new RuntimeException();
        }
    }
}
