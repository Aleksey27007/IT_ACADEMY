package HomeWork24_01_24Threads.minMaxThreads;

import static HomeWork24_01_24Threads.minMaxThreads.ForArrays.createArray;

public class Main {
    public static void main(String[] args) {
        /*
        * Пользователь вводит с клавиатуры значение в массив. После
          чего запускаются два потока. Первый поток находит максимум в
          массиве, второй — минимум. Результаты вычислений
          возвращаются в метод main()
        */

        int[] array = createArray();

        MinValueThread minValueThread = new MinValueThread(array);
        minValueThread.start();

        MaxValueThread maxValueThread = new MaxValueThread(array);
        maxValueThread.start();
    }
}
