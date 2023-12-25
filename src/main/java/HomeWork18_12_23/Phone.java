package HomeWork18_12_23;

public class Phone {
    private String name;
    // Создайте класс Phone, который содержит поля number, model и weight.

    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public Phone() {

    }

    public void getInfoPhone() {
        System.out.printf("Number: %s Model: %s Weight: %.1f\n", number, model, weight);
    }
    /* Добавить в класс Phone методы: receiveCall (один параметр – имя звонящего). Выводит на
        консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать
        эти методы для каждого из объектов
    */

    public void receiveCall(String name) {
        System.out.printf("%s CALLS\n", name);
    }

    /*
        Добавить второй метод receiveCall, который принимает два параметра - имя звонящего и
        номер телефона звонящего. Вызвать этот метод.
    */

    public void receiveCall(String name, String phoneNumber) {
        System.out.printf("  %s\n%s\n", name, phoneNumber);
    }
    public void getNumber() {
        System.out.println(number);
    }

    /*
    Создать метод sendMessage с аргументами переменной длины. Данный метод принимает
    на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на
    консоль номера этих телефонов
    */

    public void sendMessage(Phone... numbers) {
        System.out.printf("%s SENT MESSAGES\n", this.name);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%s %s\n", numbers[i].number, numbers[i].name);
        }
    }
}
