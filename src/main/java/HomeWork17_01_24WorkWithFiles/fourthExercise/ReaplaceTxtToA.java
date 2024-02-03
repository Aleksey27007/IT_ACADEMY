package HomeWork17_01_24WorkWithFiles.fourthExercise;

import java.io.*;

public class ReaplaceTxtToA {
    final private String TEXT = """
            Eins, Zwei, Drei, Vier, выхожу для вас в эфир
            Моя миссия построить с вами чудный радужный мир
            Fünf, Sechs, Sieben, Acht ваши нравы это schwach
            Традиционным ценностям мы пожелаем gute Nacht
            Я покажу как нужно, я покажу как надо
            Я превращаю вату в выходцев из НАТО
            Хочешь, не хочешь, но ты пройдёшь мой курс
            Schneller, schneller, hände hoch, готовь anus
            Я ЛГБТ-секс-инструктор из НАТО
            Я обучаю нацию трахаться в сраку
            Придётся пройти мой инструктаж
            Натуралы не спрячутся от нас
            Nein
            Секс-инструктор, секс-инструктор, секс-инструктор
            Я инструктор из НАТО
            Секс-инструктор, секс-инструктор, секс-инструктор
            Eins, Zwei, Drei, Vier ЛГБТ-бригадир
            Покажу вам современный европейский ориентир
            Fünf, Sechs, Sieben, Acht Blitzkrieg на всех фронтах
            Этот ритм вселяет страх и ужас в гетеросердцах
            Мы в 21 веке, ренессансе декаданса
            Я научу любить вас так, как нас учат в альянсе
            И когда меня покажут по телевизору
            Я от лица всех членов НАТО доложу
            Я ЛГБТ-секс-инструктор из НАТО
            Я обучаю нацию трахаться в сраку
            Придётся пройти мой инструктаж
            Натуралы не спрячутся от нас
            Я ЛГБТ-секс-инструктор из НАТО
            Я обучаю нацию трахаться в сраку
            Придётся пройти мой инструктаж
            Натуралы не спрячутся от нас
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
