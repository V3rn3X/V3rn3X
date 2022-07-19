package PL.Game.RockPaperScissors;

import static PL.Game.RockPaperScissors.CommonlyMethod.pressEnter;
import static PL.Game.RockPaperScissors.Methods.*;
import static PL.Game.RockPaperScissors.Play.*;

public class Switch {
    public static void switchMenu(int choose) {
        switch (choose) {
            case 1:
                play();
                break;
            case 2:
                level();
                break;
            case 3:
                infinityMode();
                break;
            case 4:
                results();
                break;
            case 5:
                info();
                break;
            case 6:
                exit();
                break;
            default:
                System.out.println("Wrong option is selected \n Try again \n\n Enter to continue... ");
                pressEnter();
                menu();
                break;
        }
    }
    public static void switchLevel(int choose) {
        switch (choose) {
            case 1:
                level = Methods.EASY.getNameLevel();
                roundNumberPc = Methods.EASY.getRoundNumberPc();
                roundNumberHuman = Methods.EASY.getRoundNumberHuman();
                menu();
                break;
            case 2:
                level = Methods.NORMAL.getNameLevel();
                roundNumberPc = Methods.NORMAL.getRoundNumberPc();
                roundNumberHuman = Methods.NORMAL.getRoundNumberHuman();
                menu();
                break;
            case 3:
                level = Methods.HARD.getNameLevel();
                roundNumberPc = Methods.HARD.getRoundNumberPc();
                roundNumberHuman = Methods.HARD.getRoundNumberHuman();
                menu();
                break;
            case 4:
                menu();
                break;
        }
    }
    public static void switchRockPaperScissors(int choose) {
        switch (choose) {
            case 1:
                rock();
                break;
            case 2:
                paper();
                break;
            case 3:
                scissors();
                break;
        }
    }
}
