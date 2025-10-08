import java.util.ArrayList;
enum ApprovarStaus{
    APPROVED,REJECTED,PENDING
}
class Expense{
    int amount;
    String description;
    ApprovarStaus status=ApprovarStaus.PENDING;
    ExpenseApprovar approvar=null;

    
    public String toString() {
        return "Expense [amount=" + amount + ", description=" + description + ", status=" + status + ", Approved By "+approvar+ "]";
    }

}

interface ExpenseApprovar{

    boolean approve(Expense expense);
}

class LimitBasedExpenseApprovar implements ExpenseApprovar{
    int limit;
    String name;

    public LimitBasedExpenseApprovar(String name,int limit){
        this.name=name;
        this.limit=limit;
    }

    @Override
    public boolean approve(Expense expense) {
        if(expense.amount<=limit){
            //randomly approve or reject
            if(Math.random()>0.5)
                expense.status=ApprovarStaus.APPROVED;
            else
                expense.status=ApprovarStaus.REJECTED;
            
            return true;
        }
        else{
            expense.status=ApprovarStaus.REJECTED;
            return false;
        }
    }

    public String toString() {
        return name;
    }
}

class ExpenseApprovarChain implements ExpenseApprovar{
    ArrayList<ExpenseApprovar> approvars=new ArrayList<>();
    int count=0;

   

    public ExpenseApprovarChain add(ExpenseApprovar approvar){
        approvars.add(approvar);
        return this;
    }

    @Override
    public boolean approve(Expense expense) {
        for(var approvar:approvars){
            if(approvar.approve(expense)){
                expense.approvar=approvar;
                return true;
            }
        }
        expense.status=ApprovarStaus.REJECTED;
        return false;
    }
}

public class cor {

    public static void main(String[] args) {
      var chain = new ExpenseApprovarChain().add(new LimitBasedExpenseApprovar("Team Lead",1000))
                                              .add(new LimitBasedExpenseApprovar("Manager",10000))
                                              .add(new LimitBasedExpenseApprovar("Director",100000));


        var expenses= new Expense[]{ 
            new Expense(){{
                amount=500;
                description="Team lunch";
            }},
            new Expense(){{
                amount=1500;
                description="New chair";
            }},
            new Expense(){{
                amount=15000;
                description="New laptop";
            }},
            new Expense(){{
                amount=150000;
                description="New car";
            }}
        };

        for(var expense:expenses){
            chain.approve(expense);
            System.out.println(expense);
        }

     
    }
}