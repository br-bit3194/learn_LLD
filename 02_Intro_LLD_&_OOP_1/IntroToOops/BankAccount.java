package IntroToOops;

import java.util.ArrayList;

public class BankAccount {
    private String ownerName;
    private double balance;
    private ArrayList<String> transactionLog;

    public BankAccount(){
        this.ownerName = "Unknown";
        this.balance = 0.0;
        transactionLog = new ArrayList<>();
    }

    public BankAccount(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
        transactionLog = new ArrayList<>();
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalane(double balance){
        if (balance>=0)
            this.balance = balance;
        else
            System.out.println("Invalid balance");
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public void setOwnerName(String name){
        if (name!=null && name.length()>0)
            this.ownerName = name;
        else
            System.out.println("Invalid name");
    }

    public void deposit(double amount){
        if (amount>0){
            this.balance += amount;
            transactionLog.add("Deposited: "+amount);
        }
        else
            System.out.println("Invalid amount to deposit");
    }

    public void withdraw(double amount){
        if (amount>0 && this.balance>=amount){
            this.balance -= amount;
            transactionLog.add("Withdrawn:"+amount);
            System.out.println("Withdrawal successful of amount: "+amount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    public void printTransactionLog(){
        for (String Transaction: transactionLog){
            System.out.println(Transaction);
        }
    }
}
