import java.util.Scanner;

public class GroceryItem {

    public static void main(String[] args) {

        String[] Days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int[] quantity = new int[7];
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        int max = quantity[0];
        int min = quantity[0];

        for (int i = 0; i < Days.length; i++) {
            System.out.print("Enter the quantity of items sold on " + Days[i] + ": ");
            quantity[i] = scanner.nextInt();
        }
        for (int i = 0; i < quantity.length; i++) {
            total += quantity[i];

        }

        for (int i = 1; i < quantity.length; i++) {
            if (quantity[i] < min) {
                min = quantity[i];
            }
            if (quantity[i] > max) {
                max = quantity[i];
            }
        }
        System.out.println("Total quantity of items sold: " + total);
        System.out.println("Average quantity of items sold: " + (total / 7));

        System.out.println("Maximum quantity of items sold in a day: " + max);
        System.out.println("Minimum quantity of items sold in a day: " + min);

    }

}
