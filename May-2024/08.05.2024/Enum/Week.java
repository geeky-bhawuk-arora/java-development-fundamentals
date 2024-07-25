
public class Week {
    enum Days { // New Week$Days.class is created upone execution. 
        // So, we can say enum is basically a class 
        Mon, Tues, Wed, Thurs, Fri, Sat, Sun; // All members are final & static (By Default)
    }
    public static void main(String args[]) {
           System.out.println("Guten Abend, Bhawuk!");
           System.out.println(Days.Mon); // Static members (eg. Mon, here) are called by the class name
           for(Days d: Days.values()){ // For-Each Loop (Means for each element)
               // This loop can be applied on Array, Enumerations, Collections (Later)
               System.out.println(d);
           }
    }
}
