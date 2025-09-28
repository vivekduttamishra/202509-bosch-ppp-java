package in.conceptarchitect.banking;
public class BankingException extends RuntimeException{
 
    int accountNumber;
    public BankingException(int accountNumber,String message){
        super(message);
    }

    public int getAccountNumber(){
        return accountNumber;
    }
}