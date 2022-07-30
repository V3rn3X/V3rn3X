package PL.SDA.Java_Zaawansowana.Zadania.OOP_First;


public class Car extends Vehicle {

    public Car(String name, int engine, short year) {
        super(name, engine, year);
    }

    void runEngine() {
        System.out.println("I am usually broken!");
    }
}
