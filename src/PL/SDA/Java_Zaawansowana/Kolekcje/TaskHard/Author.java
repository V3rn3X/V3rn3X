package src.PL.SDA.Java_Zaawansowana.Kolekcje.TaskHard;

public class Author {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final Gender gender;

    public Author(Long id, String firstName, String lastName, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}

enum Gender {
    F, M
}
