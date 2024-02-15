package Lesson18Practice.Streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {

        List<Person> persons = Data.getPersons();
        // 2 типа методов в потоке - 1 конвейерный и 2 терминальный
        // конвейерные могут производить действия с каждым элементом в потоке изменять, фильтровать
        // данные после конвейерных методов остаются в состоянии потока, чтобы их обратно вернуть,
        // то для этого существуют терминальные методы

//        List<Person> persons2 = persons.stream()
////                .filter(person -> person.getAge() > 30) // фильтр оставляет толко то, что подходит по условию
////                .sorted() // сортировка, требует имплементации интерфейса Comparable и перегрузки compareTo()
//                .map(person -> new Person(person.getFirstName(), "Ivanov", person.getAge())) // метод, который позволяет изменять данные
//                .collect(Collectors.toList()); // терминальный метод

//        Optional<Person> person = persons.stream()// Optional ищет подходящий класс для переменной
//                .filter(p -> p.getAge() > 30)
//                        .findAny();
//                .findFirst(); // получаем первого попавшегося по условию из фильтра

        long count = persons.stream()
                        .filter(p -> p.getAge() > 30)
                                .count(); // возращает число типа лонг, количество тех людей, которые проходят по условию
        System.out.println(count);

//        for (Person person : persons2) {
//            System.out.println(person);
//        }

    }
}
