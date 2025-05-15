package Pages;

import Components.LoadablePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage extends LoadablePage<ProfilePage> {
    private static final By USER_NAME = By.xpath(".//h1[contains(@class, 'user-profile-name')]");
    protected void checkLoad() {
        $(USER_NAME).shouldBe(visible.because("страница не загружена"));
    }
    public String getUserName() {
        return $(USER_NAME).getText();
    }
}