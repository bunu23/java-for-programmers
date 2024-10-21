

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 1, 4, 5, 3, 2, 55, 32, 2);
        List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);

        List<Integer> mappedList = filteredList.stream()
                .map(x -> x / 2)
                .distinct()
                .sorted((a, b) -> b - a)
                .limit(3)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(mappedList);

        List<Integer> collect = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .skip(1)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 10)
                .distinct()
                .sorted()
                .peek(x -> System.out.println(x))
                .collect(Collectors.toList());
        System.out.println(collect);


        Integer integer = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .map(x -> x / 30)
                .distinct()
                .peek(System.out::println)
                .max((a, b) -> b - a).get();
        System.out.println(integer);


        Long l = Stream.iterate(0, x -> x + 1)
                .limit(100)
                .map(x -> x / 10)
                .distinct()
                .peek(System.out::println)
                .count();
        System.out.println(l);

        List<Integer> list2 = Arrays.asList(3, 2, 4, 2, 5, 43, 2, 4, 5, 2, 6, 7, 4, 3, 6, 8, 4, 2);
//prefer not to use in small data, parallel stream what it does it if we have huge list it will divide in chunks apply thread
        // if we have small list it will take long time if we convert it in parallel stream
        list2.parallelStream();


        //convert list to stream
        List<String> list1 = Arrays.asList("apple", "mango");
        Stream<String> myStream = list1.stream();


        // arrays to stream
        String[] array = {"apple", "mango"};
        Stream<String> stream = Arrays.stream(array);

        //comma separated
        Stream<Integer> integerStream = Stream.of(1, 3, 2);

        // loop for range
        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);

        //supplier
        Stream<Integer> limit1 = Stream.generate(() -> (int) Math.random() * 100).limit(4);


    }
}
