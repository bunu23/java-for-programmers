
import java.util.Scanner;

// Reading different datatypes
public class DifferentDataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int num = sc.nextInt();

        System.out.println("Enter a double : ");
        double decimal = sc.nextDouble();

        System.out.println("Enter a boolean");
        boolean value = sc.nextBoolean();

        System.out.println("Integer : " + num);
        System.out.println("Double : " + decimal);
        System.out.println("Boolean : " + value);

    }

}
