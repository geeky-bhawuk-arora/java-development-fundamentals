import java.util.*;
import java.util.stream.Collectors;

class ArrayStream1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 9, 5, 7, 4);
        sumOfNum(list);
    }

    private static void sumOfNum(List<Integer> list) {
        Optional<Integer> sum = list.stream()
                .reduce((a, b) -> a + b);
        System.out.println("Sum 1: " + sum.get());

        int data = list.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum 2: " + data);
    }
}