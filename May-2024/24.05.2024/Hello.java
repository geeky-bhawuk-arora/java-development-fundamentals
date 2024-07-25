// ? --> Wildcard in Java
// <? extends Number> // All classes that extends the 'Number' class --> Upper Bound
// <? super A> // All super classes of A --> Lower Bound
// <?> // --> Unbounded 

import java.util.Arrays;
import java.util.List;

public class Hello {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(2, 3, 4);
        System.out.println(sum(l1));
    }

    public static int sum(List<? extends Number> list) {
        int sum = 0;
        for (Number it : list) {
            sum += it.intValue(); // Check docs
        }
        return sum;
    }
    
//    public static int sum(List<? super Integer> list) {
//        int sum = 0;
//        for (Number it : list) {
//            sum += it.intValue();
//        }
//        return sum;
//    }
    
//    public static int sum(List<?> list) {
//        int sum = 0;
//        for (Number it : list) {
//            sum += it.intValue();
//        }
//        return sum;
//    }
}

// https://docs.oracle.com/javase/tutorial/extra/generics/wildcards.html

