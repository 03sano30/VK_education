package Tests;

import Base.BaseLoginTest;
import Base.BaseTest;
import Pages.MainPage;
import Pages.MessagesPage;
import Pages.VideoPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class ToolbarTest extends BaseLoginTest {
    @Test
    @DisplayName("Проверка работы в тулбаре кнопка Сообщения")
    void checkMessage (){
        MainPage mainPage = new MainPage();
        mainPage.toolbar().clickMessages();
        MessagesPage messagesPage = new MessagesPage();
        messagesPage.visibleMessages();
    }
    @Test
    @DisplayName("Проверка работы в тулбаре кнопка Видео")
    void checkVideo (){
        MainPage mainPage = new MainPage();
        mainPage.toolbar().clickVideo();
        VideoPage videoPage = new VideoPage();
        videoPage.visibleVideos();
    }
}
