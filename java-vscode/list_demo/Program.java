
import in.conceptarchitect.collections.*;


public class Program{
    public static void main(String[] args) {

        testList(new DynamicArray<String>());
        testList(new LinkedList<String>());

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