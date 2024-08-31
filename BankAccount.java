public class BankAccount {
    // Private attribute to store the account balance
    private double balance;

    // Constructor to initialize the account with a starting balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
            this.balance = 0;
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else {
                System.out.println("Insufficient balance. Withdrawal failed.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display the current account balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Creating a BankAccount object with an initial balance
        BankAccount account = new BankAccount(1000);

        // Displaying the initial balance
        account.displayBalance();

        // Depositing money
        account.deposit(500);
        account.displayBalance();

        // Withdrawing money
        account.withdraw(300);
        account.displayBalance();

        // Attempting to withdraw more than the balance
        account.withdraw(1500);
        account.displayBalance();
    }
}

