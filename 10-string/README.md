# Java Strings Guide

## Table of Contents

- [Introduction to Strings](#introduction-to-strings)
- [Creating Strings](#creating-strings)
- [String Properties](#string-properties)
- [Common String Methods](#common-string-methods)
- [String Manipulation Examples](#string-manipulation-examples)
- [StringBuilder and StringBuffer](#stringbuilder-and-stringbuffer)
- [Immutable Nature of Strings](#immutable-nature-of-strings)
- [Best Practices](#best-practices)

## Introduction to Strings

In Java, a **String** is a sequence of characters used to represent text. Strings are objects of the `String` class, which provides numerous methods to manipulate and process string data.

## Creating Strings

Strings can be created in two main ways:

1. **Using String Literals**:

   ```java
   String str1 = "Hello, World!";
   ```

2. **Using the String Constructor**:
   ```java
   String str2 = new String("Hello, Java!");
   ```

### Example:

```java
public class StringCreation {
    public static void main(String[] args) {
        String literalString = "Hello, World!";
        String constructedString = new String("Hello, Java!");
        System.out.println(literalString);
        System.out.println(constructedString);
    }
}
```

## String Properties

- **Length**: You can find the length of a string using the `length()` method.
- **Empty Strings**: A string with no characters has a length of zero (`""`).
- **Blank Strings**: A string that contains only whitespace (spaces, tabs, etc.) can be checked using the `isBlank()` method (Java 11+).

## Common String Methods

### 1. **Length**

```java
int length = str.length();
```

### 2. **Character Access**

```java
char firstChar = str.charAt(0); // First character
char lastChar = str.charAt(length - 1); // Last character
```

### 3. **String Comparison**

```java
boolean isEqual = str1.equals(str2); // Value comparison
```

### 4. **Substring**

```java
String sub = str.substring(startIndex, endIndex);
```

### 5. **Index Of**

```java
int index = str.indexOf('o'); // Find index of a character
```

### 6. **Replace**

```java
String newStr = str.replace("old", "new");
```

### 7. **Trim**

```java
String trimmed = str.trim(); // Remove leading and trailing whitespace
```

### 8. **Upper and Lower Case**

```java
String upper = str.toUpperCase();
String lower = str.toLowerCase();
```

### 9. **Split**

```java
String[] parts = str.split(","); // Split by comma
```

### 10. **Join**

```java
String joined = String.join(", ", array);
```

### 11. **Format**

```java
String formatted = String.format("Name: %s, Age: %d", name, age);
```

### 12. **Is Empty**

Checks if the string is empty.

```java
boolean isEmpty = str.isEmpty();
```

### 13. **Is Blank** (Java 11+)

Checks if the string is empty or contains only whitespace.

```java
boolean isBlank = str.isBlank();
```

## String Manipulation Examples

### Example 1: String Length and Character Access

```java
public class StringManipulation {
    public static void main(String[] args) {
        String text = "Hello, World!";
        System.out.println("Length: " + text.length());
        System.out.println("First Character: " + text.charAt(0));
        System.out.println("Last Character: " + text.charAt(text.length() - 1));
    }
}
```

### Example 2: Checking for Empty or Blank Strings

```java
public class CheckString {
    public static void main(String[] args) {
        printInformation("Hey");
        printInformation("");
        printInformation("\t    \n");
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d%n", length);
        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }
        if (string.isBlank()) {
            System.out.println("String is blank");
            return;
        }
        System.out.printf("First character = '%c'%n", string.charAt(0));
        System.out.printf("Last character = '%c'%n", string.charAt(length - 1));
    }
}
```

## StringBuilder and StringBuffer

### **StringBuilder**

- Used for mutable strings (strings that can be changed).
- More efficient than `String` for concatenation in loops.
- Example:

```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(", ");
sb.append("World!");
System.out.println(sb.toString()); // Output: Hello, World!
```

### **StringBuffer**

- Similar to `StringBuilder`, but thread-safe (synchronized).
- Use when you need thread safety.

### 1. `append(String str)`

**Description**: Appends the specified string to the end of the current string.

**Usage**: Useful for building strings dynamically.

**Example**:

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(", World!"); // Appends ", World!"
System.out.println(sb.toString()); // Output: Hello, World!
```

### 2. `insert(int offset, String str)`

**Description**: Inserts the specified string at the specified position (index).

**Usage**: Useful for adding content at a specific location in the string.

**Example**:

```java
StringBuilder sb = new StringBuilder("Hello");
sb.insert(5, " Java"); // Inserts " Java" at index 5
System.out.println(sb.toString()); // Output: Hello Java
```

### 3. `delete(int start, int end)`

**Description**: Deletes the characters in a substring from the specified start index to the specified end index (exclusive).

**Usage**: Useful for removing unwanted characters or substrings.

**Example**:

```java
StringBuilder sb = new StringBuilder("Hello Java");
sb.delete(5, 10); // Deletes the substring from index 5 to 9 (" Java")
System.out.println(sb.toString()); // Output: Hello
```

### 4. `replace(int start, int end, String str)`

**Description**: Replaces the substring that begins at the specified `start` index and extends to the character at index `end` (exclusive) with the specified string.

**Usage**: Useful for modifying specific parts of the string.

**Example**:

```java
StringBuilder sb = new StringBuilder("Hello World");
sb.replace(6, 11, "Java"); // Replaces "World" with "Java"
System.out.println(sb.toString()); // Output: Hello Java
```

### 5. `reverse()`

**Description**: Reverses the characters in the `StringBuilder`.

**Usage**: Useful for reversing the entire string.

**Example**:

```java
StringBuilder sb = new StringBuilder("Hello");
sb.reverse(); // Reverses the string
System.out.println(sb.toString()); // Output: olleH
```

### 6. `toString()`

**Description**: Converts the contents of the `StringBuilder` to a `String`.

**Usage**: Useful when you need to retrieve the string representation of the `StringBuilder`.

**Example**:

```java
StringBuilder sb = new StringBuilder("Hello");
String str = sb.toString(); // Converts to String
System.out.println(str); // Output: Hello
```

### 7. `charAt(int index)`

**Description**: Returns the character at the specified index.

**Usage**: Useful for accessing specific characters in the string.

**Example**:

```java
StringBuilder sb = new StringBuilder("Hello");
char ch = sb.charAt(1); // Gets the character at index 1 ('e')
System.out.println(ch); // Output: e
```

### 8. `length()`

**Description**: Returns the length of the string (the number of characters).

**Usage**: Useful for understanding the size of the current string.

**Example**:

```java
StringBuilder sb = new StringBuilder("Hello");
int len = sb.length(); // Gets the length
System.out.println(len); // Output: 5
```

### 9. `capacity()`

**Description**: Returns the current capacity of the `StringBuilder`. The capacity is the amount of storage available for newly inserted characters.

**Usage**: Useful for understanding memory allocation.

**Example**:

```java
StringBuilder sb = new StringBuilder();
System.out.println("Initial Capacity: " + sb.capacity()); // Output: Initial Capacity: 16
```

### 10. `ensureCapacity(int minimumCapacity)`

**Description**: Ensures that the capacity is at least equal to the specified minimum capacity. If the current capacity is less than the minimum, the capacity is increased.

**Usage**: Useful for performance optimization when you know how many characters you will add.

**Example**:

```java
StringBuilder sb = new StringBuilder();
sb.ensureCapacity(50); // Ensures capacity of at least 50
System.out.println("New Capacity: " + sb.capacity()); // Output will vary based on the initial state
```

### 11. `substring(int start, int end)`

**Description**: Returns a new string that contains the characters from the specified `start` index to the specified `end` index (exclusive).

**Usage**: Useful for extracting substrings.

**Example**:

```java
StringBuilder sb = new StringBuilder("Hello World");
String sub = sb.substring(6, 11); // Gets substring from index 6 to 10
System.out.println(sub); // Output: World
```

### `StringBuilder` and `StringBuffer`

Both `StringBuilder` and `StringBuffer` share these methods, with the main difference being that `StringBuffer` is synchronized and thread-safe. However, they both provide the same functionality for building and manipulating strings efficiently.

## Immutable Nature of Strings

Strings in Java are **immutable**, meaning once a string object is created, its value cannot be changed. Any modification to a string results in a new string object being created.

## Best Practices

- Use **StringBuilder** for concatenating strings in loops for better performance.
- Always check for null or empty strings before processing to avoid `NullPointerExceptions`.
- Prefer `String` for constant and fixed-length data, while using `StringBuilder` or `StringBuffer` for dynamic content.
