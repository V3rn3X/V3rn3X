package PL.SDA.Java_Zaawansowana.Zadania.OOP_School;

public class Person {

    private String name;
    private String address;

    public Person(){
        this.name = "";
        this.name = "";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return this.name + " -> " + this.address;
    }
}
