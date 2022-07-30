package PL.Game.RockPaperScissors;

import static PL.Game.RockPaperScissors.Play.scoreHuman;
import static PL.Game.RockPaperScissors.Play.scorePc;
import static PL.Game.RockPaperScissors.Player.getName;

public class TextPrinter {

    public static void pcRock() {
        System.out.println("PC Player chosen a Rock");
    }

    public static void pcPaper() {
        System.out.println("PC Player chosen a Paper");
    }

    public static void pcScissors() {
        System.out.println("PC Player chosen a Scissors");
    }

    public static void tie() {
        System.out.println("Tie!");
    }

    public static void pcWin() {
        System.out.println("PC Player Win!");
    }

    public static void playerWin() {
        System.out.println(getName() + " Win!");
    }

    public static void points() {
        System.out.println("Score " + getName() + " " + scoreHuman + " - " + scorePc + " PC");
    }

    public static void information() {
        System.out.println("Game Rule:\s");
        System.out.println("Although the game has a lot of complexity to it, the rules to play it are pretty simple.");
        System.out.println("The game is played where players deliver signals that will represent the elements of the game;");
        System.out.println("rock, paper and scissors. The outcome of the game is determined by 3 simple rules:");
        System.out.println("Rock wins against scissors.");
        System.out.println("Scissors win against paper.");
        System.out.println("Paper wins against rock.\n");
        System.out.println("CREDITS:");
        System.out.println("Mariusz Hunter Kuklinski\n");
        System.out.println("[Press ENTER to return menu]");
    }

    public static void infoLevel() {
        System.out.println("Select difficulty level (1-3):");
        System.out.println("1. Easy - The computer needs 5 points to win, the player needs 3 points to win");
        System.out.println("2. Normal - The computer needs 5 points to win, the player needs 5 points to win");
        System.out.println("3. Hard - The computer needs 3 points to win, the player needs 5 points to win");
        System.out.println("");
        System.out.println("4. Return to menu");
    }

    public static void welcome() {
        System.out.println("##############################");
        System.out.println("#                            #");
        System.out.println("#       Welcome in game      #");
        System.out.println("#   Rock, paper and scissor  #");
        System.out.println("#                            #");
        System.out.println("##############################");
    }

    public static void wrongOption() {
        System.out.println("Wrong option is selected \n Try again \n");
    }
}
