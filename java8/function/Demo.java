
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        // Function to get the length of a string
        Function<String, Integer> getLength = x -> x.length();
        System.out.println("Length of 'hey': " + getLength.apply("hey")); // Output: 3

        Function<String, String> getFirstFourChars = x -> x.length() >= 4 ? x.substring(0, 4) : x;

        // Function to filter students whose names start with "v"
        Function<List<Student>, List<Student>> filterStudentsByNamePrefix = studentList -> {
            List<Student> result = new ArrayList<>();
            for (Student student : studentList) {
                // Use the getFirstFourChars function to get the first four characters of the
                // student's name
                if (getFirstFourChars.apply(student.getName()).equalsIgnoreCase("vik")) {
                    result.add(student); // Add student to result if name starts with "vik"
                }
            }
            return result;
        };

        // Creating student instances
        Student s1 = new Student("vik", 3);
        Student s2 = new Student("vikky", 4);
        Student s3 = new Student("alice", 5);

        // Adding students to a list
        List<Student> studentsList = Arrays.asList(s1, s2, s3);

        // Filtering students whose names start with "vik"
        List<Student> filteredStudents = filterStudentsByNamePrefix.apply(studentsList);

        // Print the filtered students
        System.out.println("Filtered Students:");
        for (Student student : filteredStudents) {
            System.out.println(student); // Call toString to print student details
        }
    }

    // Inner class representing a Student
    private static class Student {
        private String name;
        private int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', id=" + id + '}';
        }
    }
}
