import java.util.Arrays;
import java.util.List;

public class higherOrderFunctions {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        System.out.println("all plus 1");
        printAllPlus1(numbers);

        System.out.println("all times 2");
        printAllTimes2(numbers);
    }

    private static void printAllPlus1(Iterable<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number + 1);
        }
    }

    private static void printAllTimes2(Iterable<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number * 2);
        }
    }
}