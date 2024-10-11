
public class StaticDemo {

    interface MyInterface {
        static void staticMethod() {
            System.out.println("Static method in MyInterface");
        }

        default void defaultMethod() {
            System.out.println("Default method in MyInterface");
        }

        public static void main(String[] args) {
            System.out.println("Main method in MyInterface");
            staticMethod(); // Calling the static method
        }
    }

    // Class implementing MyInterface
    static class MyClass implements MyInterface {
        @Override
        public void defaultMethod() {
            System.out.println("Overridden default method in MyClass");
        }
    }

    public static void main(String[] args) {
        // Calling the static method from the interface
        MyInterface.staticMethod();
        MyInterface.main(args);

        // Creating an instance of a class implementing MyInterface
        MyClass myClass = new MyClass();
        myClass.defaultMethod(); // Calling the default method
    }

}
