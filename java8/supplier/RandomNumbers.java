
import java.util.Random;
import java.util.function.Supplier;

public class RandomNumbers {
    public static void main(String[] args) {
        Supplier<Integer> supplier=()->new Random().nextInt(200);
        System.out.println(supplier.get());
    }
}
