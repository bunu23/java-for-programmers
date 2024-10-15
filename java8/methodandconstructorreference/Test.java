
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test {
    public void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        // Method Reference
        Test test = new Test();
        List<String> students = Arrays.asList("John", "Jow");
        // students.forEach(x-> System.out.println(x));
        // if print method method is not static
        students.forEach(test::print);
        // students.forEach(Test::print); - in case of static

        students.sort(String::compareToIgnoreCase);
        students.forEach(System.out::println);

        // constructor reference
        // List<Student> std = students.stream().map(x -> new
        // Student(x)).collect(Collectors.toList());
        List<Student> std = students.stream().map(Student::new).collect(Collectors.toList());

        Supplier<Person> personSupplier = Person::new;
        Person person = personSupplier.get();
        System.out.println(person);
        Function<String, Person> personFunction = Person::new;
        Person namedPerson = personFunction.apply("Ali");
        System.out.println(namedPerson);

    }
}
