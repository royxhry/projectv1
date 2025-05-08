package Service;

import java.util.Scanner;
import Model.Book;
import Repository.ListaBooks;

public class BookService {
    private ListaBooks listaBooks;

    public BookService(ListaBooks listaBooks) {
        this.listaBooks = listaBooks;
    }


    public void registrarLibro() {
        try {
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Ingrese el titulo del libro: ");
            String title = scanner.nextLine();
            System.out.print("Ingrese el año de publicacion: ");
            int year = scanner.nextInt();
            System.out.print("Ingrese el numero de paginas: ");
            int numPage = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Ingrese el autor del libro: ");
            String author = scanner.nextLine();
            System.out.print("Ingrese el editor del libro: ");
            String published = scanner.nextLine();
            
            Book newBook = new Book(title, year, numPage, author, published);
            listaBooks.addUserList(newBook);
            System.out.println("Libro agregado exitosamente");
            scanner.close();
        } catch (Exception e) {
          System.out.println("Ocurrio un error");        }

}
public void consultarLibros() {
    try {
        for (Book book : listaBooks.listBook) {
            System.out.println(book);
        }
        
    } catch (Exception e) {
        System.out.println("Ocurrio un error");
    }

    }
}
