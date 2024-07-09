
//@FunctionalInterface --> It has only one abstract method.
interface LambdaTest {

    // void show();
    // void show(String name, String surname);
    int show(String name, String surname); // If suppose the method is returning something.
}

/**
 * Ways to give body to the abstract method in an interface:-
 * -> By implements keyword in main class
 * -> Anonymous class
 * -> Method referencing
 * -> Lambda expression
 */
public class LambdaExp {

    public static void main(String[] args) {
        System.out.println("Hallo Bhawuk!");
        /**
         * Anonymous class approach
         */
        // LambdaTest l2 = new LambdaTest() {
        // public void show() {
        // System.out.println("show() method");
        // };

        /**
         * Lambda expression is treated as function by the compiler, so .class
         * isn't created. It provides implementation of the functional
         * interface.
         */
        LambdaTest l1 = (/* Parameter List */x, y) -> {
            /* Function Body */
            // System.out.println("show() method");
            System.out.println(x + " " + y);
            return 0; //
        };

        // ll.show ();
        // l1.show("Bhawuk", "Arora");
        int res = l1.show("Bhawuk", "Arora");
    }
}

// https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/function/package-summary.html
// https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
