package PL.SDA.Java_Zaawansowana.Kolekcje.Task2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Author p1 = Author.of("Stephen", "King");
        Author p2 = Author.of("J.K.", "Rowling");
        Author p3 = Author.of("Amy", "Tan");
        Author p4 = Author.of("Khaled", "Hosseini");
        Author p5 = Author.of("Tana", "French");
        Author p6 = Author.of("George R.R", "Martin");
        Author p7 = Author.of("Danzy", "Senna");
        Author p8 = Author.of("Atul", "Gawande");

        Set<Author> authors = new HashSet<>();
        authors.add(p1);
        authors.add(p2);
        authors.add(p3);
        authors.add(p4);
        authors.add(p5);
        authors.add(p6);
        authors.add(p7);
        authors.add(p8);

        int size = authors.size();
        System.out.println("Collection size is: " + size);

        for (Author author : authors) {
            System.out.println(author);
        }

//        Iterator<Author> iterator = authors.iterator();
//        while (iterator).hasNext()){
//    Author
//        }

        System.out.println("##################");

        for (Author author : authors) {
            if (author.getFirstName().length() + author.getLastName().length() > 11) {
                System.out.println(author);
            }
        }

        int i = 0;
        for (Author author : authors) {

            if (author.getFirstName().length() + author.getLastName().length() > 11) {
                i++;
            }
        }
        System.out.println("There is " + i + " such authors");


    }
}
