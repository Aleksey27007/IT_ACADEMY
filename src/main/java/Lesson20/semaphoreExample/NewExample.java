package Lesson20.semaphoreExample;

import java.util.concurrent.Semaphore;

public class NewExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < 6; i++) {
            new Thread(new SemaphoreThread(semaphore, i)).start();
        }
    }
}
