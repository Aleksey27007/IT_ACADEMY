package HomeWork07_02_2024;

import java.util.Random;
import java.util.concurrent.*;

public class ThreadsPoolAsync {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /* Создайте матрицу размера n*m. Создайте два потока, один из
         которых перемножает все значения в столбцах и потом находит
         сумму, а другой поток перемножает все значения в строках и тоже
         потом находит сумму. Определите какое число больше. */

        int[][] matrix = newRandomMatrix();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable task1 = () -> {

            int sum = calculateColumnSum(matrix);

            System.out.println("Sum from task1 = " + sum);
            return sum;
        };

        Callable task2 = () -> {
            int sum = calculateRowSum(matrix);

            System.out.println("Sum from task2 = " + sum);
            return sum;
        };

        Future<Integer> sumFromTask1 = executorService.submit(task1);

        Future<Integer> sumFromTask2 = executorService.submit(task2);

        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sampleResults(sumFromTask1.get(), sumFromTask2.get());
    }


    private static int[][] newRandomMatrix() {
        Random random = new Random();
        int lengthN = 5;
        int lengthM = 5;

        int[][] matrix = new int[lengthN][lengthM];

        for (int i = 0; i < lengthN; i++) {
            for (int j = 0; j < lengthM; j++) {
                matrix[i][j] = random.nextInt(6) + 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    private static int calculateColumnSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            int result = 1;
            for (int j = 0; j < matrix.length; j++) {
                result *= matrix[j][i];
            }
            sum += result;
        }

        return sum;
    }

    private static int calculateRowSum(int[][] matrix){
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            int result = 1;
            for (int j = 0; j < matrix.length; j++) {
                result *= matrix[i][j];
            }
            sum += result;
        }
        return sum;
    }

    private static void sampleResults(int r1, int r2) {
        if (r1 > r2) System.out.println("SUM FROM TASK 1 IS GREATER");
        else System.out.println("SUM FROM TASK 2 IS GREATER");
    }
}
