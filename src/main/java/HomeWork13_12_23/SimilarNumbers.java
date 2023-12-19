package HomeWork13_12_23;

public class SimilarNumbers {
    public static void main(String[] args) {
        /* Электронные часы показывают время в формате от 00:00 до
            23:59. Подсчитать сколько раз за сутки случается так, что слева
            от двоеточия показывается симметричная комбинация для той,
            что справа от двоеточия (например, 02:20, 11:11 или 15:51)
        */

        int hoursNumber = 23;
        int minuteNumber = 59;
        int count = 0;

        for (int i = 0; i <= hoursNumber; i++) {
            int digit1 = i / 10 % 10;
            int digit2 = i % 10;
            for (int j = 0; j <= minuteNumber; j++) {
                int digit3 = j / 10 % 10;
                int digit4 = j % 10;
                if (digit1 == digit4 && digit2 == digit3) {
                    count++;
                } else {
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}
