package users;

import meta.FacebookUser;

public class MyFacebookUser implements User {
    private final FacebookUser facebookUser;

    public MyFacebookUser(String email, String userCountry, long userActiveTime) {
        facebookUser = new FacebookUser(email, userCountry, userActiveTime);
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public long getLastActiveTime() {
        return facebookUser.getUserActiveTime();
    }

    @Override
    public boolean sendMessage(String msg) {
        return facebookUser.sendMessage(msg);
    }
}
