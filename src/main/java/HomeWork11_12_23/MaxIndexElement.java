package HomeWork11_12_23;

import static HomeWork11_12_23.MaxNumberArray.print;
import static HomeWork11_12_23.SumDigitsArray.randomArray;

public class MaxIndexElement {
    public static void main(String[] args) {
        /* Найти максимальный из элементов массива с четными индексами */

        int[] array = randomArray(10);
        print(array);

        int maxNumber = 0;
        int[] indexArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 2; i < array.length; i++) {
            if (i % 2 == 0) {
                if (array[i] > maxNumber) {
                    maxNumber = array[i];
                }
            } else {
                continue;
            }
        }

        System.out.println("Max even number = " + maxNumber);
        print(indexArray);
    }
}
