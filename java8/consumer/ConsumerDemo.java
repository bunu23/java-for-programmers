
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<String> printConsumer=(input)-> System.out.println(input);
        printConsumer.accept("Welcome!");
        Consumer<String> printC=(input)-> System.out.println("Printing: "+input);
        Consumer<String> upperCaseConsumer=(input)-> System.out.println("uppercase: "+input.toUpperCase());
        Consumer<String> chainedConsumer=printC.andThen(upperCaseConsumer);
        chainedConsumer.accept("java 8 consumer");
    }
}
