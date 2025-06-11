import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 numbers:");
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The numbers are:" + Arrays.toString(arr));
        Arrays.stream(arr)
                .filter(n -> n > 8)
                .map(n -> n * n)
                .map(n -> n + 9)
                .forEach(System.out::println);
        sc.close();
    }
}