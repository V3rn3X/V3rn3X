package PL.Password.Generator;

import java.util.Scanner;
import java.util.Set;

import static PL.Password.Generator.CommonlyMethods.clearConsole;

public class Tab {


    private static boolean activateLittle = true;
    private static boolean activateBig = true;
    private static boolean activateNumber = true;
    private static boolean activateSymbol = true;
    private static String phrase = "";
    private static int howLong = 6;

    private static String password = "";


    private static final Set<String> LITTLE = Set.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
    private static final Set<String> BIG = Set.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
    private static final Set<String> NUMBER = Set.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
    private static final Set<String> SYMBOL = Set.of("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+", "/", "?", ",", ".", "<", ">");


    public static boolean isActivateLittle() {
        return activateLittle;
    }

    public static void setActivateLittle(boolean activateLittle1) {
        activateLittle = activateLittle1;
    }

    public static boolean isActivateBig() {
        return activateBig;
    }

    public static void setActivateBig(boolean activateBig1) {
        activateBig = activateBig1;
    }

    public static boolean isActivateNumber() {
        return activateNumber;
    }

    public static void setActivateNumber(boolean activateNumber1) {
        activateNumber = activateNumber1;
    }

    public static boolean isActivateSymbol() {
        return activateSymbol;
    }

    public static void setActivateSymbol(boolean activateSymbol1) {
        activateSymbol = activateSymbol1;
    }

    public static String getPhrase() {
        return phrase;
    }

    public static String phrase() {
        clearConsole();
        System.out.println("Please provide phrase that must occur:\n   [Press Enter to set empty]\n");
        Scanner scanner = new Scanner(System.in);
        phrase = scanner.nextLine();

        if (getPhrase().length() >= getHowLong()) {
            setHowLong1();
        }

        return phrase;
    }

    public static void phrase1() {
        phrase = "";
    }

    public static void passWithPhrase() {
        int max = getHowLong() - getPhrase().length();
        int min = 0;
        int range = max - min + 1;
        int randIndex = (int) (Math.random() * range) + min;
        String temp;
        temp = getPassword().substring(randIndex, randIndex + getPhrase().length());
        setPassword(getPassword().replace(temp, phrase));
    }


    public static int getHowLong() {
        return howLong;
    }

    public static int setHowLong() {
        clearConsole();
        System.out.println("Please provide how long the password should be:\n");
        Scanner scanner = new Scanner(System.in);
        String howLongSize;
        do {
            howLongSize = scanner.nextLine();

        } while (!(howLongSize.matches("[0-9]+") && howLongSize.length() > 0));
        howLong = Integer.parseInt(howLongSize);

        if (getPhrase().length() >= getHowLong()) {
            phrase1();
        }
        return howLong;
    }

    public static void setHowLong1() {
        howLong = getPhrase().length() + 1;
    }

    public static Set<String> getLittle() {
        return LITTLE;
    }

    public static Set<String> getBig() {
        return BIG;
    }

    public static Set<String> getNumber() {
        return NUMBER;
    }

    public static Set<String> getSymbol() {
        return SYMBOL;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Tab.password = password;
    }
}
