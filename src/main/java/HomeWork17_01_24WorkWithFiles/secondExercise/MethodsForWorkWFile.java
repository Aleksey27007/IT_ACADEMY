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
