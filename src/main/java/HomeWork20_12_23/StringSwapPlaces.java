package HomeWork20_12_23;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringSwapPlaces {
    public static void main(String[] args) {

        // Поменяйте местами первое самое длинное слово с последним самым коротким

        String text = "I'm walking down the street and I see two white girls looking at me and I realize that I went out in winter in slippers having forgotten my winter shoes at home";
        System.out.println(text);

        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));

        String tempMax = words[0];
        String tempMin = words[0];
        StringBuilder replacedText = new StringBuilder();
        int countMax = 0,
                countMin = 0;


        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > tempMax.length()) {
                tempMax = words[i];
            } else if (words[i].length() <= tempMin.length()){
                tempMin = words[i];
            }
        }

        System.out.println(tempMax);
        System.out.println(tempMin);

        for (String word: words) {
            if (word.equals(tempMax)) countMax++;
            else if (word.equals(tempMin)) countMin++;
        }

        System.out.println(countMax);
        System.out.println(countMin);
        int countMinForReplText = 0,
                countMaxForReplText = 0;

        for (String word: words) {
            if (word.equals(tempMax)) {
                countMaxForReplText++;
                if (countMaxForReplText == countMax) {
                    word = tempMin;
                }
            }
            else if (word.equals(tempMin)) {
                countMinForReplText++;
                if (countMinForReplText == countMin) {
                    word = tempMax;
                }
            }

            replacedText.append(word).append(" ");
        }
        System.out.println(replacedText);
    }
}
