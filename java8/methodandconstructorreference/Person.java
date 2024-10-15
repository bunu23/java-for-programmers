
public class Person {

    private String name;

    // Default constructor
    public Person() {
        this.name = null;
    }

    // Constructor with a String parameter
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}