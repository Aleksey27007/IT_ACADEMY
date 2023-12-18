package HomeWork11_12_23;

import java.util.Random;

import static HomeWork11_12_23.MaxNumberArray.print;
import static HomeWork11_12_23.SumDigitsArray.randomArray;

public class RandomBox {
    public static void main(String[] args) {
        /* Создать двумерный квадратный массив размера n. Заполнить его случайными числами таким
        образом:
                 числа по диагонали равны 0;
                 вверху и снизу от пересечения диагоналей находятся только положительные числа;
                 слева и справа от пересечения диагоналей находятся только отрицательные числа;
                 Вывести массив на экран.
                 Найти сумму всех элементов
                 Найти среднее арифметическое всех элементов, которые больше суммы всех элементов*/

        int[] array;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            array = randomArrayForRandBox(5);
            if (array[i] >= 0) {
                array[i] = 0;
                if (array[array.length - (i + 1)] >= 0) {
                    array[array.length - (i + 1)] = 0;
                }
            }

            if (i == 0) {
                array[i + 1] *= (-1);
            } else {
                array[i - 1] *= (-1);
                if (array[array.length - 1] == 0) {

                } else {
                    array[i + 1] *= (-1);
                }
            }

            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            print(array);
            System.out.println();
        }
        System.out.println("Sum = " + sum);
    }

    public static int[] randomArrayForRandBox(int numberDigits) {
        Random random = new Random();
        int[] array = new int[numberDigits];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(numberDigits) + 1;
        }
        return array;
    }
}
