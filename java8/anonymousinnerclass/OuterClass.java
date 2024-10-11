
import java.util.ArrayList;
import java.util.List;

public class OuterClass {
    private String instanceVariable = "outer instance variable";

    public void methodWithAnonymousInnerClass() {
        final String localVariable = "Local variable";
        List<String> names = new ArrayList<>();
        names.add("ss");
        names.add("ff");
        for (String name : names) {
            System.out.println(name);

            // Anonymous inner class
            Runnable r = new Runnable() {
                private String instanceVariable = "inner instance variable";

                @Override
                public void run() {
                    // localVariable="modi"; Compilation error: Cannot assign a value to final
                    // variable
                    System.out.println(localVariable);
                    System.out.println(this.instanceVariable); // Refers to inner instance variable
                    System.out.println(OuterClass.this.instanceVariable); // outer instance variable
                }

            };
            r.run();

        }
    }

    public void methodWithLambda() {
        String localVariable = "local variable"; // effectively final
        List<String> names = new ArrayList<>();
        names.add("ss");
        names.add("ff");
        Runnable runnable = () -> {
            // localVariable = "modi"; // Compilation error: Cannot assign a value to
            // effectively final variable
            System.out.println(localVariable);
            System.out.println(instanceVariable);
            System.out.println(this.instanceVariable);// outer instnace
            names.forEach(name -> System.out.println(name));
        };
        runnable.run();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.methodWithAnonymousInnerClass(); // Call method using anonymous inner class
        outer.methodWithLambda(); // Call method using lambda expression
    }
}
