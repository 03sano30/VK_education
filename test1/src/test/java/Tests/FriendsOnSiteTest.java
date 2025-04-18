package Tests;


import Base.BaseLoginTest;
import Base.BaseTest;
import Pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class FriendsOnSiteTest extends BaseLoginTest {
    @Test
    @DisplayName("Проверка отображения друзей на сайте")
    void checkPossibleFriendsPage(){
        MainPage mainPage = new MainPage();
        mainPage.visibleFriendsOnSite();
    }
}
