import java.util.ArrayList;
import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Details");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");
            choice = Integer.parseInt(sc.nextLine());

            switch(choice) {

                // ================= CREATE ACCOUNT =================
                case 1: {

                    System.out.print("Enter Account Number : ");
                    int accNo = Integer.parseInt(sc.nextLine());

                    // duplicate check
                    boolean exists = false;

                    for(BankAccount acc : accounts) {
                        if(acc.getAccountNumber() == accNo) {
                            exists = true;
                            break;
                        }
                    }

                    if(exists) {
                        System.out.println("Account Number Already Exists");
                        break;
                    }

                    System.out.print("Enter Customer Name : ");
                    String name = sc.nextLine();

                    System.out.print("Set 4-Digit PIN : ");
                    int pin = Integer.parseInt(sc.nextLine());

                    BankAccount account = new BankAccount(accNo, name, pin);
                    accounts.add(account);

                    System.out.println("Account Created Successfully");
                }
                break;

                // ================= DEPOSIT =================
                case 2: {

                    System.out.print("Enter Account Number : ");
                    int accNo = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter PIN : ");
                    int pin = Integer.parseInt(sc.nextLine());

                    boolean found = false;

                    for(BankAccount acc : accounts) {

                        if(acc.getAccountNumber() == accNo && acc.getPin() == pin) {

                            System.out.print("Enter Amount : ");
                            double amount = Double.parseDouble(sc.nextLine());

                            acc.deposit(amount);

                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Invalid Account Number or PIN");
                    }
                }
                break;

                // ================= WITHDRAW =================
                case 3: {

                    System.out.print("Enter Account Number : ");
                    int accNo = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter PIN : ");
                    int pin = Integer.parseInt(sc.nextLine());

                    boolean found = false;

                    for(BankAccount acc : accounts) {

                        if(acc.getAccountNumber() == accNo && acc.getPin() == pin) {

                            System.out.print("Enter Amount : ");
                            double amount = Double.parseDouble(sc.nextLine());

                            acc.withdraw(amount);

                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Invalid Account Number or PIN");
                    }
                }
                break;

                // ================= CHECK BALANCE =================
                case 4: {

                    System.out.print("Enter Account Number : ");
                    int accNo = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter PIN : ");
                    int pin = Integer.parseInt(sc.nextLine());

                    boolean found = false;

                    for(BankAccount acc : accounts) {

                        if(acc.getAccountNumber() == accNo && acc.getPin() == pin) {

                            System.out.println("Balance : " + acc.getBalance());

                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Invalid Account Number or PIN");
                    }
                }
                break;

                // ================= DISPLAY DETAILS =================
                case 5: {

                    System.out.print("Enter Account Number : ");
                    int accNo = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter PIN : ");
                    int pin = Integer.parseInt(sc.nextLine());

                    boolean found = false;

                    for(BankAccount acc : accounts) {

                        if(acc.getAccountNumber() == accNo && acc.getPin() == pin) {

                            acc.displayDetails();

                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Invalid Account Number or PIN");
                    }
                }
                break;

                // ================= EXIT =================
                case 6:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 6);

        sc.close();
    }
}