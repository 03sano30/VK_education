package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement profileLink = $x("//*[@id='hook_Block_Navigation']/div/div/div[1]/a/div");

    private final SelenideElement groupsLink = $x("//*[@id='hook_Block_Navigation']/div/div/div[6]/a/div");

    private final SelenideElement friendsOnSite = $x("//*[@id='online-fr_block']/div[2]/h3");



    public void openProfile() {
        profileLink.shouldBe(visible).click();
    }
    public void verifyProfileLinkVisible() {
        profileLink.shouldBe(visible);
    }
    public void openGroups() {
        groupsLink.shouldBe(visible).click();
    }
    public void visibleFriendsOnSite() {
        friendsOnSite.shouldBe(visible);
    }
}