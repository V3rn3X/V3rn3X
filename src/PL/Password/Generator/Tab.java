package PL.Password.Generator;

import java.util.Scanner;

import static PL.Password.Generator.Option.clearConsole;

public class Tab {


    private static boolean activateLittle = true;
    private static boolean activateBig = true;
    private static boolean activateNumber = true;
    private static boolean activateSymbol = true;
    private static String phrase = "";
    private static int howLong = 6;

    private static String password = "";


    private String [] little = {"a", "b", "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    private String [] big = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private String [] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private String [] symbol = {"!","@","#","$","%","^","&","*","(",")","-","+","/","?",",",".","<",">"};


    public boolean isActivateLittle() {
        return activateLittle;
    }

    public static void setActivateLittle(boolean activateLittle1) {
        activateLittle = activateLittle1;
    }

    public boolean isActivateBig() {
        return activateBig;
    }

    public static void setActivateBig(boolean activateBig1) {
        activateBig = activateBig1;
    }

    public boolean isActivateNumber() {
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

    public static String phrase(){
        clearConsole();
        System.out.println("Please provide phrase that must occur:\n");
        Scanner scanner = new Scanner(System.in);
        phrase = scanner.nextLine();
        return phrase;
    }

    public static int getHowLong() {
        return howLong;
    }

    public static int setHowLong(){
        clearConsole();
        System.out.println("Please provide how long the password should be:\n");
        Scanner scanner = new Scanner(System.in);
        String howLongSize;
        do {
            howLongSize = scanner.nextLine();

        } while (!(howLongSize.matches("[0-9]+") && howLongSize.length() > 0));
        howLong = Integer.parseInt(howLongSize);
        return howLong;
    }


    public String[] getLittle() {
        return little;
    }

    public String getLittle1(int i){
        return little[i];
    }

    public String[] getBig() {
        return big;
    }

    public String getBig1(int i){
        return big[i];
    }

    public String[] getNumber() {
        return number;
    }

    public String getNumber1(int i){
        return number[i];
    }

    public String[] getSymbol() {
        return symbol;
    }

    public String getSymbol1(int i){
        return symbol[i];
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Tab.password = password;
    }
}
