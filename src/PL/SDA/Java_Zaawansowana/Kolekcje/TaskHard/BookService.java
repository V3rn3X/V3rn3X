package src.PL.SDA.Java_Zaawansowana.Kolekcje.TaskHard;

import java.math.BigDecimal;
import java.util.List;

public class BookService {

    private final List<Book> books;

    public BookService(List<Book> books) {
        this.books = books;
    }

    // tutaj implementujecie metody z polecenia
    // #1
    public void addBook(Book bookToAdd) {
        books.add(bookToAdd);
    }

//    public void removeBook(List<Book> books, Long index){
//        int temp = books.asList(id).indexOf(index);
//        books.remove(temp);
//    }


    public static void preview(List<Book> books){
        for(Book book : books){
            System.out.println(book);
        }

    }
}

