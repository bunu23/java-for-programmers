package controlflow;

public class DemoTwo {


    public static double calculateInterest(double amount, double interest) {
        return amount * (interest / 100);
    }

    public static void main(String[] args) {
        // First loop: Calculate and display interest for a principal amount of 1000
        // with interest rates ranging from 2.0% to 5.0% (inclusive) with 1% increment.

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(1000, rate);
            System.out.println("1000 at " + rate + "% interest = " + interestAmount);
        }

        // Second loop: Calculate and display interest for a principal amount of 30000
        // with interest rates ranging from 7.5% to 10.0% (inclusive) with 0.35% increment.

        for (double i = 7.5; i <= 10; i += 0.35) {
            double interest = calculateInterest(30000, i);
            System.out.println("30000 at " + i + "% interest = " + interest);
        }
    }
}
