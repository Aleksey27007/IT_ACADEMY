package HomeWork13_12_23;

import java.util.Scanner;

public class SquareRoots {
    public static void main(String[] args) {
        /* Создать программу, которая будет находить вещественные
        корни квадратного уравнения ax²+bx+c=0, либо сообщать, что
        корней нет. */

        float[] coefficient = new float[3];
        System.out.println("Enter your numbers: ");

        for (int i = 0; i < 3; i++) {
            coefficient[i] = getNumber();
        }

        print(coefficient);

        float a = coefficient[0], b = coefficient[1], c = coefficient[2];

        System.out.printf("%.2fx^2 + %.2fx + %.2f = 0 \n", a, b, c); // ax^2 + bx + c = 0

        double discriminant = Math.pow(b, 2) - (4 * a * c); // b^2 - 4 * a * c

        if (discriminant > 0) {
            double firstRoot = (-1 * b + Math.sqrt(discriminant)) / (2 * a);
            double secondRoot = (-1 * b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("2 roots : \nfirst root x1 = " + firstRoot + "\n" + "second root x2 = " + secondRoot);
        } else if (discriminant == 0) {
            double rootIfZero = (-1 * b) / 2 * a;
            System.out.println("Only 1 root x = " + rootIfZero);
        } else {
            double i = Math.sqrt(-1);
            double rootIfLessThanZeroFirst = (-1 * b + (i * Math.sqrt(discriminant))) / (2 * a);
            double rootIfLessThanZeroSecond = (-1 * b - (i * Math.sqrt(discriminant))) / (2 * a);
            System.out.println("No real roots.\nOnly complex roots. x1 = " + rootIfLessThanZeroFirst + "\n" +
                    "x2 = " + rootIfLessThanZeroSecond);
        }
    }

    public static void print(float[] array) {
        for (float number : array) {
            System.out.println(number);
        }
    }

    public static float getNumber() {
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextInt();
        return number;
    }
}
