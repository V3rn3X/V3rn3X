package PL.Password.Generator;

import static PL.Password.Generator.Option.*;
import static PL.Password.Generator.Option.symbol;
import static PL.Password.Generator.Tab.getPassword;
import static PL.Password.Generator.Tab.getPhrase;

public class MenuText {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";

    public static void menuText() {

        System.out.println("*** PASSWORD GENERATOR ***\n");

        System.out.println("Available option:");
        System.out.println(little());
        System.out.println(big());
        System.out.println(number());
        System.out.println(symbol());
        System.out.print("5. Phrase that must occur: ");
        if (getPhrase().equals("")) {
            System.out.println("N/A");
        } else {
            System.out.println(getPhrase());
        }
        System.out.println("6. Password Length: " + Tab.getHowLong() + "\n-----------------------------");
        System.out.println("7. Generate Password: ");
        System.out.println(RED
                + getPassword()
                + ANSI_RESET);
        System.out.println("8. Copy password to ClipBoard");
    }
}
