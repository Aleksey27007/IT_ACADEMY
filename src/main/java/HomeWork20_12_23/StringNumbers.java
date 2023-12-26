package HomeWork20_12_23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringNumbers {
    public static void main(String[] args) {
        /*
         Введите строку (текст). Найдите наибольшее количество идущих подряд цифр.
        */

        String text = "12bag 214155 1234555 12sasa";
        // Класс Pattern представляет собой скомпилированное представление регулярного выражения.
        Pattern pattern = Pattern.compile("\\d+");
        // класс, который представляет строку, реализует механизм согласования (matching) с
        // РВ и хранит результаты этого согласования (используя реализацию методов интерфейса MatchResult)
        // Не имеет публичных конструкторов, поэтому для создания объекта этого класса нужно использовать метод matcher класса Pattern
        Matcher matcher = pattern.matcher(text);

        String numbersFromTheText = "";
        String theNecessaryNumbers = "";

        // можно ещё использовать matches() когда нам нужно полностью соответствовать РВ
        while(matcher.find()) { // метод find() возвращает true, когда просто удовлетворяет РВ
            numbersFromTheText = matcher.group(); // group() возвращает строку по скомпилированному РВ
            if (numbersFromTheText.length() > theNecessaryNumbers.length()) {
                theNecessaryNumbers = numbersFromTheText;
            }
        }
        System.out.println(theNecessaryNumbers);
    }
}
