package users;

import twitter.TwitterUser;

public class MyTwitterUser implements User {
    private final TwitterUser twitterUser;

    public MyTwitterUser(String email, String userCountry, long userActiveTime) {
        twitterUser = new TwitterUser(email, userCountry, userActiveTime);
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public long getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }

    @Override
    public boolean sendMessage(String msg) {
        return twitterUser.sendMsg(msg);
    }
}
