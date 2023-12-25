package HomeWork18_12_23;

public class MainForPhone {
    public static void main(String[] args) {
        //  Создайте три экземпляра (instance) этого класса.

        Phone phoneOne = new Phone("+375259661236", "Sony", 220);
        Phone phoneTwo = new Phone("+375296666666", "Huawei", 200);
        Phone phoneThree = new Phone("+375447898989", "Xiaomi", 215.5);

        // Выведите в консоль их значения.

        phoneOne.getInfoPhone();
        phoneTwo.getInfoPhone();
        phoneThree.getInfoPhone();

        /*
        Добавить в класс Phone методы: receiveCall (один параметр – имя звонящего). Выводит на
        консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать
        эти методы для каждого из объектов
        */

        phoneOne.receiveCall("Dmitriy");
        phoneOne.getNumber();

        phoneTwo.receiveCall("Andrew");
        phoneTwo.getNumber();

        phoneThree.receiveCall("Alex");
        phoneThree.getNumber();

        /*
        Добавить второй метод receiveCall, который принимает два параметра - имя звонящего и
        номер телефона звонящего. Вызвать этот метод.
        */

        phoneOne.receiveCall("Dmitriy", "+375449999999");

        phoneTwo.receiveCall("Andrew", "+375298888888");

        phoneThree.receiveCall("Alex", "+375254444444");

        // Для следующего задания создал новые объекты класса Phone
        System.out.println();

        Phone phoneAlex = new Phone("+375254444444", "Alex");
        Phone phoneAndrew = new Phone("+375298888888", "Andrew");
        Phone phoneDmitriy = new Phone("+375449999999", "Dmitriy");

        phoneAlex.sendMessage(phoneAndrew, phoneDmitriy);
    }
}
