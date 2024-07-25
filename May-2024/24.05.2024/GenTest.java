
class SmartClass<T> {

    private T data;

    SmartClass(T item) {
        this.data = item;
    }

    public T getData() {
        return this.data;
    }
}

public class GenTest {

    public static void main(String[] args) {
        SmartClass<Integer> sc1 = new SmartClass<>(29.19);
        double val = sc1.getData();
        System.out.println(val);
//        int a = sc1.getData();
//        System.out.println(a);
        SmartClass<Double> sc2 = new SmartClass<>(29.19); // Type Inference
        Double b = sc2.getData();
        System.out.println(b);
        System.out.println("Hallo Bhawuk!");
    }
}

// https://docs.oracle.com/javase/tutorial/java/generics/genTypeInference.html