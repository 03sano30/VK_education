package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import Pages.LoginCredentials;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class LoginTest extends BaseTest {
    @AfterEach
    void CloseWebDriver() {
        closeWebDriver();
    }

    @ParameterizedTest
    @MethodSource("Tests.TestDataProvider#validLoginCredentials")
    @DisplayName("Позитивный сценарий: успешный вход")
    void testSuccessfulLogin(LoginCredentials credentials) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(credentials.getEmail(), credentials.getPassword());

        MainPage mainPage = new MainPage();
        mainPage.visibleProfile();
    }
    @ParameterizedTest
    @MethodSource("Tests.TestDataProvider#invalidLoginCredentials")
    @DisplayName("Негативный сценарий: вход с ошибкой")
    void testUnsuccessfulLogin(LoginCredentials credentials) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(credentials.getEmail(), credentials.getPassword());

        assert loginPage.error() : "Ожидалась ошибка при входе, но её не произошло";
    }

}
