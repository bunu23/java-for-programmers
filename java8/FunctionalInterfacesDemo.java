
import java.util.function.*;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {

        // 1. Predicate: Checks if a number is even
        Predicate<Integer> isEven = x -> x % 2 == 0; // Lambda expression to check if x is even
        System.out.println("Is 3 even? " + isEven.test(3)); // Output: false

        // 2. Function: Computes the length of a string
        Function<String, Integer> stringLength = s -> s.length(); // Lambda expression to get the length of the string
        System.out.println("Length of 'Hey': " + stringLength.apply("Hey")); // Output: 3

        // 3. Consumer: Prints a message
        Consumer<String> printMessage = s -> System.out.println("Message: " + s); // Lambda expression to print a
                                                                                  // message
        printMessage.accept("consumer"); // Output: Message: consumer

        // 4. Supplier: Generates a random double value
        Supplier<Double> randomValue = () -> Math.random(); // Lambda expression to generate a random value
        System.out.println("Random value: " + randomValue.get()); // Output: Random double value

        // 5. BiPredicate: Checks if the first number is greater than the second
        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b; // Lambda expression to compare two numbers
        System.out.println("Is 3 greater than 2? " + isGreater.test(3, 2)); // Output: true

        // 6. BiFunction: Adds two integers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b; // Lambda expression to add two numbers
        System.out.println("Sum of 2 and 1: " + add.apply(2, 1)); // Output: 3

        // 7. BiConsumer: Repeats a message a specified number of times
        BiConsumer<String, Integer> repeatMessage = (s, count) -> {
            for (int i = 0; i < count; i++) {
                System.out.println("Repeated message: " + s); // Print the message 'count' times
            }
        };
        repeatMessage.accept("hello: ", 4); // Output: hello: (four times)

        // 8. Combining interfaces to perform a sequence of operations
        // Predicate to check if the number is even
        Predicate<Integer> isEvenCheck = x -> x % 2 == 0;
        // Function to double the number
        Function<Integer, Integer> doubleValue = x -> x * 2;
        // Consumer to print the result
        Consumer<Integer> printResult = x -> System.out.println("Doubled value: " + x);
        // Supplier to supply a fixed value of 100
        Supplier<Integer> fixedValueSupplier = () -> 100;

        // Execute the combined logic
        if (isEvenCheck.test(fixedValueSupplier.get())) { // Check if the supplied value is even
            printResult.accept(doubleValue.apply(fixedValueSupplier.get())); // If even, double it and print
        }
    }
}
