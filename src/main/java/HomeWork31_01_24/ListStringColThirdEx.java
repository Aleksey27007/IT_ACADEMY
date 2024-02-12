package HomeWork31_01_24;

import java.util.Arrays;
import java.util.List;

public class ListStringColThirdEx {
    public static void main(String[] args) {
        /*Создать список строк List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
            Используя stream и lambda выполнить следующие действия:
            Удалить все содержащие “3”
            Отсортировать сперва по числу (по возрастанию), потом по букве (по убыванию)
            Отбросить первый и последний элемент
            Привести в uppercase
            Выдать на печать результат
            Напечатать количество оставшихся элементов*/

        List<String> myList = List.of("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

        List<String> result = myList.stream()
                .filter(str -> !str.contains("3"))
                .sorted((s1, s2) -> {
                    int num1 = Integer.parseInt(s1.substring(1));
                    int num2 = Integer.parseInt(s2.substring(1));
                    if (num1 != num2) {
                        return Integer.compare(num1, num2);
                    } else {
                        return s2.substring(0, 1).compareTo(s1.substring(0, 1));
                    }
                })
                .skip(1)
                .limit(myList.size() - 2)
                .map(String::toUpperCase)
                .toList();

        result.forEach(System.out::println);
        System.out.println("The number of remaining items: " + result.size());
    }
}
