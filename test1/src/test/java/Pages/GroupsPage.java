package Pages;

import Components.LoadablePage;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class GroupsPage extends LoadablePage<GroupsPage> {
    private static final By RECOMMENDED_GROUPS = By.xpath(".//h3[contains(text(), 'Рекомендуем')]");

    public void VisibleRecommendedGroups() {
        $(RECOMMENDED_GROUPS).shouldBe(visible.because("Рекомендуемые группы не отображаются на странице") );
    }
    protected void checkLoad() {
        $(RECOMMENDED_GROUPS).shouldBe(visible.because("Рекомендуемые группы не найдены при загрузке страницы") );
    }
}