
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {

        // 1. Creating Optional
        String name = "John";
        Optional<String> optName = Optional.of(name); // Non-empty Optional
        Optional<String> emptyOpt = Optional.empty(); // Empty Optional
        Optional<String> nullableOpt = Optional.ofNullable(null); // Optional for nullable values

        // 2. Checking for Value
        if (optName.isPresent()) {
            System.out.println("Name is present: " + optName.get());
        }

        // Using ifPresent()
        optName.ifPresent(n -> System.out.println("Using ifPresent: " + n));

        // 3. Getting the Value
        // Using get() (be careful - throws NoSuchElementException if empty)
        try {
            System.out.println("Using get(): " + emptyOpt.get());
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }

        // Using orElse() - provides default value if empty
        String defaultName = emptyOpt.orElse("Default Name");
        System.out.println("Using orElse(): " + defaultName);

        // Using orElseGet() - uses Supplier function to generate default value
        String generatedName = emptyOpt.orElseGet(() -> "Generated Name");
        System.out.println("Using orElseGet(): " + generatedName);

        // Using orElseThrow() - throws an exception if value is absent
        try {
            String orElseThrowName = emptyOpt.orElseThrow(() -> new IllegalStateException("No value found"));
        } catch (Exception e) {
            System.out.println("Caught exception with orElseThrow: " + e);
        }

        // 4. Transforming Optional Values
        // Using map() - transforms the value if present
        Optional<Integer> nameLength = optName.map(String::length);
        System.out.println("Using map(): Name length is " + nameLength.orElse(0));

        // Using flatMap() - applies transformation and flattens nested Optional
        Optional<String> upperCaseName = optName.flatMap(n -> Optional.of(n.toUpperCase()));
        System.out.println("Using flatMap(): " + upperCaseName.orElse("No Value"));

        // 5. Filtering Optional Values
        // Filtering with a condition
        Optional<String> filteredName = optName.filter(n -> n.length() > 3);
        System.out.println("Using filter(): " + filteredName.orElse("Name is too short"));

        // 6. Chaining Optional Operations
        String chainedResult = optName
                .filter(n -> n.startsWith("J"))
                .map(String::toUpperCase)
                .orElse("No Match");

        System.out.println("Chaining operations result: " + chainedResult);

        // Summary of key methods:
        // of(), ofNullable(), isPresent(), get(), orElse(), orElseGet(), orElseThrow(),
        // map(), flatMap(), filter()
    }
}
