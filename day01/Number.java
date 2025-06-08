<<<<<<< HEAD
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Number {

    public void getNumbers() {
        Scanner scanner = new Scanner(System.in);
        scanner = new Scanner(System.in);
        ArrayList<Integer> integer = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            integer.add(number);
        }
        System.out.println("Arraylist: " + integer);

        ArrayList<Integer> reversed = new ArrayList<>(integer);
        Collections.reverse(reversed);
        System.out.println("Reversed ArrayList: " + reversed);
    }

    public static void main(String[] args) {
        Number number = new Number();
        number.getNumbers();

    }
}
=======
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Number {

    public void getNumbers() {
        Scanner scanner = new Scanner(System.in);
        scanner = new Scanner(System.in);
        ArrayList<Integer> integer = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            integer.add(number);
            System.out.println("Arraylist: " + integer);
        }

        ArrayList<Integer> reversed = new ArrayList<>(integer);
        Collections.reverse(reversed);
        System.out.println("Reversed ArrayList: " + reversed);
    }

    public static void main(String[] args) {
        Number number = new Number();
        number.getNumbers();

    }
}
>>>>>>> bcff0a06ee657f64728e95f61cb303d403694556
