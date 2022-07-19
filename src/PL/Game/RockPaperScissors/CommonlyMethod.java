package PL.Game.RockPaperScissors;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CommonlyMethod {

    public static void pressEnter(){
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();
    }

    public static void waiting(int time){
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void clearConsole() {
        for (int i = 0; i < 30; i++) {
            System.out.println(" ");
        }
    }

    public static boolean isaBoolean1to6(String choose) {
        return choose.equals("1") || choose.equals("2") || choose.equals("3") || choose.equals("4") || choose.equals("5") || choose.equals("6");
    }

    public static boolean isaBoolean1to4(String choose) {
        return choose.equals("1") || choose.equals("2") || choose.equals("3") || choose.equals("4");
    }

    public static boolean isaBoolean1to3(String userThrow) {
        return userThrow.equals("1") || userThrow.equals("2") || userThrow.equals("3");
    }

    public static boolean isaBoolean1to2(String choose) {
        return choose.equals("1") || choose.equals("2");
    }


}