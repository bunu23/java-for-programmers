package stringandarray;

public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("Hello");

        buffer.append(" World");
        System.out.println("After append: " + buffer.toString());

        buffer.insert(6, "Java ");
        System.out.println("After insert: " + buffer.toString());

        buffer.delete(6, 11);
        System.out.println("After delete: " + buffer.toString());

        buffer.reverse();
        System.out.println("After reverse: " + buffer.toString());
    }
}
