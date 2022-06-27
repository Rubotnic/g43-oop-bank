package se.lexicon;

public class Main {
    public static void main(String[] args) {

        Customer firstUser = new Customer("Stefan Stefansson", "stefan@mail.com", "123456");

        BankAccountLong userFirstAccount = new BankAccountLong(1_000, firstUser);

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


        BankAccountLong userSecondAccount = new BankAccountLong(1_000, firstUser);

        System.out.println(userFirstAccount.getAccountNumber());
        System.out.println(userSecondAccount.getAccountNumber());

        System.out.println((userFirstAccount.toString()));

    }
}