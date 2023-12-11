package HomeWork04_12_23;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        /* Задание 1
        Напишите программу, которая будет переводить секунды в форматированный вид - часы
        минуты секунды учитывая окончания слов

        1249
        20 минут 49 секунд
        Добавьте 3 строчку, которая будет выводить недели, сутки, часы минуты и секунды
        */
        Scanner scanner = new Scanner(System.in);
        int yourSeconds = scanner.nextInt();

        int hours = yourSeconds / 3600;
        int minutes = (yourSeconds % 3600) / 60;
        int seconds = yourSeconds % 60;

        String answer = "";

        if (seconds == 0) {
            answer += "";
        } else if (seconds == 1 || seconds % 10 == 1) {
            answer += seconds + " secunda ";
        } else if (seconds % 10 == 2 || seconds % 10 == 3 || seconds % 10 == 4) {
            answer += seconds + " secundi ";
        } else    {
            answer += seconds + " secund ";
        }

        if (minutes == 0) {
            answer += "";
        } else if (minutes == 1 || minutes % 10 == 1) {
            answer += minutes + " minuta ";
        } else if (minutes % 10 == 2 || minutes % 10 == 3 || minutes % 10 == 4) {
            answer += minutes + " minuti ";
        } else    {
            answer += minutes + " minut ";
        }

        if (hours == 0) {
            answer += "";
        } else if (hours == 1 || hours % 10 == 1) {
            answer += hours + " chas ";
        } else if (hours % 10 == 2 || hours % 10 == 3 || hours % 10 == 4) {
            answer += hours + " chasa ";
        } else    {
            answer += hours + " chasov ";
        }
        System.out.println(answer);
    }
}
