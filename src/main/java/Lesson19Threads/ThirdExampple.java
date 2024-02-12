package Lesson19Threads;

import java.util.List;
import java.util.concurrent.*;

public class ThirdExampple {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);


        Callable<Integer> task = () -> {

            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 1;
        };

        List<Callable<Integer>> callableList = List.of(task, task, task);

        List<Future<Integer>> futures = executorService.invokeAll(callableList);

        for(Future<Integer> future: futures) {
            System.out.println(future.get());
        }
        executorService.shutdown();

    }
}
