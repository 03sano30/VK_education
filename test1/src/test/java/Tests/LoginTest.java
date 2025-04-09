package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
public class LoginTest {
    @AfterEach
    void CloseWebDriver() {
        closeWebDriver();
    }
    @ParameterizedTest
    @CsvSource({
            "technopol51, technopolisPassword, false",
            "wrong@mail.ru, valid123, true"
    })

    @DisplayName("Проверка входа в систему ")
    void testSuccessfulLogin(String email, String password, boolean isErrorExpected) {
        open("https://ok.ru");
        LoginPage loginPage = new LoginPage();
        loginPage.login(email, password);

        if (isErrorExpected) {
            // Проверка, что ошибка появляется
            assert loginPage.error() : "Ошибка входа не отображена!";
        } else {
            MainPage mainPage = new MainPage();
            mainPage.visibleProfile();

        }
    }
}
