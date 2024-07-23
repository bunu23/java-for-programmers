package stringandarray;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Hello");

        // Append text
        builder.append(" World");
        System.out.println("After append: " + builder.toString());

        // Insert text at a specific position
        builder.insert(6, "Java ");
        System.out.println("After insert: " + builder.toString());

        // Delete text from a specific range
        builder.delete(6, 11);
        System.out.println("After delete: " + builder.toString());

        // Reverse the string
        builder.reverse();
        System.out.println("After reverse: " + builder.toString());
    }
}
