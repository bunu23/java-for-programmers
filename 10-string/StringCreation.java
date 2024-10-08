
public class StringCreation {
    public static void main(String[] args) {
        // Creating strings using literals and constructors
        String literalString = "Hello world";
        String constructedString = new String("Hello world");

        // Printing the strings
        System.out.println("Literal String: " + literalString);
        System.out.println("Constructed String: " + constructedString);

        // Displaying string properties
        System.out.println("Length of Literal String: " + literalString.length());
        System.out.println("First Character: " + literalString.charAt(0));
        System.out.println("Last Character: " + literalString.charAt(literalString.length() - 1));

        // Concatenating first and last names
        String firstName = "Josh";
        String lastName = "Smith";
        System.out.println("Concatenated First and Last Name: " + firstName.concat(lastName));
        System.out.println("Another way to concatenate: " + firstName + lastName);
        System.out.println();

        // String comparison
        System.out.println("String Comparison:");
        System.out.println("Value Comparison: " + literalString.equals(constructedString));
        System.out.println("Reference Comparison: " + (literalString == constructedString)); // Use parentheses for
                                                                                             // proper evaluation
        System.out.println();

        // Working with substrings and other methods
        String text = "Hello, World!";
        String subText = text.substring(7, 12); // Extracting substring from index 7 to 11
        System.out.println("Substring (from index 7 to 12): " + subText);
        System.out.println("Index of 'o': " + text.indexOf('o'));
        System.out.println("Replace 'World' with 'Java': " + text.replace("World", "Java"));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Trimmed Text: " + text.trim());
        System.out.println();

        // Using formatted strings
        String name = "Alice";
        int age = 30;
        System.out.println("Formatted String: " + String.format("Name: %s, Age: %d", name, age));

        // Splitting a string
        String[] textSplit = text.split(",");
        System.out.println("Split Text:");
        for (String s : textSplit) {
            System.out.println(s.trim()); // Trim to remove extra whitespace
        }

        // Joining strings
        String[] languages = { "Java", "C", "Go", "Python" };
        String joinString = String.join(", ", languages);
        System.out.println("Joined Languages: " + joinString);

        System.out.println();

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex= " + startingIndex);
        System.out.println("BirthYear= " + birthDate.substring(startingIndex));

    }
}
