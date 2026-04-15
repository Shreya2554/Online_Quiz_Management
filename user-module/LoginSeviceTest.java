package com.devops.user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoginServiceTest {

    @Test
    void testLoginSuccess() {
        User user = new User("admin", "123");
        LoginService service = new LoginService();

        assertTrue(service.login(user));
    }

    @Test
    void testLoginFailure() {
        User user = new User("user", "wrong");
        LoginService service = new LoginService();

        assertFalse(service.login(user));
    }

    @Test
    void testEmptyUsername() {
        User user = new User("", "123");
        LoginService service = new LoginService();

        assertFalse(service.login(user));
    }
}
