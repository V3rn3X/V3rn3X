package src.PL.Game.RockPaperScissors;

import java.io.IOException;
import java.util.Scanner;

public class Methods {

    static Level Easy = new Level(5, 3, "Easy");
    static Level Normal = new Level(5, 5, "Normal");
    static Level Hard = new Level(3, 5, "Hard");
    static String level = Easy.getNameLevel();
    static int roundNumberPc = Easy.getRoundNumberPc();
    static int roundNumberHuman = Easy.getRoundNumberHuman();
    public static void startGame() throws IOException {

        Scanner scanner = new Scanner(System.in);

        clearConsole();
        for (int i = 0; i < 30; i++) {
            System.out.print("#");
        }
        System.out.println(
                """

                        #                            #
                        #       Welcome in game      #
                        #   Rock, paper and scissor  #
                        #                            #
                        #        Press ENTER         #
                        #       to continue...       #
                        #                            #""");
        for (int i = 0; i < 30; i++) {
            System.out.print("#");
        }
        System.in.read();
    }

    public static void menu() throws IOException {
        Scanner scanner = new Scanner(System.in);

        clearConsole();
        System.out.println("Choose one option below: \n1. New Game\n2. Level: " + level + "\n3. Infinity Mode\n4. HighScore\n5. Information \n6. Exit");

        String choose;

        do {
            choose = scanner.nextLine();
            if (choose.equals("1") || choose.equals("2") || choose.equals("3") || choose.equals("4") || choose.equals("5") || choose.equals("6")) {
                System.out.println("");
            } else {
                System.out.println("Wrong option is selected \n Try again \n");
            }
        } while (!(choose.equals("1") || choose.equals("2") || choose.equals("3") || choose.equals("4") || choose.equals("5") || choose.equals("6")));

        int number = Integer.parseInt(choose);

        switch (number) {
            case 1:
                newGame();
                break;
            case 2:
                level();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                info();
                break;
            case 6:
                exit();
                break;
            default:
                System.out.println("Wrong option is selected \n Try again \n\n Enter to continue... ");
                System.in.read();
                menu();
                break;
        }
    }

    public static void newGame() {
        clearConsole();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player name: ");
        String name = scanner.nextLine();


        System.out.println("Score: ");


    }

    public static void level() throws IOException {
        Scanner scanner = new Scanner(System.in);
        clearConsole();
        System.out.println("""
                Select difficulty level (1-3):
                1. Easy - The computer needs 5 points to win, the player needs 3 points to win
                2. Normal - The computer needs 5 points to win, the player needs 5 points to win
                3. Hard - The computer needs 3 points to win, the player needs 5 points to win

                4. Return to menu""");

        String choose;

        do {
            choose = scanner.nextLine();
            if (choose.equals("1") || choose.equals("2") || choose.equals("3") || choose.equals("4")) {
                System.out.println(" ");
            } else {
                System.out.println("Wrong option is selected \n Try again \n");
            }

        } while (!(choose.equals("1") || choose.equals("2") || choose.equals("3") || choose.equals("4")));


        int number = Integer.parseInt(choose);

        switch (number) {
            case 1 -> {
                level = Easy.getNameLevel();
                roundNumberPc = Easy.getRoundNumberPc();
                roundNumberHuman = Easy.getRoundNumberHuman();
                menu();
            }
            case 2 -> {
                level = Normal.getNameLevel();
                roundNumberPc = Normal.getRoundNumberPc();
                roundNumberHuman = Normal.getRoundNumberHuman();
                menu();
            }
            case 3 -> {
                level = Hard.getNameLevel();
                roundNumberPc = Hard.getRoundNumberPc();
                roundNumberHuman = Hard.getRoundNumberHuman();
                menu();
            }
            case 4 -> menu();
        }

    }


    public static void info() throws IOException {
        clearConsole();
        System.out.println(
                """
                        Game Rule:\s
                        Although the game has a lot of complexity to it, the rules to play it are pretty simple.
                        The game is played where players deliver signals that will represent the elements of the game;
                        rock, paper and scissors. The outcome of the game is determined by 3 simple rules:
                        Rock wins against scissors.
                        Scissors win against paper.
                        Paper wins against rock.

                        CREDITS:
                        Mariusz Hunter Kuklinski

                        [Press ENTER to return menu]""");
        System.in.read();
        menu();
    }

    public static void exit() throws IOException {
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

        if(number == 1){
            clearConsole();
            System.out.println("Thanks for game");
            System.exit(0);
        }
        else{
            menu();
        }
    }


    public static void clearConsole() {
        for (int i = 0; i < 30; i++) {
            System.out.println(" ");
        }
    }


}



