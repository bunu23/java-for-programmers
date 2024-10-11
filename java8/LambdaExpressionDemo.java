


@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {

        Runnable r = () -> {
            System.out.println("hey");
        };
        r.run();


        Greeting greeting = () -> {
            System.out.println(" Hello ");
        };
        greeting.sayHello();
    }


}