package HomeWork06_12_23;

public class MultFive {
    public static void main(String[] args) {
        /* Задание 1
         Необходимо вывести на экран таблицу умножения на 5
         */
        int numberMult = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", i, numberMult, getMult(numberMult, i));
        }
    }
    static int getMult(int number, int i) {
        int result = number * i;
        return result;
    }
}
