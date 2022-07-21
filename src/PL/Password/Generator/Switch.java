package PL.Password.Generator;

import static PL.Password.Generator.Option.*;
import static PL.Password.Generator.Option.exit;
import static PL.Password.Generator.Program.start;
import static PL.Password.Generator.Tab.phrase;
import static PL.Password.Generator.Tab.setHowLong;

public class Switch {

    public static void menuSwitch(int choose) {

        switch (choose) {
            case 1:
            case 2:
            case 3:
            case 4:
                changeStatus(choose);
                break;
            case 5:
                phrase();
                start();
                break;
            case 6:
                setHowLong();
                start();
                break;
            case 7:
                generator();
                break;
            case 8:
                copy();
                break;
            case 9:
                exit();
                break;
            default:
                System.out.println("Wrong option is selected \n Try again \n\n Enter to continue... ");
                break;
        }
    }
}
