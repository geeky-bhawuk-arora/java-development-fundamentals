import java.util.*;
import java.util.stream.Collectors;

class ArrayStream4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 9, 5, 24, 231, 7, 4, 78, 22, 12);
        // Given a list of numbers, find out all the numbers starting with 2
        func(list);
    }

    private static void func(List<Integer> list) {
        List<Integer> startsTwo = list.stream()
                .map(n -> String.valueOf(n)) // Returns the string representation of the int argument
                .filter(n -> n.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(startsTwo);

    }
}