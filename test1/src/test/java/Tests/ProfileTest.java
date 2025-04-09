package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import Pages.ProfilePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ProfileTest extends BaseTest {

    @Test
    @DisplayName("Проверка отображения имени пользователя в профиле")
    void checkProfileInfo() {
        MainPage mainPage = new MainPage();
        ProfilePage profilePage = mainPage.openProfile();
        String name = profilePage.getUserName();
        assertFalse(name.isEmpty(), "Имя пользователя не отображается");
    }
}
