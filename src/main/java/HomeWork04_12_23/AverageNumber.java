package HomeWork04_12_23;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        /*Задание 3 Найти среднее число из трех, введенных с клавиатуры (НЕ среднее арифметическое)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 3 numbers: ");
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int numberC = scanner.nextInt();

        if (numberA > numberB && numberA > numberC) {
            if (numberB > numberC) {
                System.out.println("Average number B = " + numberB);
            } else {
                System.out.println("Average number C = " + numberC);
            }
        } else if (numberB > numberA && numberB > numberC){
            if (numberA > numberC) {
                System.out.println("Average number A = " + numberA);
            } else {
                System.out.println("Average number C = " + numberC);
            }
        } else if (numberC > numberA && numberC > numberB) {
            if (numberA > numberB) {
                System.out.println("Average number A = " + numberA);
            } else {
                System.out.println("Average number B = " + numberB);
            }
        }
        scanner.close();
    }
}
