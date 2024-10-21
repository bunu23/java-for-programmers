
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;

public class Test {

    public static void main(String[] args) {

        // Imperative Approach

        int[] array = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        // Stream Approach
        int[] arr = { 3, 1, 5, 3, 6, 7 };
        int sum2 = Arrays.stream(arr).filter(n -> n % 2 == 0).sum();
        System.out.println(sum2);

    }
}
