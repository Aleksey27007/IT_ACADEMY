package HomeWork21_02_24.Reflection.LinkedListLearning;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String message = """
                java.util.LinkedList - это класс в Java, который представляет собой двусвязный список элементов.
                Вот краткая информация о классе:
                                
                1. Поля класса:
                   - int size: хранит количество элементов в списке.
                   - Node<E> first: ссылка на первый узел списка.
                   - Node<E> last: ссылка на последний узел списка.
                                
                2. Родительский класс:
                   - java.util.AbstractSequentialList<E>
                                
                3. Методы класса:
                   - add(E e): добавляет элемент в конец списка.
                   - remove(Object o): удаляет первое вхождение указанного элемента из списка.
                   - get(int index): возвращает элемент по указанному индексу и т.д.
                                
                4. Конструкторы:
                   - LinkedList(): создает пустой список.
                   - LinkedList(Collection<? extends E> c): создает список из коллекции c.
                                
                5. Внутренние классы:
                   - Node<E>: внутренний класс, представляющий узел списка.
                """;
        System.out.println(message);
    }
}
