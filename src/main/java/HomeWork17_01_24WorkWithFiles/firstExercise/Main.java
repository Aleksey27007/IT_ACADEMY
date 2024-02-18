package HomeWork17_01_24WorkWithFiles.firstExercise;

public class Main {
    /* Даны 2 файла - in1.txt и in2.txt в каждом файле по 1000 чисел от 1 до 100000. Создайте файл
        out.txt, который будет содержать все отсортированные числа из файлов in1.txt и in2.txt. Файлы
        in1.txt и in2.txt можно создать с помощью кода.

       Подсказка: Тут можем использовать в рамках этого задания метод split и метод Integer.parseInt */
    public static void main(String[] args) {
        CreateFilesWithNumbers fileWithNumbers = new CreateFilesWithNumbers();
        System.out.println(fileWithNumbers.set1);
        System.out.println(fileWithNumbers.set2);
        System.out.println(fileWithNumbers.getCombinedSet());
    }
}
