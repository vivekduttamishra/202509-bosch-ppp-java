import java.utils.ArrayList;

public class BooksDb{
    ArrayList<Book> books=new ArrayList<Book>();
    void loadBooks(){
        books.add(new Book("The Accursed God","Vivek Dutta Mishra",399,4.6));
        books.add(new Book("Rashmirathi","Ramdhari Singh Dinkar",99,4.7));
        books.add(new Book("Asura","Anant Neelkanthan",499,3.6));
        books.add(new Book("Ajya","Anant Neelkanthan",309,4.1));
        books.add(new Book("Manas","Vivek Dutta Mishra",299,4.4));        
    }

    public BooksDb(){
        loadBooks();
    }

    public ArrayList<Book> getAllBooks(){
        return books;
    }
}