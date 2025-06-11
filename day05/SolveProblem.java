import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.Stream;

public class SolveProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to array: ");
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("original array list: " + array.toString());
        Arrays.stream(array)
                .filter(n -> n > 10)
                .forEach(System.out::println);

    }
}