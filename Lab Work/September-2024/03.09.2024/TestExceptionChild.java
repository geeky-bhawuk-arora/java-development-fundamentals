import java.io.*;

class Parent {
    void msg() throws ArithmeticException {
        System.out.println("Parent Method");
    }
}


public class TestExceptionChild extends Parent {
    void msg() throws IOException {
        System.out.println("Test Exception Child");
    }

    public static void main(String[] args) {
        Parent p1 = new TestExceptionChild();
        try {
            p1.msg();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
// overload - compile
// override - runtime
// Unchecked not allowed
// Checked allowed
