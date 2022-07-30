package PL.SDA.Java_Zaawansowana.Zadania.Dos;

public class Main {
    public static void main(String[] args) {

        Line line = new Line(new Point(0.0f, 0.0f), new Point(3.0f, 4.0f));
        double distance = line.getDistance();
        System.out.println("Line length is: " + distance);
    }
}
