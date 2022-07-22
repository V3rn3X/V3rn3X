package PL.Game.RockPaperScissors;

import java.util.Scanner;

import static PL.Game.RockPaperScissors.CommonMethod.*;

import static PL.Game.RockPaperScissors.ReadWrite.readScores;
import static PL.Game.RockPaperScissors.MenuHandler.switchLevel;
import static PL.Game.RockPaperScissors.MenuHandler.switchMenu;
import static PL.Game.RockPaperScissors.TextPrinter.*;

public class GameRoot {
    final static Level EASY = new Level(5, 3, "Easy");
    final static Level NORMAL = new Level(5, 5, "Normal");
    final static Level HARD = new Level(3, 5, "Hard");



    private static String level;
    static int roundNumberPc;
    static int roundNumberHuman;

    public static String getLevel() {
        return level;
    }

    public static void setLevel(String level) {
        GameRoot.level = level;
    }

    public static void startGame() {
        clearConsole();
        welcome();
        level = EASY.getNameLevel();
        roundNumberPc = EASY.getRoundNumberPc();
        roundNumberHuman = EASY.getRoundNumberHuman();
        CommonMethod.wait(5);
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        clearConsole();
        System.out.println("Choose one option below: \n1. New Game\n2. Level: " + level + "\n3. Infinity Mode\n4. HighScore\n5. Information \n6. Exit");

        String choose;
        do {
            choose = scanner.nextLine();
            if (isaBoolean1to6(choose)) {
                System.out.println("");
            } else {
                wrongOption();
            }
        } while (!isaBoolean1to6(choose));
        int number = Integer.parseInt(choose);
        switchMenu(number);
    }

    public static void level() {
        Scanner scanner = new Scanner(System.in);
        clearConsole();
        infoLevel();
        String choose;

        do {
            choose = scanner.nextLine();
            if (isaBoolean1to4(choose)) {
                System.out.println(" ");
            } else {
                wrongOption();
            }
        } while (!isaBoolean1to4(choose));
        int number = Integer.parseInt(choose);
        switchLevel(number);
    }

    public static void results() {
        readScores();
        pressEnter();
        menu();
    }

    public static void info() {
        clearConsole();
        information();
        pressEnter();
        menu();
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
                wrongOption();
            }
        } while (!isaBoolean1to2(choose));

        int number = Integer.parseInt(choose);
        System.out.println(number);

        if (number == 1) {
            clearConsole();
            System.out.println("Thanks for game");
            System.exit(0);
        } else {
            menu();
        }
    }
}



