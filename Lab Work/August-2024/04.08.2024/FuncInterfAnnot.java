@FunctionalInterface
interface abc {
    void show();
//    void display();

    default void publish() {
        System.out.println("Hallo Bhawuk!");
    }

    public
}