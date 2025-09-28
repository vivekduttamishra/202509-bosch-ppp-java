
//UNWANTED CLASS: NO MAPPING TO REAL WORLD.
public class BankAccountFactory{


    //BAD RESPONSIBILITY: WHY FACTORY IS INCREMENTING TOTAL ACCOUNTS? SHOULDN'T IT BE BANK?
    public static BankAccount createAccount(Bank bank, String name, double initialBalance, String password){
        return new BankAccount(++bank.totalAccounts, name, initialBalance, password);
    }

    //NO EXTRA VALUE ADDDITION. GO AND DIRECTLY CALL bank.openAccount
    public static BankAccount createAccountAlt(Bank bank, String name, double initialBalance, String password){

        return bank.openAccount( name, initialBalance, password);
    
    }
}