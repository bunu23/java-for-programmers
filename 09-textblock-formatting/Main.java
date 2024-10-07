import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {
    // A simple text block with multi-line text and proper formatting
    String formattedTextBlock = """
        Hello, World! %s
        ----------------------------
        Welcome to Java programming.

        Here are some formatting options:

        1. **Bold Text**: Use Markdown or HTML to format text.
        2. *Italic Text*: Using Markdown style for italics.

        * List of Items:
            - Java
            - Python
            - C++

        > "The only limit to our realization of tomorrow is our doubts of today." – Franklin D. Roosevelt

        """.formatted("Here's an example of a formatted string!");

    // Output the formatted text block
    System.out.println(formattedTextBlock);

    // Another example showing a more complex formatting
    String complexTextBlock = """
        {
          "employee": {
            "name": "Alice",
            "age": 30,
            "department": "Engineering",
            "skills": [
              "Java",
              "SQL",
              "DevOps"
            ]
          }
        }
        """;

    System.out.println(complexTextBlock);

    // A simple SQL query as a text block
    String sqlQueryTextBlock = """
        SELECT name, age FROM employees
        WHERE department = 'Engineering'
        AND age > 25
        ORDER BY name ASC;
        """;

    System.out.println(sqlQueryTextBlock);

    // Sample variables for demonstration
    String name = "Alice";
    int age = 30;
    double balance = 1234.56789;
    boolean isActive = true;
    int hexValue = 255;
    int octalValue = 255;
    char firstInitial = 'A';
    LocalDate currentDate = LocalDate.now();

    // Using format specifiers in formatted strings
    System.out.println("Using Format Specifiers:");

    // String specifier
    String formattedString = "Name: %s".formatted(name);
    System.out.println(formattedString);

    // Integer specifier
    String formattedInteger = "Age: %d".formatted(age);
    System.out.println(formattedInteger);

    // Floating-point specifier with two decimal places
    String formattedFloat = "Balance: $%.2f".formatted(balance);
    System.out.println(formattedFloat);

    // Boolean specifier
    String formattedBoolean = "Active: %b".formatted(isActive);
    System.out.println(formattedBoolean);

    // Hexadecimal specifier
    String formattedHex = "Hexadecimal: %x".formatted(hexValue);
    System.out.println(formattedHex);

    // Octal specifier
    String formattedOctal = "Octal: %o".formatted(octalValue);
    System.out.println(formattedOctal);

    // Character specifier
    String formattedChar = "First Initial: %c".formatted(firstInitial);
    System.out.println(formattedChar);

    // New line specifier
    String newLineExample = "Line 1%nLine 2".formatted();
    System.out.println(newLineExample);

    // Date and time specifier
    String formattedDate = "Current Date: %s".formatted(currentDate);
    System.out.println(formattedDate);

    // Example with width and padding
    String formattedWithPadding = "Padded Integer: %05d".formatted(age);
    System.out.println(formattedWithPadding);

    // Example with left-justified output
    String leftJustified = "Left Justified: %-10s".formatted(name);
    System.out.println(leftJustified);
  }
}

/**
 * Hello, World! Here's an example of a formatted string!
 * ----------------------------
 * Welcome to Java programming.
 * 
 * Here are some formatting options:
 * 
 * 1. **Bold Text**: Use Markdown or HTML to format text.
 * 2. *Italic Text*: Using Markdown style for italics.
 * 
 * List of Items:
 * - Java
 * - Python
 * - C++
 * 
 * > "The only limit to our realization of tomorrow is our doubts of today." –
 * Franklin D. Roosevelt
 * 
 * 
 * {
 * "employee": {
 * "name": "Alice",
 * "age": 30,
 * "department": "Engineering",
 * "skills": [
 * "Java",
 * "SQL",
 * "DevOps"
 * ]
 * }
 * }
 * 
 * SELECT name, age FROM employees
 * WHERE department = 'Engineering'
 * AND age > 25
 * ORDER BY name ASC;
 * 
 * Using Format Specifiers:
 * Name: Alice
 * Age: 30
 * Balance: $1234.57
 * Active: true
 * Hexadecimal: ff
 * Octal: 377
 * First Initial: A
 * Line 1
 * Line 2
 * Current Date: 2024-10-07
 * Padded Integer: 00030
 * Left Justified: Alice
 */