import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 10 numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("original array : " + Arrays.toString(numbers));

        System.out.println("numbers in ascending order:");
        Arrays.stream(numbers)
                .filter(n -> n > 8)
                .map(n -> n * n)
                .sorted()
                .forEach(System.out::println);

        System.out.println("numbers in descending order:");
        Arrays.stream(numbers)
                .filter(n -> n > 8)
                .map(n -> n * n)
                .boxed() // Use .boxed() to convert IntStream to Stream<Integer>.
                .sorted((a, b) -> b - a) // Collectors.reverseOrder() is not valid in this context.
                .forEach(System.out::println);

    }
}