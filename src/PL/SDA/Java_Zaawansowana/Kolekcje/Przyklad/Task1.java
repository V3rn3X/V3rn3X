package src.PL.SDA.Java_Zaawansowana.Kolekcje.Przyklad;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;


public class Task1 {
    public static void main(String[] args) {

        Set<String> companyName2 = new HashSet<>();
        companyName2.add("McDonald");
        companyName2.add("KFC");
        companyName2.add("BurgerKing");
        companyName2.add("Sushi");
        companyName2.add("PizzaHut");


        Set<String> companyName = new HashSet<>(Set.of("Facebook", "Twitter", "Apple", "HunterCompany"));

        for (String name : companyName) {
            System.out.println(name);
        }

        System.out.println();

        Iterator<String> iterator = companyName2.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /////2

//        private static void printAll(Set<String> companyName) {
//            for (String name : companyName) {
//                System.out.println(name);
//            }
//        }


        /////3

        int size = companyName.size();
        System.out.println("Collection size is: " + size);

        /////4

        boolean remove = companyName.remove("Google");
        System.out.println("Grzegorz was successfully removed: " + remove);

        /////5

        for (String name : companyName) {
            System.out.println(name);
        }

        /////6

        Set<String> companyName3 = new HashSet<>();
        companyName3.addAll(companyName);

        /////7

        for (String name : companyName3) {
            System.out.println(name);
        }

        ////8

        companyName.add("KamSoft");
        companyName.add("Alan");
        companyName.add("SDA");

        ////9

        Iterator<String> iterator1 = companyName.iterator();
        while (iterator1.hasNext()) {
            String string = iterator1.next();
            if (string.length() > 6) {
                iterator1.remove();
            }
        }
        System.out.println("\n6");

        for (String name : companyName) {
            System.out.println(name);
        }

    }
}
