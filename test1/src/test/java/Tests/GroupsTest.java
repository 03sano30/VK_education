package Tests;

import Base.BaseTest;
import Pages.GroupsPage;
import Pages.LoginPage;
import Pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GroupsTest extends BaseTest {

    @Test
    @DisplayName("Проверка отображения рекомендуемых групп")
    void checkGroupsPage() {
        MainPage mainPage = new MainPage();
        GroupsPage groupsPage = mainPage.openGroups();
        groupsPage.hasRecommendedGroups();
    }
}
