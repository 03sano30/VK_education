package Pages;

import Components.LoadablePage;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MessagesPage extends LoadablePage<MessagesPage>  {
    private static final Logger logger = LoggerFactory.getLogger(MessagesPage.class);
    private static final By Messages = By.xpath(".//msg-l10n[contains(text(), 'Сообщения')]");
    private static final By CHAT_LIST_ITEM = By.xpath(".//msg-search-results-item");
    private static final By MESSAGE_INPUT = By.xpath(".//msg-input//div[@contenteditable='true']");
    private static final By SEND_BUTTON = By.xpath(".//button[@data-tsid='button_send']");
    private static final By MESSAGE_TEXT = By.xpath(".//msg-message[@ref-last-e-mukwvd]");
    private static final By CHAT_SEARCH = By.xpath(".//input[@placeholder='Поиск']");
    private static final By REACTION_BUTTON_WITH_LIKE = By.xpath(".//msg-emoji[@emoji='\uD83D\uDC4D']");

    public void visibleMessages(){
        $(Messages).shouldBe(visible.because("Сообщения не видны"));
    }
    public MessagesPage openChatWithUser(String username) {
        logger.info("Открываем чат с пользователем: {}", username);
        $(CHAT_SEARCH).setValue(username);

        $$(CHAT_LIST_ITEM)
                .findBy(text(username))
                .shouldBe(visible.because("Чат с пользователем " + username + " не найден"))
                .click();

        return this;
    }

    protected void checkLoad() {
        $(Messages).shouldBe(visible.because("страница не загружена"));
    }

    public MessagesPage sendMessage(String message) {
        logger.info("Отправляем сообщение: {}", message);
        $(MESSAGE_INPUT)
                .shouldBe(visible.because("Поле ввода сообщения не видно"))
                .setValue(message);

        $(SEND_BUTTON)
                .shouldBe(visible.because("Кнопка отправки не видна"))
                .click();

        return this;
    }

    public MessagesPage verifyMessageSent(String message) {
        logger.info("Проверяем отправку сообщения: {}", message);
        $$(MESSAGE_TEXT)
                .findBy(text(message))
                .shouldBe(visible.because("Отправленное сообщение не отображается"));
        return this;
    }

    public MessagesPage verifyLikeReactionExists() {
        logger.info("Проверяем наличие реакции 👍 на последнем сообщении");
        $(MESSAGE_TEXT)
                .$(REACTION_BUTTON_WITH_LIKE)
                .shouldBe(visible.because("Реакция '👍' не найдена на последнем сообщении"));
        return this;
    }
}
