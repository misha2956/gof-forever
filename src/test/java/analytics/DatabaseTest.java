package analytics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    private Database database;
    private БазаДаних базаДаних;

    @BeforeEach
    void setUp() {
        database = new Database();
        базаДаних = new БазаДаних();
    }

    @Test
    void getUserData() {
        assertEquals(database.getUserData(), базаДаних.отриматиДаніКористувача());
    }

    @Test
    void getStats() {
        assertEquals(database.getStats(), базаДаних.отриматиСтатистичніДані());
    }
}