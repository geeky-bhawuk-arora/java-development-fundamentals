import java.util.*;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class StreamTest {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "HP", 25000f));
        productList.add(new Product(2, "Dell", 30000f));
        productList.add(new Product(3, "Lenovo", 23000f));
        productList.add(new Product(4, "Apple", 28000f));
        productList.add(new Product(5, "Asus", 90000f));

        productList.stream()
                .filter(p -> p.price < 30000); // Returns a stream consisting of the elements of this stream that match the given predicate.
                .forEach(p -> System.out.println(p.name)); // Performs an action for each element of this stream.
    }
}