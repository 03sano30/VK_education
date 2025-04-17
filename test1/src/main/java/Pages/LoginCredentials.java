package Pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginCredentials {
    private static final Logger logger = LoggerFactory.getLogger(LoginCredentials.class);
    private final String email;
    private final String password;

    public LoginCredentials(String email, String password) {
        this.email = email;
        this.password = password;
        logger.info("Создан новый объект LoginCredentials с email: {}", email);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        String description = "LoginCredentials{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
        return description;
    }
}

