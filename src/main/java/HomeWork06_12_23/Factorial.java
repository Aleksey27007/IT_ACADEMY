package HomeWork06_12_23;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /* Создайте программу, вычисляющую факториал натурального числа n, которое пользователь
введёт с клавиатуры*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your namber: ");
        int number = scanner.nextInt();

        int factorialNumber = 1;

        for (int i = 1; i <= number; i++) {
            factorialNumber *= i;
        }
        System.out.println("Factorial " + number + " = " + factorialNumber);
        scanner.close();
    }

}
