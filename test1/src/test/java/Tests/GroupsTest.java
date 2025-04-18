package Tests;

import Base.BaseLoginTest;
import Base.BaseTest;
import Pages.GroupsPage;
import Pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GroupsTest extends BaseLoginTest {

    @Test
    @DisplayName("Проверка отображения рекомендуемых групп")
    void checkGroupsPage() {
        MainPage mainPage = new MainPage();
        GroupsPage groupsPage = mainPage.openGroups();
        groupsPage.VisibleRecommendedGroups();
    }
}
