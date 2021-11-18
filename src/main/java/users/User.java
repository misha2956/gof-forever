package users;

public interface User {
    String getEmail();
    String getCountry();
    long getLastActiveTime();
    boolean sendMessage(String msg);
}
