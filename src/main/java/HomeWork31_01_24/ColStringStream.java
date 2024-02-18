package HomeWork31_01_24;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ColStringStream {
    public static void main(String[] args) {
        /* Дана коллекция Collection<String> col. С помощью Stream API:
            узнать, содержит ли какая-нибудь из строк слово login
            найти самую длинную строку
            найти самую короткую строку
            найти строки-слова (не содержат пробелов и знаков препинания)
            получить все слова используемые в строках */

        List<String> list = List.of("login", "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Hello", "World!");
        String login = "login";

        /** узнать, содержит ли какая-нибудь из строк слово login **/

        boolean isLogin = list.stream()
                .anyMatch(e -> e.equals(login));
        System.out.println(isLogin);

        /** найти самую длинную строку **/

        Optional<String> longetString = list.stream()
                .max(Comparator.comparingInt(String::length));

        longetString.ifPresent(e -> System.out.println("Longest string: " + e));

        /** найти самую короткую строку **/

        Optional<String> shortestString = list.stream()
                .min(Comparator.comparingInt(String::length));

        shortestString.ifPresent(e -> System.out.println("The most shortest string: " + e));

        /** найти строки-слова (не содержат пробелов и знаков препинания) **/

        List<String> words = list.stream()
                .flatMap(e -> List.of(e.split("\\s+")).stream())
                .filter(word -> word.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());

        System.out.println(words);

        /** получить все слова используемые в строках **/

        List<String> onlyWords = list.stream()
                .map(e -> e.split("\\s+"))
                .flatMap(Stream::of)
                .map(word -> word.replaceAll("[!,.]", ""))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(onlyWords);
    }
}
