
class GenMethod {

    <T> GenMethod(T t) { // Generic Constructor
        System.out.println(t.getClass().getName());
    }

    static <T> void display(T element) { // Generic Method
        System.out.println(element.getClass().getName());
    }

    public static void main(String[] args) {
        display(29);
        display("Hallo Bhawuk!");
        display(29.0);
        GenMethod ob1 = new GenMethod(29);
        GenMethod ob2 = new GenMethod(29.19f);
    }
}

// Generic --> Class, Constructor & Method

