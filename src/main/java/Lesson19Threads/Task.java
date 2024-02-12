package Lesson19Threads;

import java.util.List;
import java.util.concurrent.*;

public class Task {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<Integer> numbersList = List.of(1, 2, 3, 4, 5, 6);


        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 0; i < numbersList.size(); i++) {
                if (numbersList.get(i) % 2 != 0) {
                    sum += numbersList.get(i);
                }
            }
            return sum;
        };

        Future<Integer> result = executorService.submit(task);

        if (result.isDone()) {
            System.out.println(result.get());
        } else {
            System.out.println("Not ready.");
        }

        executorService.shutdown();
    }
}
