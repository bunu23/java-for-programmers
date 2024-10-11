

public class MyClassMain {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello " + i);
            }
        };

        Thread thread = new Thread(r);
        thread.run();

    }
}
