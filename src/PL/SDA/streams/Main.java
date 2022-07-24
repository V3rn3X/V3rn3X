package PL.SDA.streams;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1-4:");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                new CitizensApplication().process1();
                break;
            case 2:
                new CitizensApplication().process2();
                break;
            case 3:
                new CitizensApplication().process3();
                break;
            case 4:
                new CitizensApplication().process4();
                break;
            default:
                System.out.println("Wrong number");
        }
    }
}
