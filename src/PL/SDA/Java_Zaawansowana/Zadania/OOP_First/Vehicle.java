package PL.SDA.Java_Zaawansowana.Zadania.OOP_First;

public abstract class Vehicle {

    private String name;
    private int engine;
    private short year;

    abstract void runEngine();

    public Vehicle(String name, int engine,short year){
        this.name = name;
        this.engine = engine;
        this.year = year;
    }

    public String describe(){
        return ("Jestem " + name + " z silniekiem " + engine + " mój rok produkcji to " + year);
    }
}
