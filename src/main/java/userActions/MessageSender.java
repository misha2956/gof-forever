package userActions;

import users.User;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        if (user.getCountry().equals(country) && (System.currentTimeMillis() - user.getLastActiveTime()) < 3600000) {
            user.sendMessage(text);
            return true;
        }
        return false;
    }
}
