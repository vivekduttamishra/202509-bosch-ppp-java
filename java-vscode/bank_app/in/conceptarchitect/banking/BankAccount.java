package in.conceptarchitect.banking;

public class BankAccount{
    int accountNumber;
    String name;
    double balance;
    String password;
    


    BankAccount(int accountNumber, String name, double balance, String password){
        //this.accountNumber=++totalAccounts;
        this.accountNumber=accountNumber;
        this.name=name;
        this.balance=balance;
        this.password=password;
    }   

    public void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance+=amount;
    }

    @Override
    public String toString(){
        return "Account Number: "+accountNumber+", Name: "+name+", Balance: "+balance;
    }   


    
}