import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ReverceArray {

    public void array() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integer = new ArrayList<>();
        while (integer.size() < 10) {
            int number = scanner.nextInt();
            integer.add(number);
        }
        System.out.println("Arraylist: " + integer);

        ArrayList<Integer> reversed = new ArrayList<>(integer);
        Collections.reverse(reversed);
        System.out.println("Reversed ArrayList: " + reversed);
    }

    public static void main(String[] args) {
        ReverceArray reverceArray = new ReverceArray();
        reverceArray.array();
    }
}