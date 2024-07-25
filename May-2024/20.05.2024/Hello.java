
import java.io.*;

public class Hello {

    public static void main(String[] args) throws IOException {

//        FileInputStream f1 = new FileInputStream("Hallo.txt");
        try (FileInputStream f1 = new FileInputStream("Hallo.txt")) { // try-with-resources -> catch & finally isn't required
//        try { 
            int data = f1.available();
            byte b1[] = new byte[data];
            f1.read(b1);
            String s1 = new String(b1);
            System.out.println(s1);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
//            f1.close(); // Manual Close -> To access f1, it should be declared globally
            System.out.println("Danke!");
        }

        System.out.println("Hallo Bhawuk!");

    }
}
