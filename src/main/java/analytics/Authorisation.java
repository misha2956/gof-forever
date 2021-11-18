package analytics;

public class Authorisation extends Авторизація {
    public Authorisation() {
        super();
    }
    public boolean authorize(Database db) {
        return this.авторизуватися(db);
    }
}
