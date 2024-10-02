
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;

        // Get input using console
        String consoleOutput = getInputFromConsole(currentYear);
        System.out.println(consoleOutput);

        // Get input using Scanner
        String scannerOutput = getInputFromScanner(currentYear);
        System.out.println(scannerOutput);
    }

    public static String getInputFromConsole(int currentYear) {
        // Ensure that console is not null (may return null in some IDEs)
        if (System.console() == null) {
            return "No console available. Please run in a terminal.";
        }

        String name = System.console().readLine("Hello! What is your name? ");
        String favoriteColor = System.console().readLine("What's your favorite color? ");

        String dob = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dob);

        return String.format("Nice to meet you, %s! You are %d years old and your favorite color is %s.", name, age,
                favoriteColor);
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello! What is your name? ");
        String name = scanner.nextLine();

        System.out.print("What's your favorite color? ");
        String favoriteColor = scanner.nextLine();

        System.out.print("What year were you born? ");
        String dob = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dob);

        scanner.close();
        return String.format("Nice to meet you, %s! You are %d years old and your favorite color is %s.", name, age,
                favoriteColor);
    }
}
