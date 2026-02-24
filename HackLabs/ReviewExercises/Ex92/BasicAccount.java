package HackLabs.ReviewExercises.Ex92;

public class BasicAccount extends BankAccount {
    private double balance;

    public BasicAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false; // Withdrawal failed due to insufficient funds
        } else {
            balance -= amount;
            return true; // Withdrawal successful
        }
    }

    public double getBalance() {
        return balance;
    }
}
