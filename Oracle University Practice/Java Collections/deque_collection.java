import java.util.ArrayDeque;
import java.util.Deque;

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

        Deque<Product> pd1 = new ArrayDeque<>();
        Deque<Product> pd2 = new ArrayDeque<>(20);

        Product nullProduct = pd1.pollFirst(); // Returns the head of this deque and also removes it.

        pd1.offerFirst(p1); //

    
        



    }
}