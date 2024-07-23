package stringandarray;

import java.util.stream.Stream;

public class ArrayObjectFilterDemo {

    public static void main(String[] args) {

        Person[] people = {
                new Person("Amit", 33),
                new Person("John", 20)
        };

        System.out.println("people older than 20:");
        Stream.of(people).filter(person -> person.getAge() > 30).forEach(System.out::println);

    }

}
