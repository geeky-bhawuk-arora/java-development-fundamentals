
interface OverrideInterface {
    int z = 19;
    void show();
    default void display() {
        System.out.println("Hallo Bhawuk!");
    }
}
class xyz implements OverrideInterface {
    int z = 42;
    public void show() {
        System.out.println("Guten Morgen, Bhawuk!");
    }
    
    public void display() {
        System.out.println("Guten Abend, Bhawuk!");
    }
    
    public static void main(String args[]) {
        xyz x1 = new xyz();
        x1.show();
        x1.display();
        
        OverrideInterface x2 = new xyz(); // Giving reference to the interface
//        x2.disp(); This is the override test. Since, this failed thereby it threw an error.
        x2.display();
        System.out.println(x2.z);
        
        
        
    }
}
