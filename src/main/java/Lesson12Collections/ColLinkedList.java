package Lesson12Collections;

import java.util.LinkedList;
import java.util.List;

public class ColLinkedList {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Andrew", 10));
        list.add(new Person("Pavel", 11));

        list.add(1, new Person("Vanya", 30));
        System.out.println(list);
    }
}
