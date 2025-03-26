package Pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class ProfilePage {
    private final SelenideElement userName = $x("//*[@id='hook_Block_UserProfileInfo']/div/a/h1");

    public String getUserName() {
        return userName.getText();
    }
}
