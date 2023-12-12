package HomeWork06_12_23;

import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        /* Задание 6
        * Найдите самую большую цифру числа, введенного с клавиатуры, а также ее индекс */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yor number: ");
        int number = scanner.nextInt();

        int newDigit = number;
        int maxDigit = newDigit % 10;
        int maxDigitIndex = 0;

        while(newDigit != 0) {
            int currentDigit = newDigit % 10;

            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
                maxDigitIndex++;
            }
            newDigit /= 10;
        }
        System.out.println("Max digit: " + maxDigit);
        System.out.println("Index max digit: " + maxDigitIndex); // в этом случае получилось считать индекс справа налево 0 - будет всегда справа
        scanner.close();
    }
}
