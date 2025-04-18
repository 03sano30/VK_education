package Base;

import Pages.LoginPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public abstract class BaseTest {

    @BeforeAll
    static void setUpAll() {
        Configuration.timeout = 3000;
    }

    @BeforeEach
    void setUp() {
        open("https://ok.ru");
    }

    @AfterEach
    void tearDown() {
        closeWebDriver();
    }
}
