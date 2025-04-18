package Tests;

import Pages.LoginCredentials;
import java.util.stream.Stream;

public class TestDataProvider {
    public static Stream<LoginCredentials> validLoginCredentials() {
        return Stream.of(
                new LoginCredentials("technopol51", "technopolisPassword")
        );
    }

    public static Stream<LoginCredentials> invalidLoginCredentials() {
        return Stream.of(
                new LoginCredentials("technopol51", "wrongPass"),
                new LoginCredentials("wrongUser", "technopolisPassword"),
                new LoginCredentials("", "technopolisPassword"),
                new LoginCredentials("technopol51", ""),
                new LoginCredentials("", "")
        );
    }
}


