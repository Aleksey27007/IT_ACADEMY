package HomeWork06_12_23;

public class SequenceOfNumbers {
    public static void main(String[] args) {
        /* Задание 2
        * Необходимо вывести на консоль такую последовательность чисел:
        1 2 4 8 16 32 64 128 256 512*/
        int number = 2;
        int numberData = 1;
        System.out.print(numberData + " ");

        while(numberData != 512) {
            numberData = numberData * number;
            System.out.print(numberData + " ");
        }
    }
}
