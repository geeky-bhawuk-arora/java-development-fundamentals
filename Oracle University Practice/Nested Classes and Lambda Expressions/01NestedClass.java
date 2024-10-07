class Order {
    public static void createShippingMode (String description) {
        new ShippingMode(description);
    }
    private static class ShippingMode {
        private String description;
        public ShippingMode(String description) {
            this.description = description;
        }
    }
}

// Shipping mode can only be used by the class orders
// Valid only in the static context of order
// Not the specific instance