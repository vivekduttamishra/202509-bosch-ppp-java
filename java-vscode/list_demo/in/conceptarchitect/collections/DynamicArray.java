package in.conceptarchitect.collections;

public class DynamicArray<T> implements IndexedList<T> {

    T[] array;
    int size;

    @SuppressWarnings("unchecked")
    public DynamicArray(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public DynamicArray() {
        this(4);
    }

    @Override
    public void add(T value) {
        if (size == array.length) {
            resize();
        }
        array[size] = value;
        size++;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public int size() {
        return size;
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    @Override
    public T get(int index) {
        validateIndex(index);
        return array[index];
    }

    @Override
    public void set(int index, T value) {
        validateIndex(index);
        array[index] = value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < size; i++) {
            builder.append(array[i]);
            if (i < size - 1) {
                builder.append(", ");
            }
        }

        builder.append("]");
        return builder.toString();
    }
}