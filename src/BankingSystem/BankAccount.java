package BankingSystem;

public class BankAccount {
    private double balance;
    private String accountName;

    BankAccount(double balance, String accountName){
        this.balance = balance;
        this.accountName = accountName;
    }

    public double getBalance(){
        return balance;
    }
    public String getAccountName(){
        return accountName;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Amount Deposited: "+ amount);
            return;
        }
        System.out.println("Input valid amount pls");
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Input valid amount pls");
            return;
        }
        if (amount > balance){
            System.out.println("Insufficient Funds! You only have: "+ balance);
            return;
        }
        balance -= amount;
        System.out.println("Amount withdrawn: "+amount);

    }
    
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }

}
