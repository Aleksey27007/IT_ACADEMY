package HomeWork11_12_23;

import java.util.Random;

import static HomeWork11_12_23.MaxNumberArray.print;

public class PlusMinusArrays {
    public static void main(String[] args) {
        /* Разложить положительные и отрицательные числа по разным массивам */

        Random random = new Random();
        int[] mainArray = new int[20];
        int countPositive = 0;
        int countNegative = 0;

        for (int i = 0; i < mainArray.length; i++) {
            mainArray[i] = random.nextInt(20) - 10;
        }

        print(mainArray);

        for (int i = 0; i < mainArray.length ; i++) {
            if (mainArray[i] > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }

        int[] arrayPositive = new int[countPositive];
        int[] arrayNegative = new int[countNegative];
        int tempPositeve = 0;
        int tempNegetive = 0;

        for (int i = 0; i < mainArray.length; i++) {
            if (mainArray[i] > 0) {
                arrayPositive[i - tempPositeve] = mainArray[i];
                tempNegetive++;
            } else {
                arrayNegative[i - tempNegetive] = mainArray[i];
                tempPositeve++;
            }
        }

        System.out.println("\nPositive array: ");
        print(arrayPositive);

        System.out.println("\nNegative array: ");
        print(arrayNegative);
    }
}
