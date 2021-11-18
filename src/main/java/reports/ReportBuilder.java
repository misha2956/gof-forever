package reports;

import analytics.Database;

public class ReportBuilder {
    private Database db;
    public ReportBuilder(Database db) {
        this.db = db;
    }
    public String report() {
        return db.getStats() + db.getUserData();
    }
}
