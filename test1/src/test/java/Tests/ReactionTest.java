package Tests;


import Base.BaseLoginTest;
import Pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReactionTest extends BaseLoginTest {

    private static final String FRIEND = "technopol61 technopol61";

    @Test
    @DisplayName("Проверка наличия реакции на последнем сообщении")
    void testCheckLikeReactionOnLastMessage() {
        new MainPage()
                .toolbar().clickMessages()
                .openChatWithUser(FRIEND)
                .verifyLikeReactionExists();
    }
}
