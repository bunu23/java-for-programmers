public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Default constructor
        Dog myDog1 = new Dog("V"); // Constructor with one parameter
        Dog myDog2 = new Dog("v", 2); // Constructor with two parameters

        myDog.bark(); // Output: unknown says woof!
        myDog1.display(); // Output: Dog's Name: V, Age: 0
        myDog2.display(); // Output: Dog's Name: v, Age: 2
        myDog.display(); // Output: Dog's Name: unknown, Age: 0
    }
}

class Dog {
    String name; // Instance variable
    int age; // Instance variable

    // Default constructor
    Dog() {
        name = "unknown"; // Default name
        age = 0; // Default age
    }

    /*
     * chaining a constructor
     * Dog() {
     * this("unknown", 0); // Calls the constructor with default values
     * }
     * 
     */

    // Constructor with one parameter
    Dog(String dogName) {
        name = dogName;
        age = 0; // Default age
    }

    // Constructor with two parameters
    Dog(String dogName, int dogAge) {
        name = dogName;
        age = dogAge;
    }

    void bark() {
        System.out.println(name + " says woof!");
    }

    void display() {
        System.out.println("Dog's Name: " + name + ", Age: " + age);
    }
}
