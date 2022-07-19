package PL.SDA.Java_Zaawansowana.Zadania.OOP_First;

public class RaceTrack {
    public static void main(String[] args) {

        Tesla teslaS = new Tesla("Tesla S", 2000, (short)2018);
        Tesla teslaY = new Tesla("Tesla Y", 2500, (short)2013);
        Car fiat = new Car("Punto", 1990,(short)1999);

        System.out.println(teslaS.describe());
        System.out.println(teslaY.describe());
        teslaS.runEngine();
        fiat.runEngine();


    }
}
