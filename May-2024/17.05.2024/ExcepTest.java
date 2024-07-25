// Parent exception should be placed before the child exception, check the inheritance tree for reference
// Check the inheritance tree of all the exceptions
import java.io.*;

public class ExcepTest {

    public static void main(String[] args) {
        System.out.println("Guten Abend, Bhawuk!");
        int a = 19;
        int b = 0;
        File f1 = new File("Hello.txt");

        try {
            try {
//            int b = a / 0;
//                int c = a / b;
                int arr[] = new int[5];
                arr[6] = 29;
//            String str = null;
//            System.out.println(str.length()); // Null Pointer Exception     
//            System.out.println("Danke!");
//            FileInputStream fis = new FileInputStream(f1);
//            // We can also read the file by Scanner, BufferReader Class --> Home-Work
//            System.out.println(fis.read());
            } 
            catch (RuntimeException e) {
                System.out.println(e);
            } //        catch (ArithmeticException e) {
            //            System.out.println(e);
            //        } 
            //        catch (NullPointerException e) {
            //            System.out.println(e);
            //        } 

            try {
                String str = null;
                System.out.println(str.length()); // Null Pointer Exception      
            } 
            catch (RuntimeException e) {
                System.out.println(e);
            }
        } 
        catch (Exception e) { // Handles the exception of which we have no idea about, should be placed at the last.
            System.out.println(e);
        }

//        int c = a*a;
//        System.out.println(c);
        System.out.println("Program Working...");
    }
}
