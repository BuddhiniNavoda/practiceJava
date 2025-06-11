import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DuplicateNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            numbers.add(num);

            // Ask if user wants to continue
            System.out.print("Do you want to add more numbers? (yes/no): ");
            scanner.nextLine();
            choice = scanner.nextLine();
        }

        System.out.println("Numbers you entered: " + numbers);

        numbers.stream()
                .distinct()
                .map(n -> n * n)
                .forEach(System.out::println);

    }

}