
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("v");
        Consumer<List<Integer>> listConsumer = x -> {
            for (Integer i : x) {
                System.out.println(i + 2);
            }
        };
        Consumer<List<Integer>> listConsumer1 = li -> {
            for (Integer i : li) {
                System.out.println(i);
            }
        };
        listConsumer1.andThen(listConsumer).accept(Arrays.asList(3, 2, 1));
        System.out.println();
        listConsumer.accept(Arrays.asList(1, 2, 3, 2));

    }
}
