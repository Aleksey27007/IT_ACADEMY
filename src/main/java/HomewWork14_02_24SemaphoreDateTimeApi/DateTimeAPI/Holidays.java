package HomewWork14_02_24SemaphoreDateTimeApi.DateTimeAPI;

import java.time.LocalDate;
import java.time.Month;

public class Holidays {
    public static void main(String[] args) {
        int year = LocalDate.now().getYear();

        System.out.println("Holiday schedule " + year + " year: \n");

        printHoliday("Defender of the Fatherland Day", year, Month.FEBRUARY, 23);
        printHoliday("International Women's Day", year, Month.MARCH, 8);
        printHoliday("Constitution Day of the Republic of Belarus", year, Month.MARCH, 15);
        printHoliday("New year", year, Month.DECEMBER,31);
    }

    static void printHoliday(String name, int year, Month month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.format(java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy")) + ": " + name);
    }
}
