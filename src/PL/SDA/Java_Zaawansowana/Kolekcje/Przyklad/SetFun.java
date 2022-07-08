package src.PL.SDA.Java_Zaawansowana.Kolekcje.Przyklad;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet; // ctrl + b


public class SetFun {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Sara");
        names.add("Andrzej");
        names.add("Hunter");
        names.add("Jakub");
        System.out.println(names.add("Sara"));


        for(String name : names) {
            System.out.println(name);
        }

        boolean empty = names.isEmpty();
        System.out.println("Collection is empty: " + empty);

        int size = names.size();
        System.out.println("Collection size is: " + size);

        boolean hunter = names.contains("Hunter");
        System.out.println("Collection contains names hunter: " + hunter);

        boolean grzegorz = names.remove("Grzegorz");
        System.out.println("Grzegorz was successfully removed: " + grzegorz);



        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<String> names2 = Set.of("Toemk", "Weronika", "Mateusz", "Klaudia");

        names.addAll(names2);

        System.out.println();
        System.out.println(names);

        names.removeAll(names2);
        System.out.println(names);

        System.out.println();



    }
}
