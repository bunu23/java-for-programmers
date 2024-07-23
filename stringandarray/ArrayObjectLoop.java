package stringandarray;

public class ArrayObjectLoop {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Joe", 30),
                new Person("Alex", 20),
                new Person("Alexa", 12)
        };

        System.out.println(" for loop");
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("person at index" + i + ":" + person);
        }
        // Enhanced for loop to iterate over the array
        System.out.println("Using enhanced for loop:");
        for (Person person : people) {
            System.out.println("Person: " + person);
        }

        // int index = 0;
        // System.out.println("Using while loop:");
        // while (index < people.length) {
        // Person person = people[index];
        // System.out.println("Person at index " + index + ": " + person);
        // index++;
        // }

        int j = 0;
        System.out.println("Using do-while loop:");
        do {
            Person person = people[j];
            System.out.println("Person at index " + j + ": " + person);
            j++;
        } while (j < people.length);
    }
}
