package Lesson18Practice.Factorial;

public class Main {
    public static void main(String[] args) {
//4. Напишите программу для вычисления факториала числа.
        int n = -20;
        System.out.println(getFactorial(n));
    }

    private static int getFactorial(int n) {
        int factorial = 1;

        if (n < 0) {
            throw new FactorialException("n < 0");
        } else {
            for (int i = n; i != 0; i--) {
                factorial *= i;
            }
        }

        return factorial;
    }
}
