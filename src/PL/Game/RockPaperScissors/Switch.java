package PL.Game.RockPaperScissors;

import static PL.Game.RockPaperScissors.CommonlyMethod.pressEnter;
import static PL.Game.RockPaperScissors.Methods.*;
import static PL.Game.RockPaperScissors.Play.*;

public class Switch {

    public static void
    switchMenu(int choose) {
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
                level = Methods.Easy.getNameLevel();
                roundNumberPc = Methods.Easy.getRoundNumberPc();
                roundNumberHuman = Methods.Easy.getRoundNumberHuman();
                menu();
                break;
            case 2:
                level = Methods.Normal.getNameLevel();
                roundNumberPc = Methods.Normal.getRoundNumberPc();
                roundNumberHuman = Methods.Normal.getRoundNumberHuman();
                menu();
                break;
            case 3:
                level = Methods.Hard.getNameLevel();
                roundNumberPc = Methods.Hard.getRoundNumberPc();
                roundNumberHuman = Methods.Hard.getRoundNumberHuman();
                menu();
                break;
            case 4:
                menu();
                break;
        }
    }

    public static void switchRockPaperScissors(int choose) {
        switch (choose) {
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
}
