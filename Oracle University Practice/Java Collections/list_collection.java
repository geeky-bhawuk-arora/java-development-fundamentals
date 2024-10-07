import java.util.List;
import java.util.ArrayList;
import java.util.Arrays; // Contains various methods for manipulating arrays (such as sorting and searching).

class Food extends Product {
    Food(String name) {
        super(name);
    }
}

class Drink extends Product {
    Drink(String name) {
        super(name);
    }
}

class Product {
    private String name;

    Product(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Product p1 = new Food("Cake");
        Product p2 = new Drink("Tea");

        // List is an interface implemented by the ArrayList class.
        List<Product> l1 = new ArrayList<>();

        List<Product> l2 = new ArrayList<>(20); // Good Practice

        l2.add(p1); // Appends the specified element to the end of this list.
        l2.add(p2);
        l2.add(2, null); // Inserts the specified element at the specified position in this list.
        l2.add(3, p1);
        l2.add(2, p1); // It would push the list forward
        l2.set(2, p2); // Replaces the element at the specified position in this list with the
                       // specified element.

        /*
         * In the remove() method, it removes the element and pushes the list upwards to
         * maintain the continuity.
         */
        l2.remove(0); // Removes the element at the specified position in this list.
        l2.remove(p2); // Removes the first occurrence of the specified element from this list, if it
                       // is present.

        boolean hasTea = l2.contains(p2); // Returns true if this list contains the specified element.

        int index = l2.indexOf(p1); // Returns the index of the first occurrence of the specified element
                                    // in the list, or -1 if this list does not contain the element.

        l2.add(4, p2); // Error -> Not Allowed

        // List<Product> l3 = new ArrayList<>(set1);

        List<Product> l4 = Arrays.asList(p2, p2); // Returns a fixed-size list backed by the specified array.

        List<Product> l5 = List.of(p1, p2); // Returns an unmodifiable list containing an arbitrary number of elements.
    }
}
