package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import Pages.LoginCredentials;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    @AfterEach
    void CloseWebDriver() {
        closeWebDriver();
    }

    @ParameterizedTest
    @MethodSource("Tests.TestDataProvider#loginCredentialsProvider")
    @DisplayName("Проверка входа в систему")
    void testSuccessfulLogin(LoginCredentials credentials, boolean isErrorExpected) {
        open("https://ok.ru");
        LoginPage loginPage = new LoginPage();
        loginPage.login(credentials.getEmail(), credentials.getPassword());

        if (isErrorExpected) {
            // Проверка, что ошибка появляется
            assert loginPage.error() : "Ошибка входа не отображена!";
        } else {
            MainPage mainPage = new MainPage();
            mainPage.visibleProfile();
        }
    }
}
