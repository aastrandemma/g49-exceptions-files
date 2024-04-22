package se.lexicon;

import se.lexicon.exception.InsufficientFoundsException;

public class BankAccount {
    private static int nextAccountNumber = 1000; // Starting account number
    private final int accountNumber;
    private double balance;

    public BankAccount(double initialBalance) {
        this.accountNumber = nextAccountNumber++;
        this.balance = initialBalance;
    }


    // java documentation /** enter create java documentation annotation
    /**
     * add description about the method as text IF we want
     * @param amount
     * @throws IllegalArgumentException if amount is negative
     */
    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Invalid amount! Deposit amount must be positive."); // The caller the method should handle the exception
        balance += amount;
        System.out.println("Deposit successful. Amount deposited: " + amount + " to the balance. New balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFoundsException { // Checked exceptions need to be declared in the method declaration
        if (amount < 0) throw new IllegalArgumentException("Invalid amount! Deposit amount must be positive.");
        if (amount > balance) throw new InsufficientFoundsException("Balance is insufficient");

        balance -= amount;
        System.out.println("Withdraw successful. Amount withdrawn: " + amount + " from the balance. New balance: " + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}