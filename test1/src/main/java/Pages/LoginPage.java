package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private final SelenideElement emailField = $x("//*[@id='field_email']");
    private final SelenideElement passwordField = $x("//*[@id='field_password']");
    private final SelenideElement loginButton = $x("//*[@value='Войти в Одноклассники']");

    public void login(String email, String password) {
        emailField.setValue(email);
        passwordField.setValue(password);
        loginButton.shouldBe(enabled).click();
    }
}
