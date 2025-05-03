package Pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    private static final By USER_NAME = By.xpath(".//h1[contains(@class, 'user-profile-name')]");

    public String getUserName() {
        return $(USER_NAME).getText();
    }
}