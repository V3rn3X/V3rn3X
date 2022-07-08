package src.PL.SDA.Java_Zaawansowana.Zadania.OOP_First;

public class Tesla extends Car {

    public Tesla(String name, int engine, short year) {
        super(name, engine, year);
    }

    public void runEngine() {
        System.out.println("I'm out of juice");
    }
}