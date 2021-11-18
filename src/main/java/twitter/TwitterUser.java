package twitter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class TwitterUser {
    private String userMail;
    private String country;
    private long lastActiveTime;
    public boolean sendMsg(String msg) {
        System.out.println(userMail + " sent a msg: " + msg);
        return true;
    }
}
