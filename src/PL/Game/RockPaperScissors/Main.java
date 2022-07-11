package src.PL.Game.RockPaperScissors;

import java.io.IOException;
import java.util.Scanner;

import static src.PL.Game.RockPaperScissors.Play.play;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        play();

        System.out.println("Konczymy");
        int i = scanner.nextInt();
    }
}
