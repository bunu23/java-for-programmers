
//tokenize a string input into words
import java.util.Scanner;

public class TokenizingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String line = scanner.nextLine();

        String[] tokens = line.split(" ");

        System.out.println("You entered " + tokens.length + " words:");
        for (String token : tokens) {
            System.out.println(token);
        }

        scanner.close();
    }
}
