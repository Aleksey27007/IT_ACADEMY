package HomewWork14_02_24SemaphoreDateTimeApi.DateTimeAPI;


import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RealisationIsDateOdd {
    public static void main(String[] args) {
        String date1 = "JANUARY 2 2020";
        String date2 = "JANUARY 1 2000";
        System.out.println(isDateOdd(date1));
        System.out.println(isDateOdd(date2));
    }
    public static boolean isDateOdd(String date) {
        List<String> chars = Arrays.asList(date.split(" "));

        int year = Integer.parseInt(chars.get(2));

        LocalDate date1 = LocalDate.of(year, Month.valueOf(chars.get(0)), Integer.parseInt(chars.get(1)));

        LocalDate yearBegin = LocalDate.of(year, 1, 1);

        long days = date1.toEpochDay() - yearBegin.toEpochDay();

        return days % 2 == 0;
    }
}
