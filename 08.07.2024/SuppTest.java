// Functional Interfaces
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html

import java.util.Random;
import java.util.function.Supplier; // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html

class SuppTest {
    public static void main(String[] args) {
        int a = 100;
        // Supplier<Integer> s1 = () -> {
        // return a;
        // };
        Supplier<Integer> s1 = () -> 200;
        int res1 = s1.get();
        System.out.println(res1);

        // Random Class
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Random.html
        Random r1 = new Random();
        Supplier<Integer> s2 = () -> r1.nextInt(100);
        int res2 = s2.get();
        System.out.println(res2);

        Random r2 = new Random();
        int res3;
        Supplier<Integer> s3 = () -> r2.nextInt(100);
        for (int i = 0; i < 5; i++) {
            res3 = s3.get();
            System.out.println(res3);
        }
    }
}
