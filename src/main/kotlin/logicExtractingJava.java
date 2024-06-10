import java.util.Arrays;
import java.util.List;

public class logicExtractingJava {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        System.out.println("all plus 1");
        printAllPlus1(numbers);

        System.out.println("all plus 2");
        printAllPlus2(numbers);
    }

    private static void printAllPlus1(Iterable<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number + 1);
        }
    }

    private static void printAllPlus2(Iterable<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number + 2);
        }
    }
}