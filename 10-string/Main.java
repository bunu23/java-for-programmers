
public class Main {
    public static void main(String[] args) {
        printInformation("Hey Java");
        printInformation("");
        printInformation("\t    \n");
        String helloWorld = "Hello world";
        String helloToLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloToLower)) {
            System.out.println("matches exactly");
        }
        if (helloWorld.contentEquals("Hello world")) {
            System.out.println("matches exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloToLower)) {
            System.out.println("match ignoring cases");
        }
        if (helloWorld.startsWith("Hello")) {
            System.out.println("string starts with hello");
        }
        if (helloWorld.contains("Hello")) {
            System.out.println("string contains hello");
        }

    }

    public static void printInformation(String string) {
        int length = string.length();

        // Print the length of the string
        System.out.printf("Length = %d%n", length);

        // Check if the string is empty
        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        // Check if the string is blank (spaces, tabs, etc.)
        if (string.isBlank()) {
            System.out.println("String is blank");
            return;
        }

        // Print the first character of the string
        System.out.printf("First character = '%c'%n", string.charAt(0));

        // Print the last character
        System.out.printf("Last character = '%c'%n", string.charAt(length - 1));

        System.out.println("index of y is: " + string.indexOf('y'));
        System.out.println("last index of y is : " + string.lastIndexOf('y'));
    }

}
