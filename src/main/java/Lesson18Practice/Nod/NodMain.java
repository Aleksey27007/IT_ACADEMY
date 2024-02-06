package Lesson18Practice.Nod;

public class NodMain {
    public static void main(String[] args) {
        // 6. Разработайте программу для поиска наибольшего общего делителя двух чисел.
        int a = 32;
        int b = 48;

        System.out.println(getNod(a,b));
    }

    static int getNod(int a, int b) {

        int minNumber = Math.min(a, b);
        int nod = 1;

        for (int i = 1; i <= minNumber; i++) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
            }
        }
        return nod;
    }
}
