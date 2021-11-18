package meta;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class FacebookUser {
    private String email;
    private String userCountry;
    private long userActiveTime;
    public boolean sendMessage(String message) {
        System.out.println(email + " sent a message: " + message);
        return true;
    }
}
