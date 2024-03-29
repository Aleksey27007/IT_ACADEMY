package Lesson20.ProdConsum;

public class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; ; i++) {
            buffer.get();
            System.out.println(Thread.currentThread().getName() + " gets " + i);
        }

    }
}