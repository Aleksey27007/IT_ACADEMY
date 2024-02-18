package HomeWork17_01_24WorkWithFiles.secondExercise;

public class Main {
    public static void main(String[] args) {
        // Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.

        MethodsForWorkWFile file = new MethodsForWorkWFile();
        file.createTxt();
        file.countPuctAndWords();
    }
}
