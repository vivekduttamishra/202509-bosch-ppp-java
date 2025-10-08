
import in.conceptarchitect.collections.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


class IndexFinder<T> implements Task<T, Integer>{
    int index=-1;
    T value;
    int currentIndex=-1;

    public IndexFinder(T value){
        this.value=value;
    }

    @Override
    public boolean init() {
        index=-1;
        currentIndex=-1;
        return true;
    }

    @Override
    public void execute(T input) {
        currentIndex++;
        if(input.equals(value) && index==-1)
            index=currentIndex;
    }

    @Override
    public Integer finish() {
        return index;
    }
}

class SaveValues<T> implements Task<T,Boolean>{
    String fileName;
    PrintWriter writer;
    public SaveValues(String fileName){
        this.fileName=fileName;
    }

    public boolean init(){
        try{
            writer=new PrintWriter(new FileWriter(fileName));
            return true;
        }
        catch(IOException ex){
            System.out.println("Could not open file "+fileName);
            return false;
        }
    }

    public void execute(T value){
        writer.println(value);
    }

    public Boolean finish(){
        writer.close();
        return true;
    }
}

public class Program{

    

    public static void main(String[] args) {

        int [] values={2,3,9,11,4,2,8};
        var list = new LinkedList<Integer>();
        for(var v:values)
            list.add(v);

        System.out.println(list);
        int []test={2,8,15,4};

        for(var v:test){
            var finder=new IndexFinder<Integer>(v);
            var index=list.execute(finder);
            System.out.println("Index of "+v+" is "+index);
        }

        list.execute(new SaveValues<Integer>("numbers.txt"));


    }

    static void testList(IndexedList<String> list) {
        list.add("Hello");
        list.add("World");
        list.add("This");
        list.add("is");
        list.add("Java");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.set(2, "was");
        list.set(3, "not");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}