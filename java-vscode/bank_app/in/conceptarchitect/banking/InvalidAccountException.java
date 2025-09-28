package in.conceptarchitect.banking;
public class InvalidAccountException extends BankingException{
    public InvalidAccountException(int accountNumber){
        super(accountNumber,"Invalid Account Number: "+accountNumber);
    }
}   