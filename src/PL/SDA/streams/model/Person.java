package PL.SDA.streams.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Person {
    private Long id;
    private String name;
    private String lastName;
    private String sex;
    private Date birthDate;

    public Person() {
    }

    public Person(CsvLine line) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        id = Long.parseLong(line.getElementAt(0));
        name = line.getElementAt(1);
        lastName = line.getElementAt(2);
        sex = line.getElementAt(3);
        birthDate = dateFormat.parse(line.getElementAt(4));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    public Long getAge() {
        LocalDateTime birthDateTime = convertToLocalDateViaInstant(birthDate).atStartOfDay();
        LocalDateTime now = LocalDate.now().atStartOfDay();
        return ChronoUnit.YEARS.between(birthDateTime, now);
    }

    private LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

}