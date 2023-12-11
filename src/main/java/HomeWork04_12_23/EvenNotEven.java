package HomeWork04_12_23;

import java.util.Scanner;

public class EvenNotEven {
    public static void main(String[] args) {
        /*Задание 4
        * Определить является ли целое число чётным либо нечётным */
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number % 2 == 0) System.out.println("Your number is even.");
        else System.out.println("Not even.");
        scanner.close();
    }
}
