package PL.Password.Generator;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static PL.Password.Generator.CommonlyMethods.clearConsole;
import static PL.Password.Generator.CommonlyMethods.isaBoolean1to2;
import static PL.Password.Generator.Program.start;
import static PL.Password.Generator.Tab.*;


public class Option {

    private static int countTab = 4;

    public static int getCountTab() {
        return countTab;
    }

    public static String little() {

        return isActivateLittle() ? "1. [*] little" : "1. [ ] little";
    }

    public static String big() {
        return isActivateBig() ? "2. [*] big" : "2. [ ] big";
    }

    public static String number() {
        return isActivateNumber() ? "3. [*] number" : "2. [ ] number";
    }

    public static String symbol() {
        return isActivateSymbol() ? "4. [*] symbol" : "2. [ ] symbol";
    }


    public static void changeStatus(int choose) {

        if (choose == 1) {
            setActivateLittle(!isActivateLittle());
            if (isActivateLittle()) {
                countTab++;
            } else countTab--;
        } else if (choose == 2) {
            setActivateBig(!isActivateBig());
            if (isActivateBig()) {
                countTab++;
            } else countTab--;
        } else if (choose == 3) {
            setActivateNumber(!isActivateNumber());
            if (isActivateNumber()) {
                countTab++;
            } else countTab--;
        } else if (choose == 4) {
            setActivateSymbol(!isActivateSymbol());
            if (isActivateSymbol()) {
                countTab++;
            } else countTab--;
        }

        start();
    }


    public static void generator() {

        if (countTab == 0) {
            Tab.setPassword("None of the options have been selected");
            start();
        } else {

            List<String> password = new ArrayList<>();

            if (isActivateLittle()) {
                password.addAll(getLittle());
            }

            if (isActivateBig()) {
                password.addAll(getBig());
            }

            if (isActivateNumber()) {
                password.addAll(getNumber());
            }

            if (isActivateSymbol()) {
                password.addAll(getSymbol());
            }

            Random rand = new Random();
            int upperbound = password.size();
            int random;
            List<String> gen = new ArrayList<>();

            for (int i = 0; i < Tab.getHowLong(); i++) {
                random = rand.nextInt(upperbound);
                gen.add(password.get(random));
            }
            setPassword(String.join("", gen));

            if (!getPhrase().equals("")) {
                passWithPhrase();
            }

            start();
        }
    }

    public static void copy() {

        StringSelection stringSelection = new StringSelection(Tab.getPassword());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        start();
    }

    public static void exit() {
        Scanner scanner = new Scanner(System.in);
        clearConsole();
        System.out.println("Are You sure you want to exit?\n1. Yes\n2. No");
        String choose;

        do {
            choose = scanner.nextLine();
            if (isaBoolean1to2(choose)) {
                System.out.println(" ");
            } else {
                System.out.println("Wrong option is selected \n Try again \n");
            }

        } while (!isaBoolean1to2(choose));

        int number = Integer.parseInt(choose);
        System.out.println(number);

        if (number == 1) {
            clearConsole();
            System.out.println("Thanks for use app");
            System.exit(0);
        } else {
            start();
        }
    }
}
