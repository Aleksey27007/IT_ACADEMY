package HomeWork10_01_24CollExceptions.ListSetMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharsCount {
    public static void main(String[] args) {
        // Реализовать функцию подсчета количества разных символов в строке - public Map<Character,
        // Integer> getCharsCount(String s)
        // Пример: строка “baaccc” и результат: ‘b’ -1, ‘a’ - 2, ‘c’ - 3

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        System.out.println(string);
        System.out.println(getCharsCount(string));
    }

    private static Map<Character, Integer> getCharsCount(String string) {
        Map<Character, Integer> mapChars = new LinkedHashMap<>();

        for (int i = 0; i < string.length(); i++)  {
            mapChars.put(string.charAt(i) , getValue(string, string.charAt(i)));
        }
        return mapChars;
    }

    private static Integer getValue(String string, char symbol) {
        Integer value = 0;
        for (int i = 0; i < string.length(); i++) {
            char temp = symbol;
            if (temp == string.charAt(i)) {
                value++;
            }
        }
        return value;
    }
}
