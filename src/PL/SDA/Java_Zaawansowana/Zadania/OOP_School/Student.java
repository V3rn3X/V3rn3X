package PL.SDA.Java_Zaawansowana.Zadania.OOP_School;

import java.math.BigDecimal;

public class Student extends Person{

    private String type;
    private int year;
    private BigDecimal price;


    public Student(String name, String address, String type, int year, BigDecimal price) {
        super(name, address);
        this.type = type;
        this.year = year;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String toString() {
        return super.toString() + " -> " + this.type + " -> " + this.year + " -> " + this.price;
    }

}
