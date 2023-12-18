package HomeWork06_12_23;

public class Fibbonachi {
    public static void main(String[] args) {
        /* Выведите на экран первые 10 членов последовательности Фибоначчи */
        int number = 10;
        int fibNumber = 0;
        int firstNumber = 0;
        int secondNumber = 1;

        System.out.printf("%d %d ", firstNumber, secondNumber);

        for (int i = 0; i < number; i++) {
            fibNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibNumber;

            System.out.print(fibNumber + " ");
        }
    }
}
