package Pages;

import Components.LoadablePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VideoPage extends LoadablePage<VideoPage>  {
    private static final By RecommendedVideo = By.xpath(".//*[@id='listBlockPanelVideoUniversalContentBlock']");
    protected void checkLoad() {
        $(RecommendedVideo).shouldBe(visible.because("страница не загружена"));
    }
    public void visibleVideos(){
        $(RecommendedVideo).shouldBe(visible.because("Рекомендованные видео не видны"));
    }
}
