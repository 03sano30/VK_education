package Pages;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Components.ToolbarWrapper;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class MainPage {
    private static final By TOOLBAR_ROOT = By.xpath(".//*[contains(@class, 'toolbar_nav')]");

    private static final Logger logger = LoggerFactory.getLogger(MainPage.class);
    private static final By PROFILE_LINK = By.xpath(".//div[@class='tico ellip']");
    private static final By GROUPS_LINK = By.xpath(".//div[contains(text(), 'Группы')]");

    private static final By FRIENDS_ON_SITE = By.xpath(".//h3[contains(text(), 'Друзья на сайте')]");
    public ProfilePage openProfile() {
        logger.info("Нажимаем на кнопку профиля ");
        $(PROFILE_LINK).click();
        return new ProfilePage();
    }
    public ToolbarWrapper toolbar() {
        return new ToolbarWrapper($(TOOLBAR_ROOT));
    }
    public GroupsPage openGroups() {
        logger.info("Нажимаем на кнопку с названием: " + $(GROUPS_LINK).getText());
        $(GROUPS_LINK).shouldBe(visible).click();
        return new GroupsPage();
    }
    public void visibleProfile(){
        $(PROFILE_LINK).shouldBe(visible.because("Профиль не виден"));
    }
    public void visibleFriendsOnSite(){
        $(FRIENDS_ON_SITE).shouldBe(visible.because("Друзья на сайте не видны"));
    }
}