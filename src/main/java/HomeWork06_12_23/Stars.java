package HomeWork06_12_23;

public class Stars {
    public static void main(String[] args) {
        /* Задание 3
        * Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом,
            как на картинке ниже.
            * * * * *
            * * * * *
            * * * * *
        */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
