package Lesson18Practice.Streams;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<Person> persons = new ArrayList<>();

    static {
        Person person1 = new Person("Ivan", "Ivanov", 25);
        Person person2 = new Person("Petr", "Petrov", 20);
        Person person3 = new Person("Sidor", "Sidorov", 33);
        Person person4 = new Person("Ivan", "Tyrgenev", 42);
        Person person5 = new Person("Lev", "Tolstoy", 90);
        Person person6 = new Person("Anton", "Chehov", 88);
        Person person7 = new Person("Afanasii", "Fet", 100);
        Person person8 = new Person("Vladimir", "Mayakovskii", 40);
        Person person9 = new Person("Mihail", "Lermontov", 30);
        Person person10 = new Person("Aleksey", "Tolstoy", 75);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);
    }

    public static List<Person> getPersons() {
        return persons;
    }

//    public static int getRandomAgeForPerson() {
//        Random random = new Random();
//        int age;
//        age = random.nextInt(100) + 20;
//        return age;
//    }
}
