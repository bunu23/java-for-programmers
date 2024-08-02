public class Demo {
    public static void main(String[] args) {


        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }
    }
}



