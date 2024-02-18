package HomeWork17_01_24WorkWithFiles.fourthExercise;

import java.io.*;

public class ReaplaceTxtToA {
    final private String TEXT = """
            Предвижу все: вас оскорбит
            Печальной тайны объясненье.
            Какое горькое презренье
            Ваш гордый взгляд изобразит!
            Чего хочу? с какою целью
            Открою душу вам свою?
            Какому злобному веселью,
            Быть может, повод подаю!
                        
            Случайно вас когда-то встретя,
            В вас искру нежности заметя,
            Я ей поверить не посмел:
            Привычке милой не дал ходу;
            Свою постылую свободу
            Я потерять не захотел.
            Еще одно нас разлучило...
            Несчастной жертвой Ленский пал...
            Ото всего, что сердцу мило,
            Тогда я сердце оторвал;
            Чужой для всех, ничем не связан,
            Я думал: вольность и покой
            Замена счастью. Боже мой!
            Как я ошибся, как наказан
            """;

    final private String PATH = "D:\\IntJava\\IT_Academy\\IT_AcademyLessonsAndHomeW\\src\\main\\java\\HomeWork17_01_24WorkWithFiles\\fourthExercise\\";
    final private String FILE_NAME = "song.txt";
    final private String ABSOLUTE_PATH = PATH + FILE_NAME;
    final private char charA = 'а';
    public ReaplaceTxtToA() {
    }

    protected void createTxtFile() { // прото для создания файла
        File file = new File(getABSOLUTE_PATH());

        try (final BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            bw.write(getTEXT());
            System.out.println("File has been written.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void replaceTxtToA() {
        File file = new File(getABSOLUTE_PATH());

        int charACount = 0;

        try(final BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null ) {
                for (char ch : line.toCharArray()) {
                    if (ch == getCharA()) {
                        charACount++;
                    } else {
                        continue;
                    }
                }
            }
            System.out.println(charACount);

            try(final BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write(charACount + " ");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public String getTEXT() {
        return TEXT;
    }

    public String getPATH() {
        return PATH;
    }

    public String getFILE_NAME() {
        return FILE_NAME;
    }

    public String getABSOLUTE_PATH() {
        return ABSOLUTE_PATH;
    }

    public char getCharA() {
        return charA;
    }
}
