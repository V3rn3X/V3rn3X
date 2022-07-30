package PL.SDA.Java_Zaawansowana.Kolekcje.TaskHard;

import PL.SDA.Java_Zaawansowana.Kolekcje.TaskHard.Author;
import PL.SDA.Java_Zaawansowana.Kolekcje.TaskHard.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AuthorsInitializer {

    private final static List<Author> authors = initializeAuthors();

    public static List<Author> getAuthors() {
        return authors;
    }

    public static List<Author> genRandomAuthors() {
        Random random = new Random();
        int numberOfAuthors = random.nextInt(3);
        int size = authors.size();
        List<Author> randomAuthors = new ArrayList<>();
        for (int i = 0; i < numberOfAuthors; i++) {
            int randomId = random.nextInt(size);
            randomAuthors.add(authors.get(randomId));
        }
        return randomAuthors;
    }

    private static List<Author> initializeAuthors() {
        return new ArrayList<>(
                List.of(
                        new Author(1L, "Lynde", "Byrne", Gender.F),
                        new Author(2L, "Mariele", "Fitzsimmons", Gender.M),
                        new Author(3L, "Marita", "Lorenz", Gender.M),
                        new Author(4L, "Lauryn", "Ahab", Gender.F),
                        new Author(5L, "Fawne", "Raychel", Gender.M),
                        new Author(6L, "Donetta", "Hartnett", Gender.M),
                        new Author(7L, "Mathilda", "Amadas", Gender.F),
                        new Author(8L, "Benita", "Ferino", Gender.F),
                        new Author(9L, "Jennica", "Fleeta", Gender.F),
                        new Author(10L, "Jerry", "Jacqui", Gender.M),
                        new Author(11L, "Rhoda", "Korey", Gender.F),
                        new Author(12L, "Corry", "Khorma", Gender.F),
                        new Author(13L, "Konstance", "Japeth", Gender.F),
                        new Author(14L, "Dorothy", "Alva", Gender.F),
                        new Author(15L, "Sandie", "Bury", Gender.M),
                        new Author(16L, "Carly", "Kendrick", Gender.M),
                        new Author(17L, "Ethel", "Belldas", Gender.M),
                        new Author(18L, "Stacey", "Teryn", Gender.F),
                        new Author(19L, "Amara", "Aldric", Gender.F),
                        new Author(20L, "Rosene", "Kunin", Gender.F),
                        new Author(21L, "Kenna", "Ietta", Gender.F),
                        new Author(22L, "Dode", "Hedve", Gender.M),
                        new Author(23L, "Helena", "Lubin", Gender.M),
                        new Author(24L, "Siana", "Odell", Gender.M),
                        new Author(25L, "Madelle", "Wandie", Gender.F),
                        new Author(26L, "Rhoda", "Hurley", Gender.F),
                        new Author(27L, "Alia", "Henrie", Gender.F),
                        new Author(28L, "Lita", "Yate", Gender.M),
                        new Author(29L, "Allyce", "Jess", Gender.M),
                        new Author(30L, "Heida", "Vittoria", Gender.M),
                        new Author(31L, "Georgina", "Barrus", Gender.M),
                        new Author(32L, "Susette", "Kendrick", Gender.M),
                        new Author(33L, "Hannis", "Lory", Gender.F),
                        new Author(34L, "Gratia", "Bultman", Gender.F),
                        new Author(35L, "Yetty", "Cornelia", Gender.F),
                        new Author(36L, "Marcelline", "Drisko", Gender.F),
                        new Author(37L, "Reeba", "Noam", Gender.M),
                        new Author(38L, "Babita", "Chauncey", Gender.M),
                        new Author(39L, "Bee", "Beebe", Gender.M),
                        new Author(40L, "Dorothy", "Seessel", Gender.F),
                        new Author(41L, "Jerry", "Loleta", Gender.F),
                        new Author(42L, "Ana", "Old", Gender.M),
                        new Author(43L, "Bobbi", "Gunn", Gender.F),
                        new Author(44L, "Bibby", "Genna", Gender.F),
                        new Author(45L, "Cam", "Fredi", Gender.M),
                        new Author(46L, "Lenna", "Lemuela", Gender.M),
                        new Author(47L, "Jessamyn", "Maiah", Gender.M),
                        new Author(48L, "Joleen", "Agle", Gender.M),
                        new Author(49L, "Barbi", "Travax", Gender.F),
                        new Author(50L, "Kara - Lynn", "Beniamino", Gender.M),
                        new Author(51L, "Ira", "Kesley", Gender.M),
                        new Author(52L, "Rosabelle", "Bari", Gender.M),
                        new Author(53L, "Trudie", "Kazimir", Gender.F),
                        new Author(54L, "Lucy", "Eachern", Gender.M),
                        new Author(55L, "Moyna", "Croix", Gender.F),
                        new Author(56L, "Jillayne", "Leler", Gender.M),
                        new Author(57L, "Charissa", "Seagraves", Gender.M),
                        new Author(58L, "Jobi", "Carey", Gender.F),
                        new Author(59L, "Malina", "Braun", Gender.F),
                        new Author(60L, "Janis", "Donoghue", Gender.F),
                        new Author(61L, "Tarra", "Delp", Gender.F),
                        new Author(62L, "Corry", "Lindemann", Gender.F),
                        new Author(63L, "Esmeralda", "Moina", Gender.M),
                        new Author(64L, "Dari", "Emmaline", Gender.F),
                        new Author(65L, "Farrah", "Maribeth", Gender.M),
                        new Author(66L, "Reeba", "Hessler", Gender.F),
                        new Author(67L, "Bibby", "Croix", Gender.M),
                        new Author(68L, "Laurene", "Meli", Gender.F),
                        new Author(69L, "Jinny", "Tremayne", Gender.M),
                        new Author(70L, "Alyssa", "Shuler", Gender.M),
                        new Author(71L, "Calla", "Gahl", Gender.M),
                        new Author(72L, "Evaleen", "Lalitta", Gender.F),
                        new Author(73L, "Lenna", "Ioab", Gender.M),
                        new Author(74L, "Carolina", "Kelula", Gender.F),
                        new Author(75L, "Mureil", "Cavan", Gender.M),
                        new Author(76L, "Lizzie", "Pitt", Gender.F),
                        new Author(77L, "Chandra", "Vittoria", Gender.M),
                        new Author(78L, "Lily", "Hirsch", Gender.F),
                        new Author(79L, "Mallory", "Yate", Gender.F),
                        new Author(80L, "Natka", "Weaks", Gender.M),
                        new Author(81L, "Lisette", "Ethban", Gender.M),
                        new Author(82L, "Kassey", "Susannah", Gender.M),
                        new Author(83L, "Madeleine", "Allare", Gender.M),
                        new Author(84L, "Drucie", "Tomasina", Gender.M),
                        new Author(85L, "Sonni", "Ariella", Gender.M),
                        new Author(86L, "Corene", "Ummersen", Gender.M),
                        new Author(87L, "Gerrie", "Firmin", Gender.M),
                        new Author(88L, "Gavrielle", "Adamsen", Gender.M),
                        new Author(89L, "Lorne", "Reinke", Gender.M),
                        new Author(90L, "Sadie", "Hollingsworth", Gender.F),
                        new Author(91L, "Stephanie", "Marcellus", Gender.F),
                        new Author(92L, "Brietta", "Karl", Gender.M),
                        new Author(93L, "Binny", "Edison", Gender.M),
                        new Author(94L, "Flo", "Brackely", Gender.M),
                        new Author(95L, "Emma", "Gilbertson", Gender.M),
                        new Author(96L, "Edee", "Annabella", Gender.F),
                        new Author(97L, "Rosabelle", "Ellord", Gender.M),
                        new Author(98L, "Devina", "Jobi", Gender.F),
                        new Author(99L, "Steffane", "Anastatius", Gender.M),
                        new Author(100L, "Ileana", "Ivens", Gender.M)
                ));
    }
}