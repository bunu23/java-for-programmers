package stringandarray;

public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("Hello");

        // Append text
        buffer.append(" World");
        System.out.println("After append: " + buffer.toString());

        // Insert text at a specific position
        buffer.insert(6, "Java ");
        System.out.println("After insert: " + buffer.toString());

        // Delete text from a specific range
        buffer.delete(6, 11);
        System.out.println("After delete: " + buffer.toString());

        // Reverse the string
        buffer.reverse();
        System.out.println("After reverse: " + buffer.toString());
    }
}
