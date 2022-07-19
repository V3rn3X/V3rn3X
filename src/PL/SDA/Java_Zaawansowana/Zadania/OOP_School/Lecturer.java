package PL.SDA.Java_Zaawansowana.Zadania.OOP_School;

import java.math.BigDecimal;

public class Lecturer extends Person{

    private String spec;
    private BigDecimal wage;

    public Lecturer(String name, String address, String spec, BigDecimal wage) {
        super(name, address);
        this.spec = spec;
        this.wage = wage;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }

    public String toString() {
        return super.toString() + " -> " + this.spec + " -> " + this.wage;
    }
}
