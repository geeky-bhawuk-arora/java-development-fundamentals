
public class GarbageCollection {

    int value = 42;

    @Override
    public void finalize() {
        System.out.println("Danke!");
    }

    void show() {
        System.out.println("Guten Abend, Bhawuk!");
    }

    public static void main(String args[]) {
        GarbageCollection g1 = new GarbageCollection();
        GarbageCollection g2 = new GarbageCollection();
//        GarbageCollection g3 = g2; 
        GarbageCollection g4 = new GarbageCollection();
        g4 = null; // This object has no reference

        g2 = g1; // o/p would be 29 for both the objects
        g1.value = 19;
        g2.value = 29;
//        g2 = g1; // o/p would be 19 for both the objects

        System.out.println(new GarbageCollection().value);
        new GarbageCollection().show();
        System.out.println("Hallo Bhawuk!");
        System.out.println(g1.value);
        System.out.println(g2.value);
        System.gc(); // Garbage Collector -> Finalize method is automatically called when it detects an object is not referenced
    }
}
