package HomeWork31_01_24;

import java.util.List;

public class ColIntStream {
    public static void main(String[] args) {
        /* Дана коллекция Collection<Integer> col. С помощью stream API:
                найти минимальное число
                найти максимальное число
                найти среднее арифметическое чисел
                найти произведение всех чисел
                найти сумму всех чисел
                найти сумму всех цифр */

        List<Integer> list = List.of(11, 20, 13, 14, 25, 66, 17, 18);

        /** найти минимальное число **/
        Integer minNumber = list.stream()
                .min(Integer::compare)
                .orElseThrow();

        System.out.println("Min number: " + minNumber);

        /** найти максимальное число **/

        Integer maxNumber = list.stream()
                .max(Integer::compare)
                .orElseThrow();

        System.out.println("Max number: " + maxNumber);

        /** найти среднее арифметическое чисел **/

        double averageNumber = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElseThrow();

        System.out.printf("Average number: %.2f\n", averageNumber);

        /** найти произведение всех чисел **/

        long number = list.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(number);

        /** найти сумму всех чисел **/

        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum: " + sum);

        /** найти сумму всех цифр **/

        int sumNumbers = list.stream()
                .flatMapToInt(num -> String.valueOf(num).chars())
                .map(Character::getNumericValue)
                .sum();

        System.out.println(sumNumbers);

    }
}
