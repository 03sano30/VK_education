package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MessagesPage {
    private static final By Messages = By.xpath(".//msg-l10n[contains(text(), 'Сообщения')]");

    public void visibleMessages(){
        $(Messages).shouldBe(visible.because("Сообщения не видны"));
    }
}
