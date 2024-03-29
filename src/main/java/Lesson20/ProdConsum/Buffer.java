package Lesson20.ProdConsum;

public class Buffer {
    private int messageCount = 0;
    public synchronized void get() {
        while (messageCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) { /* ... */ }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        messageCount--;
        notifyAll();
    }
    public synchronized void put() {
        while (messageCount >= 3) {
            try {
                wait();
            } catch (InterruptedException e) { /* ... */ }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        messageCount++;
        notifyAll();
    }
}