// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/package-summary.html
import java.net.*;

public class URLTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/package-summary.html");
            System.out.println(url.getProtocol() + " " + url.getHost() + " " + url.getPort() + " " + url.getDefaultPort() + " " + url.getQuery() + " " + url.getPath() + " " + url.getFile());
        } catch (Exception e) {
        System.out.println(e);
        }
    }
}