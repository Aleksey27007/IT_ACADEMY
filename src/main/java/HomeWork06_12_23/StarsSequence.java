package HomeWork06_12_23;

public class StarsSequence {
    public static void main(String[] args) {
        /* Задание 4
        * Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом,
            как на картинке ниже.
            *
            * *
            * * *
            * * * *
            * * * * *
        */

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
