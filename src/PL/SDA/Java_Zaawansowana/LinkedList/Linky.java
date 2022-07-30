package PL.SDA.Java_Zaawansowana.LinkedList;

import java.util.LinkedList;
import java.util.concurrent.Callable;

public class Linky {
    public static void main(String[] args) {

        LinkedList<String> linky = new LinkedList<>();

        linky.add("Rob");
        linky.add("Alex");
        linky.add("Jose");

        System.out.println(linky);

        CustomLinkedList test = new CustomLinkedList();

        test.insert(2);
        test.insert(3);
        test.insert(26);
        test.insert(29);
        test.insert(2343);

        test.insertAtStart(100);

        test.insertAt(2, 200);

        test.deleteAt(6);

        test.show();

    }
}
