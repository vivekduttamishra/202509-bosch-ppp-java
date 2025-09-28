package in.conceptarchitect.banking;
import java.util.HashMap;

public class Bank{
    double interestRate;
    int totalAccounts=0;
    String name;

    HashMap<Integer,BankAccount> accounts=new HashMap<>();


    public Bank(String name,double interestRate){
        this.name=name;
        this.interestRate=interestRate;
    }

    public int openAccount(String name,double initialBalance,String password){
        // can't share account object outside bank
       // return new BankAccount(++totalAccounts,name,initialBalance,password);
       var account= new BankAccount(++totalAccounts,name,initialBalance,password);
       accounts.put(account.accountNumber,account);
       return account.accountNumber;


    }

    private BankAccount getAccount(int accountNumber){
        var account=accounts.get(accountNumber);
        if(account==null){
            throw new InvalidAccountException(accountNumber);
        }

        return account;
    }

    public void deposit(int accountNumber,double amount){
        var account=getAccount(accountNumber);
        account.deposit(amount);
    }

    //UNWANTED METHOD: WHY STATIC? YOU ARE ANYWAY TRYING TO ACCESS BANK OBJECT. MAKE IT NON-STATIC
    public static  BankAccount openAccount(Bank bank, String name,double initialBalance,String password){
        return new BankAccount(++bank.totalAccounts,name,initialBalance,password);
    }

    public void showAccount(int accountNumber){
        System.out.println(getAccount(accountNumber));
    }
}