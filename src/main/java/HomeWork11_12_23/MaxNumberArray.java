package HomeWork11_12_23;

import java.util.Random;

public class MaxNumberArray {
    public static void main(String[] args) {
        /* Найти максимальное значение из массива */
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        print(array);

        int temp = array[0];

        for (int i = 0; i < array.length; i++) {
            if (temp < array[i]) {
                temp = array[i];
            }
        }
        System.out.println("Max number = " + temp);
    }

    public static void print(int array[]) {
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
