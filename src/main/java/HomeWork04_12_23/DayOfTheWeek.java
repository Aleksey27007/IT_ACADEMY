package HomeWork04_12_23;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        /*Задание 6
        * По порядковому номеру дня недели необходимо вывести его название на экран(используем
            switch в Java 17+)*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day number: ");
        int yourDay = scanner.nextInt();

        switch (yourDay) {
            case 1 -> System.out.println("It is Monday.");
            case 2 -> System.out.println("It's Tuesday");
            case 3 -> System.out.println("This is Wednesday");
            case 4 -> System.out.println("It's Thursday");
            case 5 -> System.out.println("It's Friday");
            case 6 -> System.out.println("It's Saturday");
            case 7 -> System.out.println("This Sunday");
            default -> System.out.println("We don't have such a day");
        }
        scanner.close();
    }
}
