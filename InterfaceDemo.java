interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    void displayBalance();
}

class Account implements Bank {
    int accountNo;
    String name;
    double balance;

    Account(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + name);
        System.out.println("Current Balance: " + balance);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Account obj = new Account(101, "Arun", 5000);

        System.out.println("----- Account Details -----");
        obj.displayBalance();

        System.out.println("\n----- Deposit -----");
        obj.deposit(2000);
        obj.displayBalance();

        System.out.println("\n----- Withdrawal -----");
        obj.withdraw(1500);
        obj.displayBalance();
    }
}
