package src.PL.Password.Generator;

import src.PL.Password.Generator.Tab;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.*;
import java.util.List;

import static src.PL.Password.Generator.Program.start;


public class Option {

    private static int countTab = 4;

    public static int getCountTab() {
        return countTab;
    }

    public static String little() {
        Tab little = new Tab();
        String l;
        if (!little.isActivateLittle()) {
            l = "1. [ ] little";
        } else {
            l = "1. [*] little";
        }
        return l;
    }

    public static String big() {
        Tab big = new Tab();
        String b;
        if (!big.isActivateBig()) {
            b = "2. [ ] big";
        } else {
            b = "2. [*] big";
        }
        return b;
    }

    public static String number() {
        Tab number = new Tab();
        String n;
        if (!number.isActivateNumber()) {
            n = "3. [ ] number";
        } else {
            n = "3. [*] number";
        }
        return n;
    }

    public static String symbol() {
        Tab symbol = new Tab();
        String s;
        if (!symbol.isActivateSymbol()) {
            s = "4. [ ] symbol";
        } else {
            s = "4. [*] symbol";
        }
        return s;
    }


    public static void changeStatus(int choose) throws IOException, InterruptedException {
        Tab tab = new Tab();

        if (choose == 1) {
            Tab.setActivateLittle(!tab.isActivateLittle());
            if (tab.isActivateLittle()) {
                countTab++;
            } else countTab--;
        } else if (choose == 2) {
            Tab.setActivateBig(!tab.isActivateBig());
            if (tab.isActivateBig()) {
                countTab++;
            } else countTab--;
        } else if (choose == 3) {
            Tab.setActivateNumber(!tab.isActivateNumber());
            if (tab.isActivateNumber()) {
                countTab++;
            } else countTab--;
        } else if (choose == 4) {
            Tab.setActivateSymbol(!tab.isActivateSymbol());
            if (Tab.isActivateSymbol()) {
                countTab++;
            } else countTab--;
        }

        start();
    }


    public static void generator() throws IOException, InterruptedException {
        Tab tab = new Tab();

        if (countTab == 0) {
            Tab.setPassword("None of the options have been selected");
            start();
        } else {

            List<String> password = new ArrayList<>();

            if(tab.isActivateLittle()){
                for (int i = 0; i < tab.getLittle().length; i++) {
                    password.add(tab.getLittle1(i));
                }
            }

            if(tab.isActivateBig()){
                for (int i = 0; i < tab.getBig().length; i++) {
                    password.add(tab.getBig1(i));
                }
            }

            if(tab.isActivateNumber()){
                for (int i = 0; i < tab.getNumber().length; i++) {
                    password.add(tab.getNumber1(i));
                }
            }

            if(tab.isActivateSymbol()){
                for (int i = 0; i < tab.getSymbol().length; i++) {
                    password.add(tab.getSymbol1(i));
                }
            }
            Random rand = new Random();
            int upperbound = password.size();
            int random;
            List<String> gen = new ArrayList<>();

            for (int i = 0; i < Tab.getHowLong(); i++) {
                random = rand.nextInt(upperbound);
                gen.add(password.get(random));
            }

            Tab.setPassword(String.join("",gen));

            start();
        }
    }

    public static void copy() throws IOException, InterruptedException {

        StringSelection stringSelection = new StringSelection(Tab.getPassword());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        start();
    }



    public static void exit() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        clearConsole();
        System.out.println("Are You sure you want to exit?\n1. Yes\n2. No");
        String choose;

        do {
            choose = scanner.nextLine();
            if (choose.equals("1") || choose.equals("2")) {
                System.out.println(" ");
            } else {
                System.out.println("Wrong option is selected \n Try again \n");
            }

        } while (!(choose.equals("1") || choose.equals("2")));

        int number = Integer.parseInt(choose);
        System.out.println(number);

        if (number == 1) {
            clearConsole();
            System.out.println("Thanks for game");
            System.exit(0);
        } else {
            start();
        }
    }


    public static void clearConsole() {
        for (int i = 0; i < 30; i++) {
            System.out.println(" ");
        }
    }


}
