package PL.SDA.Java_Zaawansowana.Zadania.Dos;

public class Point {

    private float x;
    private float y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
