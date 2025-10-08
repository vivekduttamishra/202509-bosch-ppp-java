package in.conceptarchitect.collections;

public interface Task<T,R>{
    boolean init();
    void execute(T input);
    R finish();
}