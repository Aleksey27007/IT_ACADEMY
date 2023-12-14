package HomeWork11_12_23;

import java.util.Random;

import static HomeWork11_12_23.MaxNumberArray.print;

public class SumDigitsArray {
    public static void main(String[] args) {
        /* Найти сумму цифр массив */
        int[] array = RandomArray(20);
        print(array);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum digits = " + sum);
    }

    public static int[] RandomArray(int numberDigits) {
        Random random = new Random();
        int[] array = new int[numberDigits];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(numberDigits);
        }
        return array;
    }
}
