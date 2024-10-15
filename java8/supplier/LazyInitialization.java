

import java.util.function.Supplier;

public class LazyInitialization {
    public static void main(String[] args) {
        Supplier<ExpensiveObject> objectSupplier = () -> new ExpensiveObject();
        System.out.println("before calling get()");
        ExpensiveObject obj=objectSupplier.get();

    }
}

class ExpensiveObject {
    ExpensiveObject() {
        System.out.println("expensive object created");
    }
}
