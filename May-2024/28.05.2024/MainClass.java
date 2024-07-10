// A Singleton class is a class that allows only one instance of itself to be created and provides a global point of access to that instance. 
// This is achieved by making the constructor private, so that no other instances of the class can be created, and providing a static method that returns the single instance of the class.

class SpecialClass {

    private static final SpecialClass s1 = new SpecialClass(); // Static has only one copy in the entire program

    private SpecialClass() { // Can't be accessed publically
        System.out.println("New Instance Created");
    }

    /**
     * newInstance method returns the single instance of the class.
     */
    public static SpecialClass newInstance() { //  Static Method --> To return the single instance of the class.
        return s1;
    }

    public void info() {
        System.out.println("Singleton Class"); // Only one object could be created of the singleton class.
    }
}

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hallo Bhawuk!");
        SpecialClass sc1 = SpecialClass.newInstance();
        SpecialClass sc2 = SpecialClass.newInstance();
        System.out.println(sc1 == sc2);
        sc1.info();
    }
}
