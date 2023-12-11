package HomeWork04_12_23;

import java.util.Scanner;

public class FingerNameSwitch {
    public static void main(String[] args) {
        /* Задание 5
        * По порядковому номеру пальца руки необходимо вывести его навание на экран */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter finger number: ");
        int fingerNumber = scanner.nextInt();


        switch (fingerNumber) {
            case 1:
                System.out.println("This is the thumb (Большой палец)");
                break;
            case 2:
                System.out.println("This is the index finger (Указательный палец)");
                break;
            case 3:
                System.out.println("This is the middle finger (Средний палец)");
                break;
            case 4:
                System.out.println("This is the ring finger (Безымянный палец)");
                break;
            case 5:
                System.out.println("This is the little finger (Это маленький палец)");
                break;
            default:
                System.out.println("We don't have such a finger");
                break;
        }
        scanner.close();
    }
}
