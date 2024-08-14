import java.security.*;
import javax.crypto.*;
import java.util.Scanner;

public class SignatureCreate {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to Digital Signature System. \nPlease, enter your name: ");
        String text = sc.nextLine();

        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("DSA");

        keyPairGen.initialize(2048);

        KeyPair pair = keyPairGen.generateKeyPair();
        PrivateKey privKey = pair.getPrivate();
        Signature s1 = Signature.getInstance("SHA256withDSA");
        s1.initSign(privKey);
        byte[] bytes = text.getBytes();
        s1.update(bytes);
        byte[] signature = s1.sign();
        System.out.println("Digital signature: " + new String(signature, "UTF-8"));
    }
}