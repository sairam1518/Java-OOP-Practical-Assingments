
class Account {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    Account(String name, int number, double amount) {
        accountHolder = name;
        accountNumber = number;
        balance = amount;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully!");
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }

    void display() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Available Balance: Rs. " + balance);
    }
}

public class BankAccount {

    public static void main(String[] args) {

        Account a = new Account("Rahul", 12345, 10000);

        a.display();

        a.deposit(5000);
        a.withdraw(2000);

        a.display();
    }
}
