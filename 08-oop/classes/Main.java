
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("iwd");
        car.setDoors("4");
        car.setColor("Blue");
        car.setConvertible(true);
        System.out.println("color: " + car.getColor());
        car.describeCar();

        Bank bankAccount = new Bank("123456789", "Alice Smith", "alice@example.com", "123-456-7890");

        System.out.println(bankAccount);

        bankAccount.deposit(5000);

        bankAccount.withdraw(200);

        bankAccount.withdraw(6000); // This should show insufficient funds

        System.out.println("Final Account Balance: " + bankAccount.getAccountBalance());
    }
}