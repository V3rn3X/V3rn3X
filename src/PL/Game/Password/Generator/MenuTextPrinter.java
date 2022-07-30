package PL.Game.Password.Generator;

public class MenuTextPrinter {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";

    public static void menuText() {

        System.out.println("*** PASSWORD GENERATOR ***\n");

        System.out.println("Available option:");
        System.out.println(ChosenOptionHandler.little());
        System.out.println(ChosenOptionHandler.big());
        System.out.println(ChosenOptionHandler.number());
        System.out.println(ChosenOptionHandler.symbol());
        System.out.print("5. Phrase that must occur: ");
        if (Tab.getPhrase().equals("")) {
            System.out.println("N/A");
        } else {
            System.out.println(Tab.getPhrase());
        }
        System.out.println("6. Password Length: " + Tab.getLength() + "\n-----------------------------");
        System.out.println("7. Generate Password: ");
        System.out.println(RED
                + Tab.getPassword()
                + ANSI_RESET);
        System.out.println("8. Copy password to ClipBoard");
    }
}
