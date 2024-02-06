package Lesson12Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsListArrayLIst {

    // созздаем коллекции если знаем конечный размер массива
    // нужно удаление и добавление элементов массива
    // Реализация динамических структур данных таких как связные списки, деревья и т.д

    // Collection framework это унифицированная архитектура представления для

    // List<E> Список может содержать повт элементы, наследуется от коллекции
    // сохраняет последовательность добавленных элементов
    //


    public static void main(String[] args) {

        List<String> defaultList = List.of("5", "6", "7");
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("4");
        for (String listElem : list) {
            System.out.println(listElem);
        }

        System.out.println("-------------");
        list.add(2, "3");

        for (String listElem : list) {
            System.out.println(listElem);
        }

        list.addAll(defaultList);
        System.out.println("-------------");

        for (String listElem : list) {
            System.out.println(listElem);
        }

        System.out.println("-------------");
        System.out.println(list.get(4));
    }
}
