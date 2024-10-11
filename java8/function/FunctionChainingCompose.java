import java.util.function.Function;

public class FunctionChainingCompose {
    public static void main(String[] args) {
        // Function to add 10 to a number
        Function<Integer, Integer> addTen = num -> num + 10;

        // Function to double the result
        Function<Integer, Integer> doubleIt = num -> num * 2;

        // Chain the functions: First double, then add 10
        Function<Integer, Integer> chainedFunction = addTen.compose(doubleIt);

        // Apply the chained function
        Integer result = chainedFunction.apply(5); // First, double 5 (10), then add 10 (20)

        System.out.println("Result of compose chain: " + result); // Output: 20
    }
}
