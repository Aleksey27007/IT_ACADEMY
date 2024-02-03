package HomeWork17_01_24WorkWithFiles.thirdExercise;

import java.io.*;
import java.util.Random;

public class DataStreams {
//    final private Random RANDOM = new Random();
    final private int RANGE_NUMBERS = 101;
    final private int NUMBERS = 30;
    final private String PATH = "D:\\IntJava\\IT_Academy\\IT_AcademyLessonsAndHomeW\\src\\main\\java\\HomeWork17_01_24WorkWithFiles\\thirdExercise\\";
    final private String FILE_NAME = "numbers.txt";
    final private String ABSOLUTE_PATH = PATH + FILE_NAME;

    public DataStreams() {
    }

    protected void createFileWithNumbers() {
        Random random = new Random();
        int[] buf = new int[getNUMBERS()];
        System.out.println("Recorded: >>>>");

        for (int i = 0; i < getNUMBERS(); i++) {
            buf[i] = random.nextInt(getRANGE_NUMBERS());
            System.out.print(buf[i] + " ");
        }
        System.out.println();
        try (final DataOutputStream dos = new DataOutputStream(new FileOutputStream(getABSOLUTE_PATH()))) {

            for (int numb : buf) {
                dos.writeInt(numb);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void readFile() {
        int value = 0;
        int average = 0;
        System.out.println("Read: >>>>");

        try (final DataInputStream dis = new DataInputStream(new FileInputStream(getABSOLUTE_PATH()))) {

            while(dis.available() > 0) {
                value = dis.readInt();
                System.out.print(value + " ");
                average += value;
            }
            System.out.println();
            average = average / (getNUMBERS());
            System.out.println(average);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public Random getRANDOM() {
//        return RANDOM;
//    }

    public int getNUMBERS() {
        return NUMBERS;
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

    public int getRANGE_NUMBERS() {
        return RANGE_NUMBERS;
    }
}
