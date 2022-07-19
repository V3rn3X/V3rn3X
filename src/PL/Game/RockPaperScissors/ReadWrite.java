package PL.Game.RockPaperScissors;

import java.io.*;

public class ReadWrite {

    public static void scores(String score) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
            writer.write(score);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readScores() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void youWin() {


        try {
            BufferedReader reader = new BufferedReader(new FileReader("youwin.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void youLose() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("youlose.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
