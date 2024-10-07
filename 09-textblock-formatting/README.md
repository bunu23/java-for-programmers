# Understanding Text Blocks and String Formatting in Java

## Table of Contents

- [What are Text Blocks?](#what-are-text-blocks)
- [Benefits of Text Blocks](#benefits-of-text-blocks)
- [How to Use Text Blocks](#how-to-use-text-blocks)
- [What is String Formatting?](#what-is-string-formatting)
- [Using Format Specifiers](#using-format-specifiers)
- [Examples](#examples)

## What are Text Blocks?

Text blocks are a feature introduced in Java 13 that allow to create multi-line string literals more easily and readably. They eliminate the need for concatenation and escape sequences for special characters.

**Syntax**:
Text blocks are enclosed within triple quotes (`"""`) and can span multiple lines.

### Example:

```java
String textBlock = """
    Hello, World!
    This is a multi-line text block.
    You can include "quotes" without escaping them.
    """;
```

## Benefits of Text Blocks

- **Improved Readability**: Text blocks allow for cleaner and more organized code.
- **No Need for Escape Sequences**: You can include special characters (like quotes) without the need for backslashes.
- **Automatic Formatting**: Indentation in text blocks is preserved, making it easier to maintain the structure.

## How to Use Text Blocks

1. **Creating a Text Block**:
   To create a text block, simply use triple quotes. For example:

   ```java
   String greeting = """
       Welcome to Java Programming!
       Let's learn about text blocks and formatting.
       """;
   ```

2. **Using Formatting with Text Blocks**:
   You can also embed formatted strings within text blocks using the `formatted()` method. This allows you to insert dynamic content.

   ```java
   String name = "Alice";
   String message = """
       Hello, %s!
       Welcome to our Java course.
       """.formatted(name);
   ```

## What is String Formatting?

String formatting in Java allows you to create formatted strings by specifying placeholders in a string. The placeholders are replaced by values using various format specifiers.

### Common Format Specifiers:

- `%s` - String
- `%d` - Integer
- `%f` - Floating-point number
- `%b` - Boolean
- `%x` - Hexadecimal representation
- `%o` - Octal representation
- `%c` - Character

## Using Format Specifiers

You can format strings using the `String.format()` method or the `formatted()` method introduced in Java 15.

### Example:

```java
String name = "Alice";
int age = 30;
double balance = 1234.567;

String formattedString = "Name: %s, Age: %d, Balance: $%.2f".formatted(name, age, balance);
System.out.println(formattedString);
```

### Output:

```
Name: Alice, Age: 30, Balance: $1234.57
```

## Examples

### Example 1: Using Text Blocks

```java
String jsonString = """
    {
      "name": "Alice",
      "age": 30,
      "department": "Engineering"
    }
    """;

System.out.println(jsonString);
```

### Example 2: Formatting with Placeholders

```java
String item = "Java";
int quantity = 5;
double price = 12.99;

String formattedReceipt = "Item: %s, Quantity: %d, Total Price: $%.2f".formatted(item, quantity, price * quantity);
System.out.println(formattedReceipt);
```

### Example 3: Using Date Formatting

```java
import java.time.LocalDate;

LocalDate today = LocalDate.now();
String formattedDate = "Today's date is: %s".formatted(today);
System.out.println(formattedDate);

```
