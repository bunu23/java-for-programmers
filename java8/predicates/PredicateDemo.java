
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(4));
        Predicate<Integer> isPositive = num -> num > 0;

        List<Integer> numbers = Arrays.asList(3, 2, 3, 2, 1);
        numbers.stream().filter(num -> num % 2 == 0).mapToInt(n -> n).sum();

        // using and to combine predicate
        Predicate<Integer> isEvenAndPositive = isEven.and(isPositive);
        System.out.println(isEvenAndPositive.test(3));
        System.out.println(isEvenAndPositive.test(-4));
        System.out.println(isEvenAndPositive.test(4));
        // using or
        Predicate<Integer> isEvenOrPositive = isEven.or(isPositive);
        System.out.println(isEvenOrPositive.test(4));
        System.out.println(isEvenOrPositive.test(-4));
        System.out.println(isEvenOrPositive.test(3));
        // using isEqual
        Predicate<String> isHello = Predicate.isEqual("Hello");
        System.out.println(isHello.test("Hello"));
        System.out.println(isHello.test(null));
        System.out.println(isHello.test("world"));
        Predicate<String> isWorld = Predicate.isEqual("world");
        Predicate<String> isHelloOrWorld = isHello.or(isWorld);
        Predicate<String> isHelloAndNotWorld = isHello.and(isWorld.negate());
        System.out.println(isHelloOrWorld.test("java"));
        System.out.println(isHelloAndNotWorld.test("Hello"));

        Predicate<String> isString = s -> s.equals("hey");
        System.out.println(isString.test("hey"));
        Student s1 = new Student("Josh");
        Predicate<Student> studentPredicate = student -> student.getName().equals("Josh");
        System.out.println(studentPredicate.test(s1));
    }

    private static class Student {
        String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
