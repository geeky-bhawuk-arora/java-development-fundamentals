import java.util.*;
import java.util.stream.Collectors;

class ArrayStream4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 9, 5, 7, 4, 78, 22, 12);
        // Given a list of numbers, return the even and odd numbers separately
        func(list);
    }

    private static void func(List<Integer> list) {
        List<Integer> evens = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evens);

        List<Integer> odds = list.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(odds);
    }
}