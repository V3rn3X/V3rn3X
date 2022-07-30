package PL.SDA.Java_Zaawansowana.Zadania.Dos;

public class Line {

    private Point point1;
    private Point point2;

    public Line(Point firstPoint, Point secondPoint) {
        this.point1 = firstPoint;
        this.point2 = secondPoint;
    }

    public double getDistance() {
        return Math.sqrt((Math.pow(point2.getX() - point1.getX(), 2)) + (Math.pow(point2.getY() - point1.getY(), 2)));
    }
}
