package PL.Game.RockPaperScissors;

import static PL.Game.RockPaperScissors.CommonMethod.pressEnter;
import static PL.Game.RockPaperScissors.GameRoot.*;
import static PL.Game.RockPaperScissors.Play.*;

public class MenuHandler {
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
                setLevel(GameRoot.EASY.getNameLevel());
                roundNumberPc = GameRoot.EASY.getRoundNumberPc();
                roundNumberHuman = GameRoot.EASY.getRoundNumberHuman();
                menu();
                break;
            case 2:
                setLevel(GameRoot.NORMAL.getNameLevel());
                roundNumberPc = GameRoot.NORMAL.getRoundNumberPc();
                roundNumberHuman = GameRoot.NORMAL.getRoundNumberHuman();
                menu();
                break;
            case 3:
                setLevel(GameRoot.HARD.getNameLevel());
                roundNumberPc = GameRoot.HARD.getRoundNumberPc();
                roundNumberHuman = GameRoot.HARD.getRoundNumberHuman();
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
