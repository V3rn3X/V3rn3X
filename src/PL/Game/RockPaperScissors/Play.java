package src.PL.Game.RockPaperScissors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static src.PL.Game.RockPaperScissors.Methods.*;
import static src.PL.Game.RockPaperScissors.Player.scores;

public class Play {

    static int scorePc = 0;
    static int scoreHuman = 0;
    static String name;
    static int pcThrow;
    static int number;

    static int infinity;

    public static void play() throws IOException, InterruptedException {

        clearConsole();
        scorePc = 0;
        scoreHuman = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter player name: ");
        name = scanner.nextLine();

        clearConsole();
        System.out.println("Start Game - - - Loading");
        System.out.print("#");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("#######");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("####");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("######### 100%");
        TimeUnit.SECONDS.sleep(1);

        play1();
    }

    public static void play1() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);


        String userThrow;

        pcThrow = (int) (Math.random() * (4 - 1)) + 1;
        clearConsole();
        System.out.println("Choose Your weapon: \n1. Rock\n2. Paper\n3. Scissors");

        do {
            userThrow = scanner.nextLine();
            if (userThrow.equals("1") || userThrow.equals("2") || userThrow.equals("3")) {
                System.out.println(" ");
            } else {
                System.out.println("Wrong option is selected \n Try again \n");
            }

        } while (!(userThrow.equals("1") || userThrow.equals("2") || userThrow.equals("3")));

        number = Integer.parseInt(userThrow);

        switch (number) {
            case 1 -> {
                rock();
            }
            case 2 -> {
                paper();
            }
            case 3 -> {
                scissors();
            }
        }
    }

    public static void infinityMode() throws IOException, InterruptedException {
        infinity = 1;
        play();
    }


    public static void rock() throws IOException, InterruptedException {
        System.out.println("You have chosen a Rock");
        if (pcThrow == 1) {
            System.out.println("PC Player chosen a Rock");
            System.out.println("Tie!");
            System.out.println("Score " + name + " " + scoreHuman + " - " + scorePc + " PC");
            endGame();
        } else if (pcThrow == 2) {
            System.out.println("PC Player chosen a Paper");
            System.out.println("PC Player Win!");
            scorePc++;
            System.out.println("Score " + name + " " + scoreHuman + " - " + scorePc + " PC");
            endGame();
        } else {
            System.out.println("PC Player chosen a Scissors");
            System.out.println(name + " Win!");
            scoreHuman++;
            System.out.println("Score " + name + " " + scoreHuman + " - " + scorePc + " PC");
            endGame();
        }
    }

    public static void paper() throws IOException, InterruptedException {
        System.out.println("You have chosen a Paper");
        if (pcThrow == 1) {
            System.out.println("PC Player chosen a Rock");
            System.out.println(name + " Win!");
            scoreHuman++;
            System.out.println("Score " + name + " " + scoreHuman + " - " + scorePc + " PC");
            endGame();
        } else if (pcThrow == 2) {
            System.out.println("PC Player chosen a Paper");
            System.out.println("Tie!");
            System.out.println("Score " + name + " " + scoreHuman + " - " + scorePc + " PC");
            endGame();
        } else {
            System.out.println("PC Player chosen a Scissors");
            System.out.println("PC Player Win!");
            scorePc++;
            System.out.println("Score " + name + " " + scoreHuman + " - " + scorePc + " PC");
            endGame();
        }
    }

    public static void scissors() throws IOException, InterruptedException {
        System.out.println("You have chosen a Scissors");
        if (pcThrow == 1) {
            System.out.println("PC Player chosen a Rock");
            System.out.println("PC Player Win!");
            scorePc++;
            System.out.println("Score " + name + " " + scoreHuman + " - " + scorePc + " PC");
            endGame();
        } else if (pcThrow == 2) {
            System.out.println("PC Player chosen a Paper");
            System.out.println(name + " Win!");
            scoreHuman++;
            System.out.println("Score " + name + " " + scoreHuman + " - " + scorePc + " PC");
            endGame();
        } else {
            System.out.println("PC Player chosen a Scissors");
            System.out.println("Tie!");
            System.out.println("Score " + name + " " + scoreHuman + " - " + scorePc + " PC");
            endGame();
        }
    }


    public static void endGame() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String userThrow;
        if (infinity == 1) {
            System.out.println("\nDo you want continue?\n1. Yes\n2. No");
            do {
                userThrow = scanner.nextLine();
                if (userThrow.equals("1") || userThrow.equals("2")) {
                    System.out.println(" ");
                } else {
                    System.out.println("Wrong option is selected \n Try again \n");
                }

            } while (!(userThrow.equals("1") || userThrow.equals("2")));

            number = Integer.parseInt(userThrow);
            if (number == 1){
                play1();
            }
            infinity = 0;

            String highScore = name + "\t " + scoreHuman + "\t " + scorePc + "\n";
          scores(highScore);
          menu();
        }

        else {
            if ((Easy.getRoundNumberHuman() == (scoreHuman)) || (Easy.getRoundNumberPc() == scorePc) ||
                    (Normal.getRoundNumberHuman() == (scoreHuman)) || (Normal.getRoundNumberPc() == scorePc) ||
                    (Hard.getRoundNumberHuman() == (scoreHuman)) || (Hard.getRoundNumberPc() == scorePc)) {
                win();
            } else {
                System.in.read();
                play1();
            }
        }
    }

    public static void win() throws IOException, InterruptedException {
        if ((Easy.getRoundNumberHuman() == (scoreHuman))) {
            clearConsole();
            try {
                BufferedReader reader = new BufferedReader(new FileReader("youwin.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.in.read();
            menu();
        } else {
            clearConsole();
            try {
                BufferedReader reader = new BufferedReader(new FileReader("youlose.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.in.read();
            menu();
        }
    }
}
