// A class implements the Cloneable interface to indicate to the Object.clone() method that it is legal for that method to make a field-for-field copy of instances of that class.
class Product implements Cloneable {
    private String name;
    private double price;

    // Constructor to initialize the Product object
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Main method for testing Product class
    public static void main(String[] args) {
        // Creating two Product objects
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.99);

        // Using toString method 
        // public String toString() {
        //     return getClass().getName() + "@" + Integer.toHexString(hashCode());
        // }

        System.out.println("Product1: " + product1.toString());
        System.out.println("Product2: " + product2.toString());

        // Using hashCode method
        System.out.println("HashCode Product1: " + product1.hashCode());
        System.out.println("HashCode Product2: " + product2.hashCode());

        // Using equals method
        System.out.println("Product1 equals Product2: " + product1.equals(product2));

        try {
            // Using clone method
            Product product3 = (Product) product1.clone();
            System.out.println("Product3 (clone of Product1): " + product3.toString());
        } catch (CloneNotSupportedException e) {
            // e.printStackTrace();
            System.out.println("Error");
        }
    }
}
