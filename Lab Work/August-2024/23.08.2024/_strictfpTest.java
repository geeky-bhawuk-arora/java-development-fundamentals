// https://www.geeksforgeeks.org/strictfp-keyword-java/

// Keyword usage with methods
/* 
public class _strictfpTest {
    public strictfp double sum() {
        double num1 = 10e+10;
        double num2 = 6e+08;
        return num1 + num2;
    }
    public static void main(String[] args) {
        _strictfpTest t = new _strictfpTest();
        System.out.println(t.sum());
    }
}
*/

// Keyword usage with classes
public strictfp class _strictfpTest {
    public double sum() {
        double num1 = 10e+10;
        double num2 = 6e+08;
        return num1 + num2;
    }
    public static void main(String[] args) {
        _strictfpTest t = new _strictfpTest();
        System.out.println(t.sum());
    }
}
