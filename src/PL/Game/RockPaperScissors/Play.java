package PL.Game.RockPaperScissors;

import java.util.Objects;
import java.util.Scanner;

import static PL.Game.RockPaperScissors.CommonMethod.*;
import static PL.Game.RockPaperScissors.GameRoot.*;
import static PL.Game.RockPaperScissors.Player.getName;
import static PL.Game.RockPaperScissors.Player.setName;
import static PL.Game.RockPaperScissors.ReadWrite.*;
import static PL.Game.RockPaperScissors.MenuHandler.switchRockPaperScissors;
import static PL.Game.RockPaperScissors.TextPrinter.*;

public class Play {

    static int scorePc = 0;
    static int scoreHuman = 0;
    static int pcThrow;
    static int number;
    static int infinity;

    public static void play() {
        clearConsole();
        scorePc = 0;
        scoreHuman = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter player name: ");
        setName(scanner.nextLine());
        clearConsole();
        System.out.println("Start Game - - - Loading");
        System.out.print("#");
        CommonMethod.wait(1);
        System.out.print("#######");
        CommonMethod.wait(1);
        System.out.print("####");
        CommonMethod.wait(1);
        System.out.print("######### 100%");
        CommonMethod.wait(1);
        play1();
    }

    public static void play1() {
        pcThrow = (int) (Math.random() * (4 - 1)) + 1;
        clearConsole();
        System.out.println("Choose Your weapon: \n1. Rock\n2. Paper\n3. Scissors");

        int number = isaBoolean(3);
        switchRockPaperScissors(number);
    }

    public static void infinityMode() {
        infinity = 1;
        play();
    }

    public static void rock() {
        System.out.println("You have chosen a Rock");
        if (pcThrow == 1) {
            pcRock();
            tie();
            points();
            endGame();
        } else if (pcThrow == 2) {
            pcPaper();
            pcWin();
            scorePc++;
            points();
            endGame();
        } else {
            pcScissors();
            playerWin();
            scoreHuman++;
            points();
            endGame();
        }
    }

    public static void paper() {
        System.out.println("You have chosen a Paper");
        if (pcThrow == 1) {
            pcRock();
            playerWin();
            scoreHuman++;
            points();
            endGame();
        } else if (pcThrow == 2) {
            pcPaper();
            tie();
            points();
            endGame();
        } else {
            pcScissors();
            pcWin();
            scorePc++;
            points();
            endGame();
        }
    }

    public static void scissors() {
        System.out.println("You have chosen a Scissors");
        if (pcThrow == 1) {
            pcRock();
            pcWin();
            scorePc++;
            points();
            endGame();
        } else if (pcThrow == 2) {
            pcPaper();
            playerWin();
            scoreHuman++;
            points();
            endGame();
        } else {
            pcScissors();
            tie();
            points();
            endGame();
        }
    }

    public static void endGame() {
        if (infinity == 1) {
            System.out.println("\nDo you want continue?\n1. Yes\n2. No");
            int number = isaBoolean(2);
            if (number == 1) {
                play1();
            }
            infinity = 0;

            String highScore = scoreHuman + "\t " + scorePc + "\t " + getName() + "\n";
            scores(highScore);
            menu();
        } else {
            if (Objects.equals(getLevel(), EASY.getNameLevel()) && ((EASY.getRoundNumberHuman() == (scoreHuman)) || (EASY.getRoundNumberPc() == scorePc))) {
                win();
            } else if (Objects.equals(getLevel(), NORMAL.getNameLevel()) && ((NORMAL.getRoundNumberHuman() == (scoreHuman)) || (NORMAL.getRoundNumberPc() == scorePc))) {
                win();
            } else if (Objects.equals(getLevel(), HARD.getNameLevel()) && ((HARD.getRoundNumberHuman() == (scoreHuman)) || (HARD.getRoundNumberPc() == scorePc))) {
                win();
            } else {
                pressEnter();
                play1();
            }
        }
    }

    public static void win() {
        if (Objects.equals(getLevel(), EASY.getNameLevel()) && EASY.getRoundNumberHuman() == scoreHuman ||
                Objects.equals(getLevel(), NORMAL.getNameLevel()) && NORMAL.getRoundNumberHuman() == scoreHuman ||
                Objects.equals(getLevel(), HARD.getNameLevel()) && HARD.getRoundNumberHuman() == scoreHuman) {
            clearConsole();
            youWin();
            pressEnter();
            menu();
        } else {
            clearConsole();
            youLose();
            pressEnter();
            menu();
        }
    }
}
