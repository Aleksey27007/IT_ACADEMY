package HomeWork24_01_24Threads.arraysThreads;

import java.io.*;

public class SaveAsThread extends Thread {

    private final String PATH = "D:\\IntJava\\IT_Academy\\IT_AcademyLessonsAndHomeW\\src\\main\\java\\HomeWork24_01_24Threads\\arraysThreads\\";
    private final String FILE_NAME = "your_arrays.txt";
    private final String ABSOLUTE_PATH = PATH + FILE_NAME;
    private Object obj = new Object();
    private int[] array;

    public SaveAsThread(int[] array) {
        this.array = array;
    }

    public SaveAsThread() {
    }

    @Override
    public void run() {
        File file = new File(ABSOLUTE_PATH);
        synchronized (obj) {
            try(final BufferedWriter bf = new BufferedWriter(new FileWriter(file, true))) {
                for (int element : array) {
                    bf.write(Integer.toString(element));
                    bf.write(" ");
                }
                bf.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
