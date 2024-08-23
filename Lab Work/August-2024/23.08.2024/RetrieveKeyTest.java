import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyStore;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.KeyStore.SecretKeyEntry;
import java.security.KeyStore.PasswordProtection;

public class RetrieveKeyTest {
    public static void main(String[] args) {
            // Creating the key store object
            KeyStore ks = KeyStore.getInstance("JKS");

            // Loading the key store object
            char[] pass = "changeit".toCharArray(); // Default password for cacerts is "changeit"
            String path = "C:/Program Files/jdk/jdk-22.0.2/lib/security/cacerts";
            FileInputStream fis = new FileInputStream(path);
            ks.load(fis, pass);
            fis.close();

            // Creating the protection parameter
            PasswordProtection protectParam = new PasswordProtection(pass);

            // Creating secret key object
            SecretKey sk = new SecretKeySpec("Bhawuk@42".getBytes(), "AES");

            // Creating secret key entry object
            SecretKeyEntry ske = new SecretKeyEntry(sk);

            // Setting the secret key entry
            ks.setEntry("R-CAT", ske, protectParam);

            // Storing the key store object
            FileOutputStream fos = new FileOutputStream("newKeyStoreName");
            ks.store(fos, pass);
            fos.close();

            System.out.println("Key stored");
        } 
    }
}
