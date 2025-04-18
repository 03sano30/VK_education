package Base;

import Pages.LoginPage;
import org.junit.jupiter.api.BeforeEach;


public abstract class BaseLoginTest extends BaseTest {

    @BeforeEach
    void loginBeforeEachTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("technopol51", "technopolisPassword");
    }
}

