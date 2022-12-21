package ui;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HomePageSelenide {

    private static final String URL = "";

    private final static SelenideElement logo = $("#navigation-collapse .logo");

    public void open() {
        WebDriverHandlerSelenide.openPage(URL);
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    public void waitForLogoToBeDisplayed() {
        logo.should(exist).shouldBe(visible);
    }
}
