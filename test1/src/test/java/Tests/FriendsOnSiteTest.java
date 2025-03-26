package Tests;


import Pages.LoginPage;
import Pages.MainPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class FriendsOnSiteTest {
    @Test
    void checkPossibleFriendsPage() throws InterruptedException {
        open("https://ok.ru");

        new LoginPage().login("Логин", "Пароль");

        MainPage mainPage = new MainPage();
        mainPage.visibleFriendsOnSite();
        sleep(1000);

    }
}
