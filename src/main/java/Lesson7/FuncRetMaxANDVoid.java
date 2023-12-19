package Lesson7;

public class FuncRetMaxANDVoid {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 2, 7, 2, 18, 0};

        int maxElement = getSMaxElement(array);
        System.out.println(maxElement);

        printMinElement(array);
    }
    public static int getSMaxElement(int[] array) {
        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
            } else {
                continue;
            }
        }
        return maxElement;
    }

    public static void printMinElement(int[] array) {
        int minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minElement > array[i]) {
                minElement = array[i];
            } else {
                continue;
            }
        }
        System.out.println(minElement);
    }
}
