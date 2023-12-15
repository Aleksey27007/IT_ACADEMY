package HomeWork11_12_23;

import static HomeWork11_12_23.MaxNumberArray.print;
import static HomeWork11_12_23.SumDigitsArray.randomArray;

public class UnicueNumbers {
    public static void main(String[] args) {
        /* Исключить одинаковые элементы массива (каждое значение должно присутствовать в
            единственном экземпляре) */

        int[] array = randomArray(10);
        print(array);
        int[] uniqueDigitsArray = new int[10];
        int count = 0; // переменная которая считает количество одинаковых элементов

        for (int i = 0; i != array.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j != array.length; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    count++;
                    break;
                }
            }
            if (isUnique) {
                uniqueDigitsArray[i] = array[i];
            }
        }
        int[] newUniqueArr = new int[array.length - count];
        int indexNewUnique = 0;
        for (int i = 0; i < uniqueDigitsArray.length; i++) {
            if (uniqueDigitsArray[i] != 0) {
                newUniqueArr[i - indexNewUnique] = uniqueDigitsArray[i];
            } else {
                indexNewUnique++;
            }
        }

        System.out.println();
        print(uniqueDigitsArray);
        System.out.println(count);
        print(newUniqueArr);
    }
}
