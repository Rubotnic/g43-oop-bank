package se.lexicon;

public class BankAccount {

    private  static int accountNumberSequencer = 0;


    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    //  Create a constructor that assign values to all fields
    public BankAccount(int accountNumber, double balance, String name, String email, String phoneNumber) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // second account.
    public BankAccount(double balance, String name, String email, String phoneNumber) {

        this.accountNumber = ++accountNumberSequencer;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void deposit(double amount) {
        balance = balance + amount;
    }

//    public void withdraw(double amount){
//        balance = balance - amount;


//    public void withdraw(double amount){
//        if (amount > balance){
//            System.out.println("Not Allowed");
//        } else {
//            balance = balance - amount;
//        }

    public void withdraw(double amount){
//      Exception - Red text shows stop!
        if(amount >balance)
        {
            throw new IllegalArgumentException("Amount is greater than your balance. INVALID ACTION");
        }
        balance =balance - amount;
    }


    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}