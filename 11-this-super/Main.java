package javaudemy.thissuper;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Child class with default constructor
        Child child1 = new Child();
        child1.display();

        System.out.println();

        // Creating an instance of Child class with parameterized constructor
        Child child2 = new Child(200);
        child2.display();
    }
}

    // Superclass (Parent)
    class Parent {
        int a;

        // Parent class constructor
        public Parent() {
            System.out.println("Parent default constructor");
        }

        // Parent class constructor with parameters
        public Parent(int a) {
            this.a = a;
            System.out.println("Parent constructor with parameter: " + a);
        }

        // Parent class method
        public void display() {
            System.out.println("Display method in Parent class: a = " + a);
        }
    }

    // Subclass (Child)
    class Child extends Parent {
        int b;

        // Child class constructor
        public Child() {
            // Calling parent class constructor with super()
            super(100);  // Invokes Parent(int a) constructor
            System.out.println("Child default constructor");
        }

        // Child class constructor with parameters
        public Child(int b) {
            this();  // Calls the default constructor of Child (which calls super())
            this.b = b;  // 'this' refers to the current object of Child
            System.out.println("Child constructor with parameter: " + b);
        }

        // Method overriding
        @Override
        public void display() {
            super.display();  // Calls Parent's display method
            System.out.println("Display method in Child class: b = " + b);
        }
    }




