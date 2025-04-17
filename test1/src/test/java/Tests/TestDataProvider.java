package Tests;

import Pages.LoginCredentials;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestDataProvider {
    @MethodSource
    public static Stream<Arguments> loginCredentialsProvider() {
        return Stream.of(
                Arguments.of(new LoginCredentials("technopol51", "technopolisPassword"), false),
                Arguments.of(new LoginCredentials("wrong@mail.ru", "valid123"), true)
        );
    }
}

