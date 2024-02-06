package Lesson12Collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionExa {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("1");
        stringSet.add("2");
        stringSet.add("3");
        stringSet.add("3");
        stringSet.add("3");

        System.out.println(stringSet);
    }

}
