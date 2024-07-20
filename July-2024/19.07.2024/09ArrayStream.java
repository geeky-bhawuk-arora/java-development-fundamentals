import java.util.*;
import java.util.stream.Collectors;

class ArrayStreame5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 7, 8, 9, 5, 2, 36, 4, 78, 222, 24, 9);
        // Given a list of numbers, return the even and odd numbers separately
        getNumbersEvenAndOddSeperately(list);
    }

    private static void getNumbersEvenAndOddSeperately(List<Integer> list) {
        List<Integer> evens = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println("Exercise 4 : evens: " + evens);

        List<Integer> odds = list.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        System.out.println("Exercise 4 : odds: " + odds);
    }
}
