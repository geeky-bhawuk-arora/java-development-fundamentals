class Shop {
    private String name;
    private double price;

    // Constructor to initialize Shop object
    public Shop(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to display product information
    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
    }

    public static void main(String[] args) {
        /*
         * Creating instances -> Memory is allocated in heap
         * Object: The actual instance of a class residing in heap memory.
         * Reference: The variable that holds the memory address of the object and
         * resides in stack memory. It "points" to the object in the heap memory.
         */
        Food food1 = new Food("Burger", 5.99);
        Object food2 = new Food("Burger", 5.99);
        Shop food3 = new Food("Burger", 5.99);

        System.out.println("\nFood:");
        food3.displayInfo();
    }
}

class Food extends Shop {
    // Inherits everything from Shop & Object class
    public Food(String name, double price) {
        super(name, price);
    }
}
