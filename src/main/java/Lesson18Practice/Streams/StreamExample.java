package Lesson18Practice.Streams;

import Lesson18Practice.OOPStudent.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamExample {
    public static void main(String[] args) {
        // Поиск подходящего студента

        List<Student> allStudents = getAllStudents();
        Student normalStudents = allStudents.stream()
                .filter(student -> student.getAge() < 19 && student.getAge() >= 17)
                .filter(student -> student.getAverageGrade() > 7.0)
                .limit(1).findFirst().get();

        normalStudents.printInfo();

    }

    static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String[] names = {"Aleksey", "Dasha", "Kirill", "Slava"};
        Random random = new Random();
        for (int i = 0; i < 100 ; i++) {
            students.add(new Student(names[random.nextInt(names.length)], random.nextInt(24) + 15, random.nextDouble(10.0)));
        }
        return students;
    }
}
