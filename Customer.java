public class Customer {

    String name;
    int accountNumber;

    public Customer(String name, int accountNumber) {

        this.name = name;
        this.accountNumber = accountNumber;
    }

    public void displayCustomer() {

        System.out.println("Customer Name : " + name);
        System.out.println("Account Number : " + accountNumber);
    }
}