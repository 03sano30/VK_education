package Tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Pages.LoginPage;
import Pages.MainPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {


    @Test
    void testSuccessfulLogin() {
        open("https://ok.ru");
        LoginPage loginPage = new LoginPage();
        loginPage.login("89627470281", "89618219626s");
        MainPage mainPage = new MainPage();
        mainPage.verifyProfileLinkVisible();

    }
}
