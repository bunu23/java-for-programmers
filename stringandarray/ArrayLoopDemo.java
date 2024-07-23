package stringandarray;

public class ArrayLoopDemo {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println("using traditional for loop");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("element at index" + i + ":" + numbers[i]);
        }

        System.out.println("Using enhanced for loop");
        for (int num : numbers) {
            System.out.println("Elemet :" + num);
        }

        System.out.println("using while loop");
        int index = 0;
        while (index < numbers.length) {
            System.out.println("Element at index " + index + "  :  " + numbers[index]);
            index++;
        }

        System.out.println("using do while loop");
        int j = 0;
        do {
            System.out.println("Element at index " + j + " : " + numbers[j]);
            index++;
        } while (j < numbers.length);
    }

}