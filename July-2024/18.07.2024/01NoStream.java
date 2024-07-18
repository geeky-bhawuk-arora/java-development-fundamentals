import java.util.*;

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

class NoStream {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP", 25000f));
        productList.add(new Product(2, "Dell", 30000f));
        productList.add(new Product(3, "Lenovo", 23000f));
        productList.add(new Product(4, "Apple", 28000f));
        productList.add(new Product(5, "Asus", 90000f));

        List<Float> productPriceList = new ArrayList<>();

        for (Product it : productList) {
            if (it.price < 30000) {
                productPriceList.add(it.price);
            }
        }
        System.out.println(productPriceList);
    }
}