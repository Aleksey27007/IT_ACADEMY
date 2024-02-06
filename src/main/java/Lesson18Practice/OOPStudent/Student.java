package Lesson18Practice.OOPStudent;

public class Student {
    //2. Создайте класс для хранения информации о студенте (имя, возраст, средний балл) и напишите метод для вывода этой информации на экран.

    private String name;
    private int age;
    private double averageGrade;

    public Student(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public void printInfo() {
        System.out.printf("Student: %s;\nAge: %d;\nGrades: %.2f;", name, age, averageGrade);
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }


}
