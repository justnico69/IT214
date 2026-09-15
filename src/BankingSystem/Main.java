package BankingSystem;

public class Main {
    static void main(String[] args) {

        BankAccount bank = new BankAccount(700.60,"Stark");

        System.out.println("Account Name: "+bank.getAccountName());
        System.out.println("Current balance: "+bank.getBalance());
//        System.out.println(bank.getAccountName());

        bank.deposit(300);
        System.out.println("New balance: "+bank.getBalance());

        System.out.println("===================================");

        bank.withdraw(500);
        System.out.println("New balance: "+bank.getBalance());

        bank.withdraw(300);
        System.out.println("New balance: "+bank.getBalance());

        bank.withdraw(500);
        System.out.println("New balance: "+bank.getBalance());




    }
}
