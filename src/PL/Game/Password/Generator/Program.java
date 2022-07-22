package PL.Game.Password.Generator;

import java.util.Scanner;

import static PL.Game.Password.Generator.CommonMethods.isaBoolean1to9;
import static PL.Game.Password.Generator.MenuHandler.menuSwitch;

public class Program {

    public static void start() {

        Scanner scanner = new Scanner(System.in);
        String choose;

        MenuTextPrinter.menuText();

        do {
            choose = scanner.nextLine();
            if (isaBoolean1to9(choose)) {
                System.out.println("");
            } else {
                System.out.println("Wrong option is selected \n Try again \n");
            }
        } while (!isaBoolean1to9(choose));

        int number = Integer.parseInt(choose);

        menuSwitch(number);
    }
}
