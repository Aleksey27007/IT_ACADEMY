package HomeWork20_12_23;

import java.util.Scanner;

public class StringRedactor {
    public static void main(String[] args) {
        /*
    Вводится ненормированная строка, у которой могут быть пробелы в начале, в конце и между
    словами более одного пробела. Привести ее к нормированному виду, т.е. удалить все пробелы
    в начале и конце, а между словами оставить только один пробел.
    */
        System.out.println("Enter your text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(text);

        text = text.trim(); // удаляет пробелы слева и справа от основного текста
        System.out.println(text);
        scanner.close();
    }
}
