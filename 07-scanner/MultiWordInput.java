
import java.util.Scanner;

// Reading a Line with Multiple Words
public class MultiWordInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("You entered: " + sentence);

        scanner.close();
    }
}
