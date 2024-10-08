
public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder instance
        StringBuilder sb = new StringBuilder("Hello");

        // Appending a string
        sb.append(", World!");
        System.out.println("After Append: " + sb.toString());

        // Inserting a string
        sb.insert(5, " Java");
        System.out.println("After Insert: " + sb.toString());

        // Deleting a substring
        sb.delete(5, 10); // Deleting " Java"
        System.out.println("After Delete: " + sb.toString());

        // Replacing a substring
        sb.replace(5, 12, " Everyone");
        System.out.println("After Replace: " + sb.toString());

        // Reversing the StringBuilder
        sb.reverse();
        System.out.println("After Reverse: " + sb.toString());

        // Converting to String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
    }
}
/*
 * After Append: Hello, World!
 * After Insert: Hello Java, World!
 * After Delete: Hello, World!
 * After Replace: Hello Everyone!
 * After Reverse: !enoyrevE olleH
 * Final String: !enoyrevE olleH
 */