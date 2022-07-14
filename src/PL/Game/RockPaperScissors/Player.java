package src.PL.Game.RockPaperScissors;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Player {

    private String name;

    public static void scores(String score){

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
            writer.write(score);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
