package Tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Pages.GroupsPage;
import Pages.LoginPage;
import Pages.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GroupsTest {

    @Test
    void checkGroupsPage() throws InterruptedException {
        open("https://ok.ru");

        new LoginPage().login("89627470281", "89618219626s");
        new MainPage().openGroups();

        GroupsPage groupsPage = new GroupsPage();
        groupsPage.hasRecommendedGroups();
        sleep(5000);
    }
}
