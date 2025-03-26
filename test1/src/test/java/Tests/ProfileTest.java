package Tests;


import org.junit.jupiter.api.Test;
import Pages.LoginPage;
import Pages.MainPage;
import Pages.ProfilePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ProfileTest  {
    @Test
    void checkProfileInfo() throws InterruptedException {

        open("https://ok.ru");

        new LoginPage().login("89627470281", "89618219626s");
        new MainPage().openProfile();

        ProfilePage profilePage = new ProfilePage();
        String name = profilePage.getUserName();
        sleep(3000);
        assertFalse(name.isEmpty(), "Имя пользователя не отображается");

    }
}
