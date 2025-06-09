import java.util.Arrays;
import java.util.Scanner;

public class OddSum {

    public void array() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] oddarry = new int[10];
        int oddIndex = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 != 0) {
                oddarry[oddIndex] = arr[i];
                oddIndex++;

            }
        }
        System.out.println("Odd numbers :" + Arrays.toString(Arrays.copyOf(oddarry, oddIndex)));// Odd numbers :[1, 0,
                                                                                                // 3, 0, 5, 0, 7, 0, 9,
                                                                                                // 0] out put give like
                                                                                                // this formate so we
                                                                                                // use
                                                                                                // Arrays.copyOf(oddarry,
                                                                                                // oddIndex
        System.out.println("Array List :" + Arrays.toString(arr));

    }

    public static void main(String[] args) {
        OddSum oddsum = new OddSum();
        oddsum.array();
    }
}
