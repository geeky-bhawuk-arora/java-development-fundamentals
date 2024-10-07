
import java.util.*;

class Product {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}

class Food extends Product {

    public Food(String name) {
        super(name);
    }
}

class Drink extends Product {

    public Drink(String name) {
        super(name);
    }

}

public class Array_Collection {

    public static void main(String[] args) {
        Product p1 = new Food("Apple");
        Product p2 = new Drink("Orange Juice");

        List<Product> menu = new ArrayList<>(2);
        menu.add(p1);
        menu.add(p2);
        menu.add(2, null);
        menu.add(3, p1);
        menu.add(2, p1);
        menu.set(2, p2);
        menu.remove(0);
        menu.remove(p2);
        boolean hasTea = menu.contains(p2);
        int index = menu.indexOf(p1);
        menu.get(index).setName("Cookie");
        // menu.add(4,p2); // Not Allowed
        System.out.println(hasTea);
    }
}
