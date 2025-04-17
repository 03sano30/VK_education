package Components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Condition.visible;

public class ToolbarWrapper {

    private static final Logger logger = LoggerFactory.getLogger(ToolbarWrapper.class);

    private static final By MESSAGES_BUTTON = By.xpath(".//*[@id='msg_toolbar_button']");
    private static final By DISCUSSIONS_BUTTON = By.xpath(".//*[@id='hook_ToolbarIconDiscussions_ToolbarDiscussions']");
    private static final By NOTIFICATIONS_BUTTON = By.xpath(".//*[@id='ntf_toolbar_button']");
    private static final By GUESTS_BUTTON = By.xpath(".//*[@id='hook_Block_HeaderTopNewEventsInToolbar']");
    private static final By EVENTS_BUTTON = By.xpath(".//*[@id='HeaderTopNewFeedbackInToolbar']");
    private static final By VIDEO_BUTTON = By.xpath(".//*[@id='hook_Block_TopMenuVideo']");
    private static final By MUSIC_BUTTON = By.xpath(".//*[@id='music_toolbar_button']");
    private final SelenideElement toolbarRoot;

    public ToolbarWrapper(SelenideElement toolbarRoot) {
        this.toolbarRoot = toolbarRoot;
    }

    public void clickMessages() {
        logger.info("Кликаем по кнопке 'Сообщения'");
        toolbarRoot.$(MESSAGES_BUTTON).shouldBe(visible).click();
    }

    public void clickDiscussions() {
        logger.info("Кликаем по кнопке 'Обсуждения'");
        toolbarRoot.$(DISCUSSIONS_BUTTON).shouldBe(visible).click();
    }

    public void clickNotifications() {
        logger.info("Кликаем по кнопке 'Оповещения'");
        toolbarRoot.$(NOTIFICATIONS_BUTTON).shouldBe(visible).click();
    }

    public void clickGuests() {
        logger.info("Кликаем по кнопке 'Гости'");
        toolbarRoot.$(GUESTS_BUTTON).shouldBe(visible).click();
    }

    public void clickEvents() {
        logger.info("Кликаем по кнопке 'События'");
        toolbarRoot.$(EVENTS_BUTTON).shouldBe(visible).click();
    }

    public void clickVideo() {
        logger.info("Кликаем по кнопке 'Видео'");
        toolbarRoot.$(VIDEO_BUTTON).shouldBe(visible).click();
    }

    public void clickMusic() {
        logger.info("Кликаем по кнопке 'Музыка'");
        toolbarRoot.$(MUSIC_BUTTON).shouldBe(visible).click();
    }
}
