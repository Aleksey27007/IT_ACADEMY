package HomeWork17_01_24WorkWithFiles.secondExercise;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class MethodsForWorkWFile {

    final private String PATH = "D:\\IntJava\\IT_Academy\\IT_AcademyLessonsAndHomeW\\src\\main\\java\\HomeWork17_01_24WorkWithFiles\\secondExercise\\";
    final private String NAME = "text.txt";
    final private String NAMECOUNTFILE = "textOut.txt";
    final private String ABSOLUTEPATH = PATH + NAME;
    final private String[] MESSAGES = new String[] {"PUNCTUATION COUNT", "WORD COUNT", "Text has been written."};

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

    public MethodsForWorkWFile() {
    }

    protected void createTxt() {
        File file = new File(getABSOLUTEPATH());

        try(final BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(getTEXT());
            System.out.println(getMESSAGES()[2]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    protected void countPuctAndWords () {
        File file = new File(getABSOLUTEPATH());
        File fileToWrite = new File(getPATH() + getNAMECOUNTFILE());

        int punctCount = 0;
        int wordCount = 0;

        try(final BufferedReader br = new BufferedReader(new FileReader(file));
        final BufferedWriter bw = new BufferedWriter(new FileWriter(fileToWrite))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (char ch : line.toCharArray()) {
                    if (Character.isLetterOrDigit(ch)) {
                        // Если стоит буква одна или цифра, то не считаем
                    } else if (ch != ' '){
                         punctCount++;
                    }
                }

                String[] words = line.split("\\s");
                wordCount += words.length;
            }

            bw.write(getMESSAGES()[0] + " = " + punctCount + " ");
            bw.write(getMESSAGES()[1] + " = " + wordCount + " ");

            getTxtMessages(punctCount, wordCount);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void getTxtMessages(int pCount, int wCount) {
        System.out.println(getMESSAGES()[0] + " = " + pCount);
        System.out.println(getMESSAGES()[1] + " = " + wCount);
        System.out.printf("File %s has been written\n", getNAMECOUNTFILE());
    }

    public String getPATH() {
        return PATH;
    }

    public String getNAME() {
        return NAME;
    }

    public String getABSOLUTEPATH() {
        return ABSOLUTEPATH;
    }

    public String getTEXT() {
        return TEXT;
    }

    public String getNAMECOUNTFILE() {
        return NAMECOUNTFILE;
    }

    public String[] getMESSAGES() {
        return MESSAGES;
    }
}
