package Tests;


import Base.BaseTest;
import Pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class FriendsOnSiteTest extends BaseTest  {
    @Test
    @DisplayName("Проверка отображения друзей на сайте")
    void checkPossibleFriendsPage(){
        MainPage mainPage = new MainPage();
        mainPage.visibleFriendsOnSite();
    }
}
