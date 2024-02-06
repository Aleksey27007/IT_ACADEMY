package Lesson18Practice.Polindrome;

public class PalindromeChecker {
    public static void main(String[] args) {
        // 7. Напишите программу, которая будет проверять, является ли введенная строка палиндромом.

        String checkedString = "salas";
        System.out.println(isPalindrome(checkedString));
    }

    static boolean isPalindrome(String message) {

        for (int i = 0; i < message.length() / 2; i++) {
            if (message.charAt(i) == message.charAt((message.length() - 1) - i)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
