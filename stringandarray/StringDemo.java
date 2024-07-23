package stringandarray;

public class StringDemo {
    public static void main(String[] args) {

        String greeting = "Hello, World!";

        System.out.println(greeting);

        // Get the length of the string
        int length = greeting.length();
        System.out.println("Length of the string: " + length);

        // Convert the string to uppercase
        String upperCaseGreeting = greeting.toUpperCase();
        System.out.println("Uppercase version: " + upperCaseGreeting);

        // Replace a substring in the string
        String replacedGreeting = greeting.replace("World", "Java");
        System.out.println("Replaced version: " + replacedGreeting);
    }
}
