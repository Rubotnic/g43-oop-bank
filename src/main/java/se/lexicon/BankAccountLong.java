package se.lexicon;

public class BankAccountLong {

    private static int accountNumberSequencer = 0;

    private int accountNumber;

    private double balance;

    private Customer customer;

    // second account.
    public BankAccountLong(double balance, Customer customer) {
        this.accountNumber = ++accountNumberSequencer;
        this.balance = balance;
        this.customer = customer;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
//      Exception - Red text shows stop!
        if (amount > balance) {
            throw new IllegalArgumentException("Amount is greater than your balance. INVALID ACTION");
        }
        balance = balance - amount;
    }


    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }



    @Override
    public String toString() {
        return "BankAccountLong{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }
}