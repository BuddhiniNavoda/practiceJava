//queastion 10

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ProcessNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[7];
        System.out.println("Enter the number of elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(numbers));

        Arrays.stream(numbers).forEach(System.out::println);

        Arrays.stream(numbers)
                .map(n -> n * n)
                .forEach(System.out::println);

    }
}