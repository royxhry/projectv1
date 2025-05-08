package Repository;

import java.util.ArrayList;
import java.util.List;
import Model.Book;

public class ListaBooks {
    public List<Book> listBook = new ArrayList<>();
    
    public ListaBooks() {
        addUserList(new Book("popo", 2001, 300, "pepe", "pepe"));
        addUserList(new Book("hola", 2000, 200, "yo", "yo"));
        addUserList(new Book("Pepe", 2333, 500, "fe", "lsalk"));
        addUserList(new Book("Pepe", 2333, 500, "fe", "lsalk"));
    }

    public void addUserList(Book us) {
        listBook.add(us);
    }

    
    
    }

