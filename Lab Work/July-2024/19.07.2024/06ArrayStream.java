import java.util.*;
import java.util.stream.Collectors;

class ArrayStream2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 9, 5, 7, 4);
        averageOfNum(list);
    }

    private static void averageOfNum(List<Integer> list) {
        double avg = list.stream()
                .mapToInt(a->a)
                .average()
                .orElse(0); // If a value is present, returns the value, otherwise returns other.
        System.out.println("Average: " + avg);
    }
}