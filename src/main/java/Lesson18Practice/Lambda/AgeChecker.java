package Lesson18Practice.Lambda;

import Lesson18Practice.OOPStudent.Student;

@FunctionalInterface
public interface AgeChecker {

    boolean checkAge(Student student);
}
