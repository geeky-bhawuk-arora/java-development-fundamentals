
import java.util.Scanner;

public class ThrowExcep {

    static int ages[] = new int[10];

    public static void UnderEighteen(int age) throws ArrayIndexOutOfBoundsException {
        ThrowExcep.ages[19] = 20;
        System.out.println("Welcome...!!");
    } // Use of throws keyword --> ???
    
    public static void main(String[] args) {
        System.out.println("Enter your age -> ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new ArithmeticException();
            } else {
                System.out.println("Gut Bhawuk!");
            }
        }
        catch (Exception e) {
            System.out.println("Not eligible...");
            ThrowExcep.UnderEighteen(age);  // Exception here...
        }
    }
}
