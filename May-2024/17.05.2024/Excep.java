
import java.io.*;

public class Excep {

    public static void main(String[] args) throws Exception {
        System.out.println("Guten Abend, Bhawuk!");
        try {
            File f1 = new File("Hello.txt");
            FileInputStream fis = new FileInputStream(f1);
            System.out.println(fis.read());
        } 
        catch (Exception e) {
            System.out.println(e);
        } 
        finally {
            System.out.println("Danke!");
            System.gc(); // Garbage Collector
        }
    }
}
