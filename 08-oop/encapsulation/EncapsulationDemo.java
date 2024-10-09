
public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", 500.0);

        // Displaying account information
        System.out.println("Account Number: " + myAccount.getAccountNumbers());
        System.out.println("Initial Balance: " + myAccount.getBalance());

        // Performing deposit
        myAccount.deposit(150.0);
        System.out.println("New Balance after deposit: " + myAccount.getBalance());

        // Performing withdrawal
        myAccount.withdraw(100.0);
        System.out.println("New Balance after withdrawal: " + myAccount.getBalance());

        // Attempting to withdraw an invalid amount
        myAccount.withdraw(600.0);
    }
}

class BankAccount {
    private String accountNumbers;
    private double balance;

    public BankAccount(String accountNumbers, double balance) {
        this.accountNumbers = accountNumbers;
        this.balance = balance;
    }

    public String getAccountNumbers() {
        return accountNumbers;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("withdraw : " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }

}