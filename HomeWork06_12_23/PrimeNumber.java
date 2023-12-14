package HomeWork06_12_23;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /* Для введенного целого числа определить является ли это число простым */

        Scanner scanner = new Scanner(System.in);
        int itsPrimeNumber = scanner.nextInt();
        System.out.println("Enter your number.");
        int dividerCounter = 0; // так как у просто числа может быть только 2 делителя

        for (int i = 1; i <= itsPrimeNumber; i++) {
            if (itsPrimeNumber % i == 0 ) {
                dividerCounter++;
            } else {
                continue;
            }
        }

        if (dividerCounter == 2) {
            System.out.println(itsPrimeNumber + " Its PRIME NUMBER");
        } else {
            System.out.println(itsPrimeNumber + " Its COMPOSITE NUMBER");
        }
        scanner.close();
    }
}
