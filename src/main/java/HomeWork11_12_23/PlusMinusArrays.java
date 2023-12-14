package HomeWork11_12_23;

import java.util.Random;

import static HomeWork11_12_23.MaxNumberArray.print;

public class PlusMinusArrays {
    public static void main(String[] args) {
        /* Разложить положительные и отрицательные числа по разным массивам */

        Random random = new Random();
        int[] mainArray = new int[20];

        for (int i = 0; i < mainArray.length; i++) {
            mainArray[i] = random.nextInt(20) - 10;
        }
        print(mainArray);
    }
}
