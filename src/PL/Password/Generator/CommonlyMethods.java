package PL.Password.Generator;

public class CommonlyMethods {

    public static void clearConsole() {
        for (int i = 0; i < 30; i++) {
            System.out.println(" ");
        }
    }

    public static boolean isaBoolean1to9(String choose) {
        return choose.equals("1") || choose.equals("2") || choose.equals("3") || choose.equals("4") || choose.equals("5") || choose.equals("6") || choose.equals("7") || choose.equals("8") || choose.equals("9");
    }

    public static boolean isaBoolean1to2(String choose) {
        return choose.equals("1") || choose.equals("2");
    }

}
