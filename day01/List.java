import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;

public class List {
    public void inputNumbers() {
        LinkedList<Integer> numbers = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int OddSum = 0;
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            numbers.add(n);

            if (i % 2 == 0) {
                evenSum += n;
            } else {
                OddSum += n;
            }
        }
        System.out.println("EvenSum is: " + evenSum);
        System.out.println("OddSum is: " + OddSum);

        System.out.println("All numbers: " + numbers);
        int j = numbers.size() - 1;
        for (int x = 0; x < j; x++) {

            numbers.add(x, numbers.remove(j));
        }

        System.out.println("oppposite formate " + " is: " + numbers);

    }

    public void IntArray() {
        LinkedList<Integer> array = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 8; j++) {
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            array.add(n);
        }
        Collections.reverse(array);
        System.out.println("All numbers: " + array);

    }

    public static void main(String[] args) {
        List listNum = new List();
        listNum.inputNumbers();
        List listNum2 = new List();
        listNum2.IntArray();

    }
}