package PL.SDA.Java_Zaawansowana.Kolekcje.Task2;

import java.util.Objects;

public class Author {

    private String firstName;
    private String lastName;

    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    static Author of(String firstName, String lastName) {
        return new Author(firstName, lastName);
    }

    @Override
    public String toString() {
        return firstName + ", " + lastName;
    }
}
