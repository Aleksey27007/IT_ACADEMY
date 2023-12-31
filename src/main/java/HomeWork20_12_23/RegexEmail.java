package HomeWork20_12_23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
    public static void main(String[] args) {
        // RegEx. Email. Общий вид — логин@поддомен.домен. Логин, как и поддомен — слова из букв,
        // цифр, подчеркиваний, дефисов и точек. А домен (имеется в виду 1го уровня) — это от 2 до 6
        // букв и точек.
        // Пример: myemail@gmail.com a.petrov@gmail.com.au coder4575@yandex.ru

        String text = """
                RegExr was created by gskinner.com.
                                
                Edit the Expression & Text to see matches. Roll over matches or the expression for details. PCRE & JavaScript flavors of RegEx are supported. Validate your expression with Tests mode.
                                
                The side bar includes a Cheatsheet, full Reference, and Help. You can also Save & Share with the Community and view patterns you create or favorite in My Patterns.
                                
                Explore results with the Tools below. Replace & List output custom results. Details lists capture groups. Explain describes your expression in plain English.
                myemail@gmail.com  a.petrov@gmail.com.au  coder4575@yandex.ru
                """;

        Pattern pattern = Pattern.compile("(\\w|\\d|\\S)+@[a-z]+.[a-z.]{2,6}");
        Matcher matcher = pattern.matcher(text);

        String email = "";

        while(matcher.find()) {
            email = matcher.group();
            System.out.println(email);
        }
    }
}
