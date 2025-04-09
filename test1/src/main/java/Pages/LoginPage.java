package Pages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static final Logger logger = LoggerFactory.getLogger(LoginPage.class);
    private static final By EMAIL_FIELD = By.xpath("//input[@id='field_email']");
    private static final By PASSWORD_FIELD = By.xpath("//input[@id='field_password']");
    private static final By LOGIN_BUTTON = By.xpath("//input[@value='Войти в Одноклассники']");
    private static final By LOGIN_ERROR = By.xpath("//div[@class='input-e login_error']");
    public void login(String email, String password) {
        logger.info("Начало авторизации с логином: {}", email);
        $(EMAIL_FIELD).setValue(email);
        $(PASSWORD_FIELD).setValue(password);
        logger.info("Нажимаем на кнопку Войти");
        $(LOGIN_BUTTON).click();
    }
    public boolean error(){
        return $(LOGIN_ERROR).isDisplayed();
    }
}