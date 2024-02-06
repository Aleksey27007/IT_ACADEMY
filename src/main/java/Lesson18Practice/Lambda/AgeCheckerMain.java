package Lesson18Practice.Lambda;

import Lesson18Practice.OOPStudent.Student;

public class AgeCheckerMain {

    public static void main(String[] args) {
        // проверить является ли совершеннолетним студент
        AgeChecker americanAgeChecker = (student) -> {
            return student.getAge() >= 21;
        } ;

        Student john = new Student("John", 17, 2.15);
        Student brad = new Student("Brad", 22, 2.45);

        System.out.println(americanAgeChecker.checkAge(john));
        System.out.println(americanAgeChecker.checkAge(brad));
    }
}
