package src.PL.SDA.Java_Zaawansowana.Kolekcje.TaskHard;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import static src.PL.SDA.Java_Zaawansowana.Kolekcje.TaskHard.BookService.preview;
import static src.PL.SDA.Java_Zaawansowana.Kolekcje.TaskHard.BooksInitializer.initializeBooks;
import src.PL.SDA.Java_Zaawansowana.Kolekcje.TaskHard.BookService;

public class Library {

    public static void main(String[] args) {
        List<Book> books = initializeBooks();
        BookService service = new BookService(books);


        service.addBook(new Book(300L,"AAA", BigDecimal.valueOf(23d),2000, Genre.COMEDY, AuthorsInitializer.genRandomAuthors()));
        preview(books);

        System.out.println("\n\n\n\n\n");

        Iterator<Book> itr = books.iterator();
        preview(books);


    }
}