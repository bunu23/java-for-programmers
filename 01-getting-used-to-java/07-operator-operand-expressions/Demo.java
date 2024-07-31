public class Demo {
    public static void main(String[] args) {

        int result=2+2;
        System.out.println(result);

        int prevResult=result;
        result=result-1;

        System.out.println(prevResult);

        System.out.println(result);

        char first='g';
        char second='S';
        System.out.println(first+second); //186 result number in memory get added


        int a = 10;
        int b = 5;
        double x = 12.5;
        double y = 3.5;

        // Arithmetic Operators
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        double doubleSum = x + y;
        double doubleDifference = x - y;
        double doubleProduct = x * y;
        double doubleQuotient = x / y;


        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + difference);
        System.out.println("a * b = " + product);
        System.out.println("a / b = " + quotient);
        System.out.println("a % b = " + remainder);

        System.out.println("\nDouble Arithmetic Operators:");
        System.out.println("x + y = " + doubleSum);
        System.out.println("x - y = " + doubleDifference);
        System.out.println("x * y = " + doubleProduct);
        System.out.println("x / y = " + doubleQuotient);

        // Relational Operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreater = (a > b);
        boolean isLess = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);



        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isGreater);
        System.out.println("a < b: " + isLess);
        System.out.println("a >= b: " + isGreaterOrEqual);
        System.out.println("a <= b: " + isLessOrEqual);


        // Logical Operators
        boolean andResult = (a > 0) && (b > 0);
        boolean orResult = (a > 0) || (b < 0);
        boolean notResult = !(a < b);
        System.out.println("\nLogical Operators:");
        System.out.println("(a > 0) && (b > 0): " + andResult);
        System.out.println("(a > 0) || (b < 0): " + orResult);
        System.out.println("!(a < b): " + notResult);

        // Increment and Decrement Operators
        int incrementedA = ++a; // Pre-increment
        int decrementedB = --b; // Pre-decrement

        System.out.println("\nIncrement and Decrement Operators:");
        System.out.println("++a: " + incrementedA);
        System.out.println("--b: " + decrementedB);






    }

    }

