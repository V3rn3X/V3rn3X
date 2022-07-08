package src.PL.SDA.Java_Zaawansowana.Zadania.Enum_Weekday;

public enum Weekday {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }

    boolean isWeekDay() {
        return !isHoliday();
    }
}