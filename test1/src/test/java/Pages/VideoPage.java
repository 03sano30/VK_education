package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VideoPage {
    private static final By RecommendedVideo = By.xpath(".//*[@id='listBlockPanelVideoUniversalContentBlock']");

    public void visibleVideos(){
        $(RecommendedVideo).shouldBe(visible.because("Рекомендованные видео не видны"));
    }
}
