package HomeWork24_01_24Threads.randomNumbersColThread;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Создать класс Generator extends Thread
            В конструктор класса передается List<Integer> ссылка на
            который сохраняется в классе.
            В методе run() в list по одному добавляются случайные числа и
            после каждого добавления поток “засыпает” (sleep) на 200
            msec
            В лист должно добавится 100 чисел */
        List<Integer> list = new ArrayList<>();
        Generator generator = new Generator(list);

        generator.start();

    }
}
