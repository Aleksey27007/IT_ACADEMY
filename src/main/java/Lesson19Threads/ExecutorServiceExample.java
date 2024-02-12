package Lesson19Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3); // создает 3 управляемых потока

        Runnable task = () -> {  // запуск с лямбдой
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };


        executorService.execute(task);
        executorService.execute(task);
        executorService.execute(task);
        executorService.execute(task);


        executorService.shutdown();
    }
}
