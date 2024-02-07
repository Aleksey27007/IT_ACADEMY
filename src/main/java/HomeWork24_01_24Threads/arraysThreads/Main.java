package HomeWork24_01_24Threads.arraysThreads;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /* Заданы три целочисленных массива. Записать эти массивы в
          файл в параллельных потоках. Создать класс SaveAsThread для
          представления потока, который записывает целочисленный
          массив в файл */

        int[] array1 = createArray();
        int[] array2 = createArray();
        int[] array3 = createArray();

        writeToAFile(array1, array2, array3);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }

    static int[] createArray() {
        Random random = new Random();
        int length = 10;
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(11) + 5;
        }
        return array;
    }

    static void writeToAFile(int[] array1, int[] array2, int[] array3) {

        SaveAsThread saveAsThread1 = new SaveAsThread(array1);
        saveAsThread1.start();
        SaveAsThread saveAsThread2 = new SaveAsThread(array2);
        saveAsThread2.start();
        SaveAsThread saveAsThread3 = new SaveAsThread(array3);
        saveAsThread3.start();

        System.out.println("Everything is recorded");
    }
}
