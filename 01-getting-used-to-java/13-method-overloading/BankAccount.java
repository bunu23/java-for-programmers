public class BankAccount {
private double balance;
public BankAccount(double initialBalance){
    this.balance=initialBalance;
}
public void deposit(double amount){
    balance+=amount;
    System.out.println("deposited: $" +amount);
}

public void deposit(double amount,String description){
    deposit(amount);
    System.out.println("description "+description);
}


public void withdraw(double amount){
   if(amount<=balance){
       balance-=amount;
       System.out.println("withdrew: "+amount);
   }else {
       System.out.println("Insufficient funds");
   }
}

public void withdraw(double amount, String reason){
    withdraw(amount);
    System.out.println("reason: "+reason);
}

public void displayBalance(){
    System.out.println("current balance : "+balance);
}

public void displayAccountInfo(){
    System.out.println("balance "+ balance);
    deposit(50,"Regular deposit");
    withdraw(10,"credit card withdraw");
    displayBalance();
}



public static void main(String[] args){

        BankAccount account = new BankAccount(100.0);


        account.displayAccountInfo();


        account.deposit(200);
        account.withdraw(50);


        account.displayAccountInfo();
    }
}

