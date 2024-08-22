import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// User-defined annotation 
@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotation {
    String Developer() default "Bhawuk";
    String Expirydate();
} // will be retained at runtime

// Driver class that uses @TestAnnotation
class Test {
    @TestAnnotation(Developer = "Bhawuk", Expirydate = "01-10-2024")
    void func1() {
        System.out.println("Test method 1");
    }

    @TestAnnotation(Developer = "Bhaw", Expirydate = "01-11-2024")
    void func2() {
        System.out.println("Test method 2");
    }

    public static void main(String args[]) {
        System.out.println("Testing..");
    }
}
