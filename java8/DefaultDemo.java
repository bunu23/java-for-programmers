
// Interface C with a default method
interface C {
    default void methodC() {
        System.out.println("C says hello");
    }
}

// Interface D with a default method
interface D {
    default void methodC() {
        System.out.println("D says hello");
    }
}

// Class DefaultDemo implements both interfaces C and D
public class DefaultDemo implements C, D {

    public static void main(String[] args) {
        // Create an instance of DefaultDemo
        DefaultDemo demo = new DefaultDemo();

        // Call the overridden methodC
        demo.methodC();
    }

    @Override
    public void methodC() {
        // Optionally call the default methods from interfaces C or D
        // Uncomment the lines below to see the default behavior
        // C.super.methodC(); // Calls C's implementation
        // D.super.methodC(); // Calls D's implementation

        // Custom implementation
        System.out.println("You can write your own implementation");
    }
}
