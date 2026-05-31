public class BankAccount {

    String name;
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("const call");
    }



    // Deposit Method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
         else {
            System.out.println("Insufficient Balance");
        }
    }



    // Display Method
    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Susmitha", 12345, 10000);
        BankAccount c1 = new BankAccount("Saikarthick", 123456, 20000);

        b1.display();
        c1.display();

        b1.deposit(5000);
        b1.display();

        b1.withdraw(3000);
        b1.display();



        b1.withdraw(2000);  // Insufficient case
        b1.display();
    }
}