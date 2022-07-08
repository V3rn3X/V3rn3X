package src.PL.SDA.Java_Zaawansowana.Zadania.OOP_Calc;

public class BasicCalculator {

    public void calculate(int x, int y) {
        System.out.println("X + Y = " + (x + y));
        System.out.println("X - Y = " + (x - y));
        System.out.println("X * Y = " + (x * y));
        if (y != 0) {
            System.out.println("X / Y = " + (x / (float)y));
        } else {
            System.out.println("Cannot divide by 0");
        }
    }
}