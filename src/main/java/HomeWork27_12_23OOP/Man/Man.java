package HomeWork27_12_23OOP.Man;

public class Man {

    //Создать класс Man (человек), с полями: имя, возраст, пол и вес. Определить методы задания
    //имени, возраста и веса. Создать производный класс Student, имеющий поле года обучения.
    //Определить методы задания и увеличения года обучения.

    private String name;
    private int age;
    private String sex;
    private float humanWeight;

    public Man(String sex) {
        this.sex = sex;
    }

    public Man() {
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setHumanWeight(float humanWeight) {
        this.humanWeight = humanWeight;
    }
    public float getHumanWeight() {
        return humanWeight;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}
