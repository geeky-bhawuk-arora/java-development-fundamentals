import java.util.function.BiFunction;

class BiFuncTest {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a+b;
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a*b;
        System.out.println(add.apply(12,2));
        System.out.println(multiply.apply(12,2));
    }
}
