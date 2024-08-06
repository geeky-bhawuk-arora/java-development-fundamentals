@FunctionalInterface
interface abc {
    void show(); // Single abstract method

    // Uncommenting this will cause a compilation error
    // void display();

    // Default method
    static void publish() {
        System.out.println("Hello from a default method!");
    }

    // Static method
    static void greet() {
        System.out.println("Hello from a static method!");
    }
}

class Test implements abc {
    @Override
    public void show() {
        System.out.println("This is the show method implementation.");
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        // Test.show(); // Calling the abstract method implementation
        abc.publish(); // Calling the default method
        abc.greet(); // Calling the static method
    }
}
