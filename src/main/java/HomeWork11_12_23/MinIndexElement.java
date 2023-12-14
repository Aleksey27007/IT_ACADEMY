package HomeWork11_12_23;

import static HomeWork11_12_23.MaxNumberArray.print;
import static HomeWork11_12_23.SumDigitsArray.randomArray;

public class MinIndexElement {
    public static void main(String[] args) {
        /* Найти минимальный из элементов массива с нечетными индексами */

        int[] array = randomArray(10);
        print(array);

        int minNumber = array[0];
        int[] indexArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
            } else {
                if (array[i] < minNumber) {
                    minNumber = array[i];
                    index = i;
                }
            }
        }

        System.out.println("Min even number = " + minNumber + " INDEX : " + index);
        print(indexArray);
    }
}
