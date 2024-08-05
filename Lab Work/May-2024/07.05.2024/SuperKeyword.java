
class SuperKeyword {

    int a = 42;

    void show() {
        System.out.println("Danke!");
    }

}

class xyz extends SuperKeyword {

    xyz() {
        super(); // Calling the constructor of the parent class
        // If we forgot to write the super() -> It automatically gets called
    }

//    super(); Illegal declaration
    int a = 19;

    void display() {
//        super(); // Always the first line of the child constructor -> Here, it threw an error.
        super.show();
        System.out.println("Danke Bhawuk!" + super.a);
    }

    public static void main(String args[]) {
        SuperKeyword s1 = new SuperKeyword();
        s1.show();
    }
}

}
