
import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {
        try (FileOutputStream f1 = new FileOutputStream("Hallo.txt")) {
            String s1 = "Guten Abend, Bhawuk!";
            byte b1[] = s1.getBytes();
            f1.write(b1);
        }
        System.out.println("Hallo Bhawuk!");
    }
}
