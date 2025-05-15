package Tests;

import Base.BaseLoginTest;
import Pages.MainPage;
import Pages.MessagesPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SendMessageTest extends BaseLoginTest {

    @Test
    @DisplayName("Отправка сообщения пользователю")
    void testSendMessageToUser() {
        String recipient = "technopol61 technopol61";
        String message = "Привет, это автотест! ";

        new MainPage().toolbar().clickMessages()
                .openChatWithUser(recipient)
                .sendMessage(message)
                .verifyMessageSent(message);
    }

    @ParameterizedTest
    @CsvSource({
            "technopol61 technopol61, Первое тестовое сообщение",
            "technopol61 technopol61, Второе тестовое сообщение"
    })
    @DisplayName("Параметризованная отправка сообщений")
    void testParameterizedMessageSending(String recipient, String message) {
        new MainPage().toolbar().clickMessages()
                .openChatWithUser(recipient)
                .sendMessage(message)
                .verifyMessageSent(message);
    }
}