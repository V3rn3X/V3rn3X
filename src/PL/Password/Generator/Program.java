package src.PL.Password.Generator;

import java.io.IOException;
import java.util.Scanner;

import static src.PL.Password.Generator.Option.*;
import static src.PL.Password.Generator.Tab.*;

public class Program {


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";

    public static void start() throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*** PASSWORD GENERATOR ***\n");

        System.out.println("Available option:");
        System.out.println(little());
        System.out.println(big());
        System.out.println(number());
        System.out.println(symbol());
        System.out.println("5. Phrase that must occur: " + Tab.getPhrase());
        System.out.println("6. Password Length: " + Tab.getHowLong() + "\n-----------------------------");
        System.out.println("7. Generate Password: ");
        System.out.println(RED
                + getPassword()
                + ANSI_RESET);
        System.out.println("8. Copy password to ClipBoard");

        String choose;

        do {
            choose = scanner.nextLine();
            if (choose.equals("1") || choose.equals("2") || choose.equals("3") ||
                    choose.equals("4") || choose.equals("5") || choose.equals("6")
                    || choose.equals("7") || choose.equals("8") || choose.equals("9")) {
                System.out.println("");
            } else {
                System.out.println("Wrong option is selected \n Try again \n");
            }
        } while (!(choose.equals("1") || choose.equals("2") || choose.equals("3") ||
                choose.equals("4") || choose.equals("5") || choose.equals("6")
                || choose.equals("7") || choose.equals("8") || choose.equals("9")));

        int number = Integer.parseInt(choose);

        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
                changeStatus(number);
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
