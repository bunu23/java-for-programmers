
import java.util.Scanner;

public class SumInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String input;

        System.out.println("Enter numbers to sum (type 'exit' to finish):");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                sum += Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or 'exit' to finish.");
            }
        }

        System.out.println("Total sum: " + sum);
        scanner.close();
    }
}
