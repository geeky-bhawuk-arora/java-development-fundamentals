interface abc {
    int a = 12; // Variables in an interface are static and final

    void show();

    default void display() {
        System.out.println("Java Developer");
    }
}


interface xyz {
    int a = 13;
    int b = 14;

    void show();

    default void display() {
        System.out.println("Oracle Cloud Architect");
    }
}
/*
class Testing implements abc, xyz {
    public void show() {
        System.out.println("Je suis Bhawuk!");
    }

    // Resolving ambiguity of the display method
    public void display() {
        abc.super.display(); // Super -> We want the instance of the method in the particular interface
        // If the method would have been static then we could cal it6 by the name of the interface
    }

    public static void main(String[] args) {
        Testing t1 = new Testing();
        t1.show();
//        System.out.println(t1.a); // Ambiguity arises here
        System.out.println(t1.b);

        System.out.println(xyz.a); // Resolving ambiguity of the variable a

        t1.display(); // Ambiguity arises here

        System.out.println("Danke!");

    }

 */

interface TestInterface extends abc, xyz {
    default void display() {
        xyz.super.display();
    }

    static void call() {
        display();
    }

    public static void main(String[] args) {
        TestInterface.call();
    }
}