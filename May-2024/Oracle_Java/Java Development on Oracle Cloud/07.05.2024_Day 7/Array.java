
import java.util.Scanner; // Import the Scanner class

public class Array {

    public static void main(String args[]) {
        int a[] = new int[4];// 1-D Array  -> Array is a class 
//      Here, we are creating an instance of the Array class

        int b[][] = new int[2][2]; //  2-D Array

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

    }
}
