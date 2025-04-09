package Pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class GroupsPage {
    private static final By RECOMMENDED_GROUPS = By.xpath("//h3[contains(text(), 'Рекомендуем')]");

    public void hasRecommendedGroups() {
        $(RECOMMENDED_GROUPS).shouldBe(visible.because("Рекомендуемые группы не отображаются на странице") );
    }
}