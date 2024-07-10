@FunctionalInterface // Has a single abstraact method --> 1
interface abc {

    void show(); // Abstract Method
//    void publish();
}

//  Method Referencing --> 2
public class MethodRef {

    public void display() {
        System.out.println("Danke, Bhawuk!");
    }

    public static void main(String[] args) {
        System.out.println("Hallo Bhawuk!");

        MethodRef r1 = new MethodRef();
        abc a1 = r1::display(); // display() --> show()
        // What if there are multiple abstracts methods in an interface.
        a1.show();

        /**
         * Anonymous Class
         */
//        abc a1 = new abc() {
//            public void show() {
//                System.out.println("Guten Abend, Bhawuk!");
//            }
//        } 
//        a1.show();
    }

}

// https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html