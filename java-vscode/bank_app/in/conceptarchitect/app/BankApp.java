package in.conceptarchitect.app;
import in.conceptarchitect.banking.Bank;
import in.conceptarchitect.banking.BankAccount;

public class BankApp{
    public static void main(String[] args){
        // BankAccount.interestRate=6.5;
        // var a1=new BankAccount(101,"Alice",10000,"alice@123");
        // var a2=new BankAccount(101,"Bob",20000,"bob@123");


        var bank=new Bank("HDFC",6.5);

        // var a1 = BankAccountFactory.createAccount(bank,"Alice",10000,"alice@123");
        // var a2 = Bank.openAccount(bank,"Bob",20000,"bob@123");

        var a1= bank.openAccount("Alice",10000,"alice@123");
        var a2= bank.openAccount("Bob",20000,"bob@123");

        var a3 = new BankAccount(420, "Charlie", 30000, "charlie@123"); // not allowed


       bank.showAccount(a1);
       bank.showAccount(a2);

        bank.deposit(a1,5000);

        bank.showAccount(a1);

        //System.out.println("Total Accounts: "+bank.totalAccounts);
    }
}