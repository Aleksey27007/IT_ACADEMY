package HomeWork24_01_24Threads.minMaxThreads;

import java.util.Scanner;

public class ForArrays {
    public static int[] createArray() {
        System.out.println("Enter length to your array: ");
        int arrayLength = isDigit();
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter a number: ");
            array[i] = isDigit();
        }
        return array;
    }

    public static int isDigit() {
        Scanner sc = new Scanner(System.in);
        int number;

        if (sc.hasNextInt()) {
            number = sc.nextInt();
        } else {
            throw new NumberFormatException("Its not a number.");
        }
        return number;
    }
}
