package PL.Game.Password.Generator;

public class MenuHandler {

    public static void menuSwitch(int choose) {

        switch (choose) {
            case 1:
            case 2:
            case 3:
            case 4:
                ChosenOptionHandler.changeStatus(choose);
                break;
            case 5:
                Tab.phrase();
                Program.start();
                break;
            case 6:
                Tab.setLength();
                Program.start();
                break;
            case 7:
                ChosenOptionHandler.generator();
                break;
            case 8:
                ChosenOptionHandler.copy();
                break;
            case 9:
                ChosenOptionHandler.exit();
                break;
            default:
                System.out.println("Wrong option is selected \n Try again \n\n Enter to continue... ");
                break;
        }
    }
}
