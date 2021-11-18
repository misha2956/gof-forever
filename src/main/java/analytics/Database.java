package analytics;

public class Database extends БазаДаних {
    public Database() {
        super();
    }
    public String getUserData() {
        return this.отриматиДаніКористувача();
    }
    public String getStats() {
        return this.отриматиСтатистичніДані();
    }
}
