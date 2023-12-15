package HomeWork11_12_23;

import java.util.Random;

import static HomeWork11_12_23.MaxNumberArray.print;
import static HomeWork11_12_23.SumDigitsArray.randomArray;

public class FlipTheArray {
    public static void main(String[] args) {
        /* Создать массив заполнить его случайными элементами, распечатать, перевернуть, и снова
        распечатать
        При перевороте элементов не желательно создавать еще один массив */
        Random random = new Random();
        int randNumber = random.nextInt(20) + 6;

        int[] array = randomArray(randNumber);
        print(array);


        for (int i = 0; i < array.length; i++) {
            if (array.length / 2 != i) {
                int firstNumber = array[i];
                int lastNumber = array[array.length - (1 + i)];
                array[i] = lastNumber;
                array[array.length - (1 + i)] = firstNumber;
            } else {
                break;
            }
        }

        System.out.println();
        print(array);
    }
}
