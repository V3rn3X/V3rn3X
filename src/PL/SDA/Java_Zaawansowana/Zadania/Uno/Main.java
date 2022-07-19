package PL.SDA.Java_Zaawansowana.Zadania.Uno;

public class Main {
    public static void main(String[] args) {

        Shape rectangle1 = new Rectangle(4, 5);
        rectangle1.getArea();
        rectangle1.getPerimeter();

        System.out.println();

        Shape circle1 = new Circle(8);
        circle1.getArea();
        circle1.getPerimeter();

        System.out.println();

        Shape square1 = new Square(5);
        square1.getArea();
        square1.getPerimeter();

    }
}