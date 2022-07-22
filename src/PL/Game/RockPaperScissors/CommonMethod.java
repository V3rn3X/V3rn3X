package PL.Game.RockPaperScissors;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static PL.Game.RockPaperScissors.TextPrinter.wrongOption;

public class CommonMethod {

    public static void pressEnter() {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();
    }

    public static void wait(int time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void clearConsole() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }


    public static boolean exitLoop(int choose, int max) {
        return choose > max || choose < 1;
    }

    public static int isaBoolean(int max) {
        Scanner scanner = new Scanner(System.in);
        int choose = 10;

        while (exitLoop(choose, max)) {
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                wrongOption();
                choose = isaBoolean(max);
            }
            if (exitLoop(choose, max)) {
                wrongOption();
            }
        }
        return choose;
    }
}
