
public class Bank {
    private String accountNumber;
    private long accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Constructor to initialize the account
    public Bank(String accountNumber, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountBalance = 0;
    }

    public void deposit(long amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited: " + amount + ". New Balance: " + accountBalance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(long amount) {
        if (amount > 0) {
            if (accountBalance >= amount) {
                accountBalance -= amount;
                System.out.println("Withdrew: " + amount + ". New Balance: " + accountBalance);
            } else {
                System.out.println("Insufficient funds. Current Balance: " + accountBalance);
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Customer Name: " + customerName + ", Balance: " + accountBalance;
    }
}
