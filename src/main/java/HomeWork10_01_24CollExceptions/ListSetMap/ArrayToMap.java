package HomeWork10_01_24CollExceptions.ListSetMap;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMap <K> {
    //Напишите метод, который получает на вход массив элементов типа К (Generic) и возвращает
    //Map<K, Integer>, где K — значение из массива, а Integer — количество вхождений в массив.
    //Сигнатура метода: <K> Map<K, Integer> arrayToMap(K[] ks)
    public static void main(String[] args) {
        String[] array = new String[] {"Apple", "Orange", "Cherry", "Strawberry", "Watermelon", "Apple",
                "Strawberry"};

        for (String element : array) {
            System.out.println(element);
        }

        System.out.println(arrayToMap(array));
    }

    private static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> newMap = new HashMap<>();

        for (int i = 0; i < ks.length; i++) {
            newMap.put(ks[i], entryInArray(ks, ks[i]));
        }
        return newMap;
    }
    /** entryInArray принимает параметры массив элементов и ключ(Значение, по которому метод будет считать количество вхождений
     * этого ключа в массив).*/
    private static <K> Integer entryInArray(K[] array, K key) {
        Integer quantity = 0;
        for (int i = 0; i < array.length; i++) {
            K temp = key;
            if (temp.equals(array[i])) {
                quantity++;
            }
        }
        return quantity;
    }
}
