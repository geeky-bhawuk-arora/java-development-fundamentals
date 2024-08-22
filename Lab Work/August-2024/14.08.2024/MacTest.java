import java.security.*;
import javax.crypto.*;

public class File2 {
    public static void main(String[] args) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("DES");
        SecureRandom secureRandom = new SecureRandom();
        keyGen.init(secureRandom);
        Key key = keyGen.generateKey();
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(key);
        String msg = new String("Hallo Bhawuk!");
        byte[] bytes = msg.getBytes();
        byte[] macResult = mac.doFinal(bytes);
        System.out.println("Mac Result: ");
        System.out.println(new String(macResult));
    }
}