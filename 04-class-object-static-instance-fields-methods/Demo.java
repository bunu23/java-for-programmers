package classobjectstaticandinstancefieldsandmethods;

public class Demo {
    static int staticField = 10;
    int instanceField;

    public Demo(int instanceField) {
        this.instanceField = instanceField;
    }

    static void staticMethod() {
        System.out.println("this is static method");
        System.out.println("static field" + staticField);
        // Static methods can't directly access instance fields
        // System.out.println("Instance Field: " + instanceField); // This would cause
        // an error

    }

    void instanceMethod() {
        System.out.println("this is instance method");
        System.out.println("instance field : " + instanceField);
        // Instance methods can access both static and instance fields
        System.out.println("static field" + staticField);
    }

    public static void main(String[] args) {

        System.out.println("static field " + Demo.staticField);
        Demo.staticMethod();

        // creating an instance
        Demo d1 = new Demo(20);
        d1.instanceMethod();

        Demo.staticField = 50;
        d1.instanceMethod();
    }
}
