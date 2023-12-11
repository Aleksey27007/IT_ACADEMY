package HomeWork04_12_23;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        /* Задание 7
        * Написать программу, которая запрашивает у пользователя два числа и операцию (+, -, *, /),
        которую нужно выполнить над ними. Вывести результат операции. Использовать оператор
        switch */

        Scanner scanner = new Scanner(System.in);
        Scanner scannerForStrLine = new Scanner(System.in); // по другому (т.е через первый сканнер)
        // неизвестно по какой причине не пашет, пробовал на инт переменную заменить, работал

        System.out.println("Enter number for A: ");
        int numberA = scanner.nextInt();

        System.out.println("Enter number for B: ");
        int numberB = scanner.nextInt();

        System.out.println("Enter operation \"+\", \"-\", \"*\", \"/\" : ");
        String operation = scannerForStrLine.nextLine(); // вот эта часть    ^

        switch (operation) {
            case "+" -> System.out.printf("%d + %d = %d", numberA, numberB, getSum(numberA, numberB));
            case "-" -> System.out.printf("%d - %d = %d", numberA, numberB, getDif(numberA, numberB));
            case "*" -> System.out.printf("%d * %d = %d", numberA, numberB, getMult(numberA, numberB));
            case "/" -> System.out.printf("%d / %d = %d", numberA, numberB, getDiv(numberA, numberB));
            default -> System.out.println("There is no such command");
        }
        scanner.close();
        scannerForStrLine.close();
    }
    static int getSum(int numberA, int numberB) {
        int sumNumber = numberA + numberB;
        return sumNumber;
    }

    static int getDif(int numberA, int numberB) {
        int sumNumber = numberA - numberB;
        return sumNumber;
    }

    static int getMult(int numberA, int numberB) {
        int sumNumber = numberA * numberB;
        return sumNumber;
    }

    static int getDiv(int numberA, int numberB) {
        int sumNumber = numberA / numberB;
        return sumNumber;
    }
}
