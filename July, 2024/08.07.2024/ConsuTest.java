// Functional Interfaces 
// Important Interfaces - Consumer, Supplier, Predicate, Function 
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer; // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html

class ConsuTest {
    public static void main(String[] args) {
        Consumer<Integer> c1 = a -> System.out.println("Je suis Bhawuk!" + a);
        c1.accept(10); // void

        Consumer<Integer> c2 = a -> {
            int square = a * a;
            System.out.println(square);
        };
        c2.accept(20);

        Consumer<Integer> c3 = b -> {
            int cube = b * b * b;
            System.out.println(cube);
        };
        c2.andThen(c3).accept(2); // c2.accept then c3.accept

        // List Interface
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(4);
        l1.add(6);
        l1.add(8);
        l1.add(10);

        Consumer<List<Integer>> c4 = l -> {
            for (int i = 0; i < l.size(); i++) {
                l.set(i, 2 * l.get(i)); // Replaces the element at the specified position in this list with the
                                        // specified element.
                System.out.println(l.get(i)); // Returns the element at the specified position in this list.
            }
        };
        c4.accept(l1);
    }
}
