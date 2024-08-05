
import java.util.Scanner;

public class myJavaApp extends Hello implements Interfaces {

    public void show() {
        System.out.println("Bhawuk Arora");
    }
}

public class myJavaApp {

    void display() {
        System.out.println("Hello Bhawuk!");
    }

    public static void main(String[] args) {
//        System.out.println("Please enter your age:- ");
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age >= 18) {
//            System.out.println("You are eligible to vote.");
//        } else {
//            System.out.println("You are not eligible to vote.");
//        }
        myJavaApp j1 = new myJavaApp();
        j1.show();

    }

}
