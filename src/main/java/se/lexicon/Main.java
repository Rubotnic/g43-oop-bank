package se.lexicon;

public class Main {
    public static void main(String[] args) {

        BankAccount userFirstAccount = new BankAccount(1_000, "Stefan Stefansson", "stefan@mail.com", "123456");

//      - add money
//      userFirstAccount.deposit(1_000);
//      System.out.println(userFirstAccount.getBalance());

//      - remove money
        userFirstAccount.withdraw(300);
        System.out.println(userFirstAccount.getBalance());


//      - get
//      userFirstAccount.getAccountNumber();
//
//      - set
//      userFirstAccount.setAccountNumber(10);


        BankAccount userSecondAccount = new BankAccount(1_000, "Stefan Stefansson", "stefan@mail.com", "123456");

        System.out.println(userFirstAccount.getAccountNumber());
        System.out.println(userSecondAccount.getAccountNumber());

    }
}