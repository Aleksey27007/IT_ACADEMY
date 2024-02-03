package HomeWork17_01_24WorkWithFiles.fourthExercise;

public class Main {
    public static void main(String[] args) {
        /* Прочитать файл по строкам. Подсчитать количество символов 'a' в файле. Заменить
            содержимое файла на число символов 'a' */

        ReaplaceTxtToA reaplaceTxtToA = new ReaplaceTxtToA();
        reaplaceTxtToA.createTxtFile();
        reaplaceTxtToA.replaceTxtToA();
    }
}
