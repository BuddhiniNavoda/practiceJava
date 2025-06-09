import java.util.ArrayList;
import java.util.Scanner;

public class OddSum {

    public void GetInput() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            int value = sc.nextInt();
            numbers.add(value);

            if (value % 2 != 0) {
                oddNumbers.add(value);
                
            }
        }
        System.out.println("Odd numbers :" + oddNumbers);
        System.out.println("Array List :" + numbers);

    public static void main(String[] args) {
        OddSum oddsum = new OddSum();
        oddsum.GetInput();
    }
}
