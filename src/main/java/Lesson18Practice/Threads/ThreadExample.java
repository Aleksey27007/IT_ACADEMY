package Lesson18Practice.Threads;

import java.util.Random;

public class ThreadExample {
    public static void main(String[] args) {
        int [] array = popolateArray();

        FirstHalfCalculatorThread firstHalfCalculatorThread = new FirstHalfCalculatorThread(array);
        firstHalfCalculatorThread.start();


    }

    static int[] popolateArray() {
        int[] array = new int[100];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
