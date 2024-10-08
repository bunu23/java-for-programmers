package javaudemy.constructor;

// Superclass (Parent)
class Parent {
    int x;

    // Parent class default constructor
    public Parent() {
        System.out.println("Parent default constructor");
    }

    // Parent class constructor with parameter
    public Parent(int x) {
        this.x = x;
        System.out.println("Parent constructor with parameter: " + x);
    }
}

// Subclass (Child)
class Child extends Parent {
    int y;

    // Child class default constructor
    public Child() {
        super(10);  // Calls the parent constructor with parameter
        System.out.println("Child default constructor");
    }

    // Child class constructor with parameter
    public Child(int y) {
        this();  // Calls the Child default constructor
        this.y = y;  // 'this' refers to the current instance of Child
        System.out.println("Child constructor with parameter: " + y);
    }
}

// Renaming 'Main' to 'ConstructorExample'
public class ConstructorExample {
    public static void main(String[] args) {
        // Creating an object of Child using default constructor
        Child child1 = new Child();

        System.out.println();

        // Creating an object of Child using parameterized constructor
        Child child2 = new Child(20);
    }
}
