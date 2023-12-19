package HomeWork13_12_23;

public class MatrixReplacement {
    public static void main(String[] args) {
        /* Сделать транспонирование матрицы (замена строк на столбцы) */

        int[][] twoDimArray = {{1, 2, 3, 4},{5, 6, 7, 8},{1, 2, 3, 4},{5, 6, 7, 8}};

        System.out.println("Matrix.");
        printTwoDimArray(twoDimArray);

        replacementTwoDimArray(twoDimArray);

        System.out.println("New matrix.");
        printTwoDimArray(twoDimArray);

    }
    private static void printTwoDimArray(int[][] array) {   // вывод матрицы
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%2d", array[i][j]);
            }
            System.out.println();
        }
    }
    private static void replacementTwoDimArray(int[][] array) { // транспортировка матрицы
        System.out.println("Matrix replaced.");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[0].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }
}

