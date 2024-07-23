package stringandarray;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Find the length of the array
        int length = numbers.length;
        System.out.println("Length of the array: " + length);

        // Modify an element
        numbers[2] = 10;

        
        System.out.println("Modified array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
