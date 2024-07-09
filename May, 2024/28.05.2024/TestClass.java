
import java.util.*;

public class TestClass {

    public static void main(String[] args) {
        System.out.println("Var Testing");
        var l1 = new ArrayList();
        l1.add("Bhawuk");

        List<Integer> l2 = new ArrayList<Integer>();
        List<Integer> l3 = new ArrayList<>(); // Type Inferencing
        
        // var keyword can't be used in case of generics.
    }
}
