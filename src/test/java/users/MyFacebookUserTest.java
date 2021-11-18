package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {

    private MyFacebookUser facebookUser;
    private long lastActive;

    @BeforeEach
    void setUp() {
        lastActive = System.currentTimeMillis() - 100000L;
        facebookUser = new MyFacebookUser("admin@gmail.com", "Ukraine", lastActive);
    }

    @Test
    void getEmail() {
        assertEquals(facebookUser.getEmail(), "admin@gmail.com");
    }

    @Test
    void getCountry() {
        assertEquals(facebookUser.getCountry(), "Ukraine");
    }

    @Test
    void getLastActiveTime() {
        assertEquals(facebookUser.getLastActiveTime(), lastActive);
    }

    @Test
    void sendMessage() {
        assertTrue(facebookUser.sendMessage("test"));
    }
}