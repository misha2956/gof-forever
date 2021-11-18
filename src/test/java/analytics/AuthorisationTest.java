package analytics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorisationTest {

    private Authorisation authorisation;

    @BeforeEach
    void setUp() {
        authorisation = new Authorisation();
    }

    @Test
    void authorize() {
        assertTrue(authorisation.authorize(new Database()));
    }
}