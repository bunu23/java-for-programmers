
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // 1. Creating a Stream from a List
        List<String> list = Arrays.asList("jow", "joe", "john");
        Stream<String> stream = list.stream();
        System.out.println("Stream from List:");
        stream.forEach(System.out::println);

        // 2. Creating a Stream from an Array
        String[] array = { "app", "ban", "van" };
        Stream<String> myStream = Arrays.stream(array);
        System.out.println("\nStream from Array:");
        myStream.forEach(System.out::println);

        // 3. Creating a Stream using Stream.of()
        Stream<Integer> integerStream = Stream.of(4, 3, 3);
        System.out.println("\nStream using Stream.of():");
        integerStream.forEach(System.out::println);

        // 4. Creating an Infinite Stream using Stream.iterate(), but limited to 100
        // elements
        Stream<Integer> iterate = Stream.iterate(0, n -> n + 1).limit(100);
        System.out.println("\nStream using Stream.iterate(), limited to 100:");
        iterate.forEach(System.out::println);

        // 5. Creating a Stream using Stream.generate(), but limited to 4 elements
        Stream<String> limit = Stream.generate(() -> "hello").limit(4);
        System.out.println("\nStream using Stream.generate(), limited to 4:");
        limit.forEach(System.out::println);

        // 6. Stream Operations

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 2, 5);
        List<Integer> filterdList = list1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("\nusing filter");
        System.out.println(filterdList);
        System.out.println("\nmap");
        List<Integer> mappedList = filterdList.stream().map(x -> x / 2).collect(Collectors.toList());
        System.out.println(mappedList);

    }
}