import analytics.Authorisation;
import analytics.Database;
import reports.ReportBuilder;
import userActions.MessageSender;
import users.MyFacebookUser;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorisation authorisation = new Authorisation();
        MessageSender messageSender = new MessageSender();
        MyFacebookUser admin = new MyFacebookUser("admin@gmail.com", "Ukraine",
                System.currentTimeMillis() - 100000L);
        if (authorisation.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
            String report = br.report();
            messageSender.send("Report: " + report, admin, "Ukraine");
        }
    }
}
