import java.util.HashSet;
import java.util.Set;

// The load factor is a measure of how full the hash table is allowed to get before its capacity is automatically increased. It determines the number of buckets that the hash table will initially have.

// The initial capacity is the capacity of the hash table at the time the HashSet is created. Default initial capacity is of 16 elements.

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
        Product p3 = new Food("Cookie");

        Set<Product> menu = new HashSet<>();

        menu.add(p1); // Adds the specified element e to this set if this set contains no element e2
                      // such that Objects.equals(e, e2). If this set already contains the element,
                      // the call leaves the set unchanged and returns false.

        menu.add(p2);
        boolean res = menu.add(p2);
        System.out.println(res);

        menu.add(p3);

        menu.remove(p1); // Removes an element e such that Objects.equals(o, e), if this set contains
                         // such an element. Returns true if this set contained the element
        menu.remove(p1);

        boolean hasTea = menu.contains(p2);

    }
}