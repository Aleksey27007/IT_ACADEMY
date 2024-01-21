package HomeWork10_01_24CollExceptions.Exceptions;

import java.util.ArrayList;
import java.util.List;

public class ClassCastExcercise {
    public static void main(String[] args) {
        // Создайте список разных объектов и попытайтесь привести их к одному типу.
        //Обработайте полученное исключение

        List<Object> objList = new ArrayList<>();
        objList.add("String");
        objList.add('S');
        objList.add(false);
        objList.add(29.18);

        for (Object obj : objList) {
            try {
                Integer value = (Integer) obj;
                System.out.println(value);
            } catch (ClassCastException e) {
                System.out.println("ClassCastException: " + e.getMessage());
            }
        }
    }
}
