package src.PL.SDA.Java_Zaawansowana.Zadania.OOP_School;

import java.math.BigDecimal;

public class School {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Adam", "Warszawa", "Math", BigDecimal.valueOf(3000));
        Student student = new Student("Jan", "Krakow", "Zaoczne", 2010, BigDecimal.valueOf(1000));
        Person person = new Person("Marek", "Lodz");

        System.out.println(student);
        System.out.println(lecturer);
        System.out.println(person);
    }
}
