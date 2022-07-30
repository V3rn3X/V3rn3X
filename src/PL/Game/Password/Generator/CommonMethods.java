package PL.Game.Password.Generator;

public class CommonMethods {

    public static void clearConsole() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static boolean isaBoolean1to9(String choose) {
        return choose.equals("1") || choose.equals("2") || choose.equals("3") || choose.equals("4") || choose.equals("5") || choose.equals("6") || choose.equals("7") || choose.equals("8") || choose.equals("9");
    }

    public static boolean isaBoolean1to2(String choose) {
        return choose.equals("1") || choose.equals("2");
    }

}
