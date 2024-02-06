package Lesson12Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapCol {
    public static void main(String[] args) {
        HashMap<String, Person> personHashMap = new HashMap<>();

        personHashMap.put("1", new Person("Alex", 30));
        personHashMap.put("2", new Person("Dmitriy", 70));
        personHashMap.put("3", new Person("Andrew", 25));



        for (Map.Entry<String, Person> entry: personHashMap.entrySet()) {
            System.out.print(entry.getKey() + "-------->");
            System.out.println(entry.getValue());
        }
    }
}
