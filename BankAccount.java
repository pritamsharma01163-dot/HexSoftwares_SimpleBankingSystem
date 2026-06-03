public class BankAccount {

   private int accountNumber;
   private String customerName;
   private double balance;
   private int pin;
   public int getAccountNumber() {
    return accountNumber;
}

public String getCustomerName() {
    return customerName;
}

public double getBalance() {
    return balance;
}
public int getPin() {
    return pin;
}
    public BankAccount(int accountNumber, String customerName, int pin) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = 0;
        this.pin =pin;
    }
public void deposit(double amount) {

    if(amount > 0) {
        balance += amount;
        System.out.println("Money Deposited Successfully");
    }
    else {
        System.out.println("Invalid Amount");
    }
}
 public void withdraw(double amount) {

    if(amount <= 0) {

        System.out.println("Invalid Amount");
    }
    else if(amount > balance) {

        System.out.println("Insufficient Balance");
    }
    else {

        balance -= amount;

        System.out.println("Withdrawal Successful");
    }
}
  
   
    public void displayDetails() {

        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Balance        : " + balance);
    }
}