package in.conceptarchitect.collections;

public interface IndexedList<T> {
    void add(T value);
    int size();
    T get(int index);
    void set(int index, T value);
}




