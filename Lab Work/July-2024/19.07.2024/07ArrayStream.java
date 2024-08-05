import java.util.*;

class ArrayStream3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 9, 5, 7, 4, 78, 22, 12);
        // Given a list of numbers, square them and filter the numbers which are greater than 100 and find the average of them
        func(list);
    }

    private static void func(List<Integer> list) {
        double avg1 = list.stream()
                .map(a -> a * a)
                .filter(num -> num > 100)
                .mapToInt(a -> a)
                .average()
                .orElse(0);
        System.out.println("Average: " + avg1);
    }
}