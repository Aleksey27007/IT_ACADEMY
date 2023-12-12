package HomeWork06_12_23;

import java.util.Scanner;

public class SumAndMultNumbers {
    public static void main(String[] args) {
        /* Задание 5
        * Найдите сумму и произведение цифр числа, введенного с клавиатуры
          1 понимание задачи*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int mult = 1;

        for (int i = 1; i <= number; i++) {
            sum += i;
            mult *= i;
        }
        System.out.println(sum);
        System.out.println(mult);

        /* Второе */
        int newNumber = number;
        int summa = 0;
        int multiplication = 1;

        while (newNumber != 0) {
            int num = newNumber % 10;
            summa += num;
            multiplication *= num;
            newNumber /= 10;
        }
        System.out.println(summa);
        System.out.println(multiplication);
        scanner.close();
    }
}
