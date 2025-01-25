package IntroToOops;

public class Client {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("Bhavesh", 10000);
        account1.deposit(200000);
        account1.withdraw(5000);
        account1.withdraw(20000000);

        System.out.println(account1.getBalance());
        System.out.println(account1.getOwnerName());

        account1.setBalane(10021.5);
        account1.setOwnerName("Bhavesh Kumar");

        System.out.println(account1.getBalance());
        System.out.println(account1.getOwnerName());

        System.out.println("\n-Bank Statements:");
        account1.printTransactionLog();
    }
}