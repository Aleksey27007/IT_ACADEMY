package HomeWork17_01_24WorkWithFiles.thirdExercise;

public class Main {
    public static void main(String[] args) {
        /*
        * Записать в двоичный файл 30 случайных чисел от 1 до 100. Прочитать записанный файл
            распечатать числа и их среднее арифметическое. */

        DataStreams ds = new DataStreams();
        ds.createFileWithNumbers();
        ds.readFile();
    }
}
