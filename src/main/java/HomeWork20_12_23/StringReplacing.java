package HomeWork20_12_23;

import java.util.Scanner;

public class StringReplacing {
    public static void main(String[] args) {
        /*
        Введите строку. Если она начинается на 'abc', то заменить их на 'www', иначе добавить в конец
        строки 'zzz'
        */
        System.out.println("Enter your line: ");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        StringBuffer messageBuffer = new StringBuffer(message);

        System.out.println(message);

        String zzz = "zzz";
        String www = "www";

        if (message.startsWith("abc")) {
            messageBuffer.replace(0, 3, www); // указал индекс 3 т.к. метод требует индекс ДО которого нужно удалить и вставить замену
        } else {
            messageBuffer.append(zzz);
        }
        System.out.println(messageBuffer);
    }
}
