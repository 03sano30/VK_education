package Tests;

import Base.BaseLoginTest;
import Pages.MainPage;
import Pages.MessagesPage;
import Pages.VideoPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class ToolbarTest extends BaseLoginTest {
    @Test
    @DisplayName("Проверка работы в тулбаре кнопка Сообщения")
    void checkMessage (){
        new MainPage()
                .toolbar()
                .clickMessages()
                .visibleMessages();
    }
    @Test
    @DisplayName("Проверка работы в тулбаре кнопка Видео")
    void checkVideo (){
        new MainPage()
                .toolbar()
                .clickVideo()
                .visibleVideos();
    }
}
