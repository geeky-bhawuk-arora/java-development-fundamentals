// https://docs.oracle.com/en/java/javase/11/security/java-pki-programmers-guide.html
//

import java.security.MessageDigest;
import java.util.Scanner;

public class EncryptTest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message: ");
        String msg = sc.nextLine();
        sc.close();

        MessageDigest obj = MessageDigest.getInstance("SHA-256");
        obj.update(msg.getBytes());
        byte[] byteArray = obj.digest();
        System.out.println(byteArray);
        StringBuffer hexData = new StringBuffer(); // StringBuffer is immutable

        for (int i = 0; i < byteArray.length; i++) {
            hexData.append(Integer.toHexString(0xFF & byteArray[i]));
        }

        System.out.println("Data in Hex Format: " + hexData.toString());
    }
}