// There are two things -> Static & Dynamic
// Objects -> Dynamic 
// Execution => static block -> [super -> instance block] -> constructor

public class StaticBlock {
    static int k = 19; // Mandatory, if called directly
    int b = 42; 
//  It is called up whenever a class is called.
    static { // We use 'static' keyword for initiating the static block
        StaticBlock sb2 = new StaticBlock();
        System.out.println(sb2.b); // If you want to call a non-static variable inside static block, use a instance of the class
        System.out.println(k); // Non-static variables can be referenced from static block
        System.out.println("Hallo, Static Block");
    }
    
    {
        System.out.println("Ich bin Bhawuk!");
    }
    
    
    public static void main(String args[]) {
        StaticBlock sb1 = new StaticBlock();
        System.out.println("Guten Abend, Static Block");
       
    }
}
