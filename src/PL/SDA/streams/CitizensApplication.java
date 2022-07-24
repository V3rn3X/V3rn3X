package PL.SDA.streams;

import PL.SDA.streams.model.Person;

import java.io.File;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class CitizensApplication {

    private PersonReader personReader;

    public CitizensApplication() {
        this.personReader = new PersonReader();
    }

    public void process1() throws ParseException {
        File personFile = new File(getClass().getClassLoader().getResource("person.csv").getFile());
        List<Person> people = personReader.readFromFile(personFile);

        Map<String, Long> lastNameSummary = createLastNameSummary(people);

        for (Map.Entry<String, Long> lastName : lastNameSummary.entrySet()) {
            System.out.println("There are " + lastName.getValue() + " persons with last name " + lastName.getKey());
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void process2() throws ParseException {
        File personFile = new File(getClass().getClassLoader().getResource("person.csv").getFile());
        List<Person> people = personReader.readFromFile(personFile);

        Map<String, List<Person>> NameGroup = createNameGroup(people);
        for (Map.Entry<String, List<Person>> name : NameGroup.entrySet()) {
            System.out.println("Surname with name " + name.getKey() + " is ");
            for (Person model : name.getValue()) {
                System.out.print(model.getLastName() + ", ");
            }
            System.out.println("\n");
        }
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void process3() throws ParseException {
        File personFile = new File(getClass().getClassLoader().getResource("person.csv").getFile());
        List<Person> people = personReader.readFromFile(personFile);

        long birthSummary = createPensionerSummary(people);
        System.out.println("Count Pensioner is: " + birthSummary);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void process4() throws ParseException {
        File personFile = new File(getClass().getClassLoader().getResource("person.csv").getFile());
        List<Person> people = personReader.readFromFile(personFile);

        Map<String, String> lastNameSummary = createPeopleBetween35and55(people);
        int i = 1;
        for (Map.Entry<String, String> lastName : lastNameSummary.entrySet()) {
            System.out.println(i + ". " + lastName.getKey() + " " + lastName.getValue());
            i++;
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    private Map<String, Long> createLastNameSummary(List<Person> people) {
        Map<String, Long> nameCount = new HashMap<>();
        for (Person person : people) {
            String lastName = person.getLastName();
            Long peopleWithTheSameLastNameCount = nameCount.getOrDefault(lastName, 0L);
            peopleWithTheSameLastNameCount++;
            nameCount.put(lastName, peopleWithTheSameLastNameCount);
        }
        return nameCount;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    private Map<String, List<Person>> createNameGroup(List<Person> people) {

        Map<String, List<Person>> grouped =
                people.stream().collect(Collectors.groupingBy(Person::getName));
        return grouped;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    private Long createPensionerSummary(List<Person> people) {
        long birthCount = 0;
        for (Person person : people) {
            String sex = person.getSex();
            LocalDate today = LocalDate.now();
            LocalDate birthDate = convertToLocalDateViaInstant(person.getBirthDate());
            Duration difference = Duration.between(birthDate.atStartOfDay(), today.atStartOfDay());
            if (sex.equals("M")) {
                if (difference.toDays() > 23740) {
                    birthCount++;
                }
            } else if (sex.equals("F")) {
                if (difference.toDays() > 21914) {
                    birthCount++;
                }
            }
        }
        return birthCount;
    }

    public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    private Map<String, String> createPeopleBetween35and55(List<Person> people) {
        Map<String, String> nameCount = new HashMap<>();
        for (Person person : people) {
            String name = person.getName();
            String lastName = person.getLastName();
            LocalDate today = LocalDate.now();
            LocalDate birthDate = convertToLocalDateViaInstant(person.getBirthDate());
            Duration difference = Duration.between(birthDate.atStartOfDay(), today.atStartOfDay());
            if (difference.toDays() > 12783 && difference.toDays() < 20088) {
                nameCount.put(name, lastName);
            }
        }
        return nameCount;
    }
}
