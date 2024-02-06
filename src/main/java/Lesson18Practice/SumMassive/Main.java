package Lesson18Practice.SumMassive;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 10};
        int sum = 0;

        for (int element : array) {
            sum += element;
        }

        System.out.println(sum);
    }
}
