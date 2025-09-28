package in.conceptarchitect.collections;

public class LinkedList<T> implements IndexedList<T> {

    class Node<T> {
        T value;
        Node<T> next;
        Node<T> previous;

        Node(T value, Node<T> next, Node<T> previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    Node<T> first;
    Node<T> last;
    int size;

    public void add(T value) {
        var newNode = new Node<T>(value, null, last);

        if (first == null) {
            first = newNode;
        }

        if (last != null) {
            last.next = newNode;
        }

        last = newNode;

        size++;
    }

    public int size() {
        return size;
    }

    private Node<T> locate(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        var current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    public T get(int index) {
        return locate(index).value;
    }

    public void set(int index, T value) {
        locate(index).value = value;    
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        var current = first;
        while (current != null) {
            builder.append(current.value);
            if (current.next != null) {
                builder.append(", ");
            }
            current = current.next;
        }

        builder.append("]");
        return builder.toString();
    }

}