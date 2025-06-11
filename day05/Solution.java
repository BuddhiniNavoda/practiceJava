import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 9 values to array:");
        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("original array list: " + array.toString());

        Arrays.stream(array)
                .map(n -> n = n + 5)
                .filter(n -> n < 9)
                .forEach(System.out::println);

    }
}