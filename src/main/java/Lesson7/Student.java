package Lesson7;

public class Student {
    private int age;
    private int uspevaemost;
    private String name;

    public Student(int age, int uspevaemost, String name) {
        this.age = age;
        this.uspevaemost = uspevaemost;
        this.name = name;
    }

    public Student(){
        System.out.println("Student created.");
    }

    public int getUspevaemost() {
        return uspevaemost;
    }

    public void setUspevaemost(int uspevaemost) {
        this.uspevaemost = uspevaemost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
