package Lesson19Threads;

import java.util.concurrent.*;

public class SecondExampleFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return 10;
        };

        Future<Integer> result =  executorService.submit(task);

        for (;;) {
            if (result.isDone()) {
                System.out.println(result.get());
                break;
            } else {
                System.out.println("Not ready.");
            }
        }

        executorService.shutdown();
    }
}
