package HomeWork20_12_23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHexColor {
    public static void main(String[] args) {
        // RegEx. Шестнадцатеричный цвет. Символ # (необязательно), затем слово, состоящее из букв от
        // a до f или цифр, длиной 3 или 6:
        // Пример: FFFFFF #000 101011

        String text = """
                RegExr was created by gskinner.com.
                                
                Edit the Expression & Text to see matches. Roll over matches or the expression for details. PCRE & JavaScript flavors of RegEx are supported. Validate your expression with Tests mode.
                                
                The side bar includes a Cheatsheet, full Reference, and Help. You can also Save & Share with the Community and view patterns you create or favorite in My Patterns.
                                
                Explore results with the Tools below. Replace & List output custom results. Details lists capture groups. Explain describes your expression in plain English.
                FFFFFF
                """;

        String color = "";

        Pattern pattern = Pattern.compile("\\S[A-F0-9]{3,6}");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            color = matcher.group();
        }

        System.out.println(color);
    }
}
