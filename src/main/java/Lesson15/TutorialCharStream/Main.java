package Lesson15.TutorialCharStream;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String path = "D:\\IntJava\\IT_Academy\\IT_AcademyLessonsAndHomeW\\src\\main\\java\\Lesson15\\TutorialByteStream\\1.txt";

        FileInputStream fis = null;
        InputStreamReader isr = null;
        int i = 0;
        try {
            fis = new FileInputStream(path);
            isr = new InputStreamReader(fis, "UTF-8");
            while ((i = isr.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (FileNotFoundException e) { // проверка необходима, т.к. в этом случае компилятор путь не проверяет
            throw new RuntimeException(e);
        } catch (IOException e) { // в случаях, если произойдет сбой во время чтения файла
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                isr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}