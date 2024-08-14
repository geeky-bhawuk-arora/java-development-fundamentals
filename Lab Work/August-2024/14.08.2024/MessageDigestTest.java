import java.io.*;
import java.security.*;

public class File {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA");
            String s1 = "Bhawuk@42";
            byte[] arr = s1.getBytes();
            md.update(arr);
            FileOutputStream fos = new FileOutputStream("Test Key");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(md.digest());
            System.out.println("Digest is ready.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}