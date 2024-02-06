package Lesson12Collections.CollectionsExample;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
//        List список из каких то конкретных элементов, которые имеют один и тот же тип, которые могут дублироваться и имеют порядок
        // построена на базе массива, доступ по индексу есть, практически мгновенный,
        // но немного ему будет тяжело вставить элемент в середину списка
        // т.к. ему придется сдвинуть все следующие после этого елемента элементы и в огромном списке состоящим из миллиона елементов сделать
        // это окажется очень затратно
        // ArrayList

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Watermelon");
        fruits.add("Apple");
        System.out.println(fruits);


        // В отличии от ArrayList построен на базе связанных друг с другом элементов, каждый такой элемент имеет ссылку на следующий или
        // предыдущий, отсюда следует, что прохождение по индексам тут дорогое и дешевая вставка в середину, т.к при добавлении нового элемента
        // мы меняем ссылки на следующий и предыдущий элемент, сейчас на практике почти не используется

        List<String> fruits2 = new LinkedList<>();
        fruits2.add("Apple");
        fruits2.add("Cherry");
        fruits2.add("Watermelon");
        fruits2.add("Apple");
        System.out.println(fruits2);

        // HashSet это наиболее быстрый тип из всех Set он в себе хранит Map и таким образом может быстро ответиь на вопрос хранится
        //  в нем такой элемент или нет, в отличии от списка, не хранит дубликатов
        // порядок вхождений не сохраняет вычисляется в зависимости от ключа, по которому вычисляетс Hash

        Set<String> fruits3 = new HashSet<>();
        fruits3.add("Apple");
        fruits3.add("Cherry");
        fruits3.add("Watermelon");
        fruits3.add("Apple");
        System.out.println(fruits3);

        // Сохраняет порядок добавления, дубликатов у set нету, немного медленнее чем HashSet

        Set<String> fruits4 = new LinkedHashSet<>();
        fruits4.add("Apple");
        fruits4.add("Cherry");
        fruits4.add("Watermelon");
        fruits4.add("Apple");
        System.out.println(fruits4);

        // TreeSet содержит внутри себя дерево элементов, она позволяет легко отсортировать элементы
        // от меньшего к большему и по алфавиту

        Set<String> fruits5 = new TreeSet<>();
        fruits5.add("Apple");
        fruits5.add("Cherry");
        fruits5.add("Watermelon");
        fruits5.add("Apple");
        System.out.println(fruits5);

        // Map отображение, коллекция, в которой элемент имеет ключ и значение, обращение происходит по ключу
        // подобно словарю, порядка в памяти нет, ключ значение если таковы уже имеются то с put перезаписываются на
        // ключ старый значение новое, а чтобы не заменялось значение, нужно добавлять тогда с помощью putIfAbsent

        Map<String, Integer> fruits6 = new HashMap<>();
        fruits6.put("Apple", 5);
        fruits6.put("Cherry", 6);
        fruits6.put("Watermelon", 10);
        fruits6.put("Apple", 5);
        System.out.println(fruits6.get("Apple"));
    }
}
