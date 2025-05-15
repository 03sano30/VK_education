package Tests;

import Base.BaseLoginTest;
import Pages.MainPage;
import Pages.ProfilePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ProfileTest extends BaseLoginTest {

    @Test
    @DisplayName("Проверка отображения имени пользователя в профиле")
    void checkProfileInfo() {
        String name = new MainPage().openProfile().getUserName();
        assertFalse(name.isEmpty(), "Имя пользователя не отображается");
    }
}
