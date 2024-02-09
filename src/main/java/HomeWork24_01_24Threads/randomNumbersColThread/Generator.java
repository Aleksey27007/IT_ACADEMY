package HomeWork24_01_24Threads.randomNumbersColThread;


import java.util.List;
import java.util.Random;

public class Generator extends Thread {

    private List<Integer> numbers;
    private int range = 100;

    public Generator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Generator() {
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i <= range; i++) {

            int element = random.nextInt(11);
            numbers.add(element);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("The %d element was added...\n", i);
        }

        System.out.println("Thread close.");
    }
}
