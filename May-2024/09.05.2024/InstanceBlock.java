
class Testing {
    int z = 42;
    Testing() {
        System.out.println("Ich bin Bhawuk!");
    }
    
    void show() {
        System.out.println("Greetings!");
    }
}

public class InstanceBlock extends Testing { //Unnamed Block / Anonymous Block
//      {
//{ 
//      } InstanceBlock Initialisation
    
    int z; // Global variable
    {
        int a = 19;
        z = 29;
        z = super.z; // Accessing the parent's variable z
        super.show();
        System.out.println("Ich bin Bhawuk!");
    } // Class instance should be mandatorily made, otherwise it would not be called.
    // It gets automatically whenever a new instance is made.
    // It is called before the default constructor.

    InstanceBlock() {
//        super(); By default, even if you do not write.
        System.out.println("Guten Morgen, Instance");
    }
//    Child constructor's first line would always be super(); 
//    Execution => super -> instance block -> constructor
    
    public static void main(String args[]) {
        System.out.println("Gut Bhawuk!");
        InstanceBlock i1 = new InstanceBlock();
        InstanceBlock i2 = new InstanceBlock();
    }
}
