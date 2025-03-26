package Pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GroupsPage {
    private final SelenideElement recommendedGroups = $x("//*[@id='hook_Block_PopularGroupsListBlock']/div/div/div[1]/h3");

    public void hasRecommendedGroups() {
        recommendedGroups.shouldBe(visible);
    }
}
