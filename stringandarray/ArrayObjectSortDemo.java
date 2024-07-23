package stringandarray;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayObjectSortDemo {

    public static void main(String[] args) {

        Person[] person = {
                new Person("Alice", 33),
                new Person("Dev", 3),
                new Person("John", 20)
        };

        Arrays.sort(person, Comparator.comparingInt(Person::getAge));

        System.out.println("Sorted by age");
        for (Person p : person) {
            System.out.println(p);
        }
    }

}
