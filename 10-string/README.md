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

## Immutable Nature of Strings

Strings in Java are **immutable**, meaning once a string object is created, its value cannot be changed. Any modification to a string results in a new string object being created.

## Best Practices

- Use **StringBuilder** for concatenating strings in loops for better performance.
- Always check for null or empty strings before processing to avoid `NullPointerExceptions`.
- Prefer `String` for constant and fixed-length data, while using `StringBuilder` or `StringBuffer` for dynamic content.
