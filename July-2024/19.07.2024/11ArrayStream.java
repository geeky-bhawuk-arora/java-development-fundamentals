import java.util.*;
import java.util.stream.Collectors;

class ArrayStream4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 9, 5, 7, 4, 7, 1, 22, 12, 78, 22, 12);
        // Given a list of numbers, print the duplicate numbers
        func(list);
    }

    private static void func(List<Integer> list) {
        Set<Integer> duplicates = list.stream()
                .filter(n -> Collections.frequency(list, num) > 1)
                .collect(Collectors.toSet());
        System.out.println(duplicates);

        Set<Integer> duplicates1 = new HashSet<>();
        Set<Integer> dup = list.stream()
                .filter(n -> !duplicates1.add(num))
                .collect(Collectors.toList());
        System.out.println(dup);

    }
}