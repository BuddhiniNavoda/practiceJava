import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Queastion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[7];
        int i = 0;
        System.out.println("Enter 7 numbers:");
        while (i < numbers.length) {
            try {
                numbers[i] = sc.nextInt();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // clear invalid input
            }
        }

        Arrays.stream(numbers).forEach(System.out::println);
        Arrays.stream(numbers)
                .map(n -> n * n)
                .forEach(System.out::println);
    }

}