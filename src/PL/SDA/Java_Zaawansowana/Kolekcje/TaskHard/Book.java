package PL.SDA.Java_Zaawansowana.Kolekcje.TaskHard;

import java.math.BigDecimal;
import java.util.List;

public class Book {

    private final Long id;
    private final String title;
    private final BigDecimal price;
    private final Integer year;
    private final Genre genre;
    private final List<Author> authors;

    public Book(Long id, String title, BigDecimal price, Integer year, Genre genre, List<Author> authors) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.year = year;
        this.genre = genre;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", genre=" + genre +
                ", authors=" + authors +
                '}';
    }
}

enum Genre {
    COMEDY, DRAMA, THRILLER, HORROR, FICTION
}


