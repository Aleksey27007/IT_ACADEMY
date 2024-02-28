package Lesson24.Ex2;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canBeConstructed("Hello", "elloH"));
        System.out.println(canBeConstructed("aa", "abb"));
    }

    public static boolean canBeConstructed(String word1, String word2) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : word2.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : word1.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        return true;
    }
}
