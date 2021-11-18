package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {

    private MyTwitterUser twitterUser;
    private long lastActive;

    @BeforeEach
    void setUp() {
        lastActive = System.currentTimeMillis() - 100000L;
        twitterUser = new MyTwitterUser("admin@gmail.com", "Ukraine", lastActive);
    }

    @Test
    void getEmail() {
        assertEquals(twitterUser.getEmail(), "admin@gmail.com");
    }

    @Test
    void getCountry() {
        assertEquals(twitterUser.getCountry(), "Ukraine");
    }

    @Test
    void getLastActiveTime() {
        assertEquals(twitterUser.getLastActiveTime(), lastActive);
    }

    @Test
    void sendMessage() {
        assertTrue(twitterUser.sendMessage("test"));
    }
}