package pages;

import java.net.HttpURLConnection;
import java.net.URL;

public class LinkValidator {
    public static boolean isLinkBroken(String link) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(link).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            return connection.getResponseCode() != 200;
        } catch (Exception e) {
            return true;
        }
    }
}
