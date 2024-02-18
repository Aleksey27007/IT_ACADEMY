package HomeWork17_01_24WorkWithFiles.firstExercise;

import java.io.*;
import java.util.*;

public class CreateFilesWithNumbers {

    final private String filePath = "D:\\IntJava\\IT_Academy\\IT_AcademyLessonsAndHomeW\\src\\main\\" +
            "java\\HomeWork17_01_24WorkWithFiles\\firstExercise\\";
    final private String outputFile1 = filePath + "in1.txt";
    final private String outputFile2 = filePath + "in2.txt";
    final private String inputFile = filePath + "out.txt";
    final private int range = 100001;
    final private int maxRange = 1001;
    final private Random random = new Random();
    protected Set<Integer> set1 = createNewNumbsFile(outputFile1, range, maxRange, random);
    protected Set<Integer> set2 = createNewNumbsFile(outputFile2, range, maxRange, random);
    public CreateFilesWithNumbers() {
    }

    protected Set<Integer> getCombinedSet() {
        Set<Integer> combinedSet = new TreeSet<>(getSet1());
        combinedSet.addAll(getSet2());
        File file = new File(getInputFile());

        try(final BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Integer item : combinedSet) {
                writer.write(item.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return combinedSet;
    }
    private static Set<Integer> createNewNumbsFile(String outputFile, int range, int maxRange, Random random) {
        Set<Integer> numbersSet = new TreeSet<>();

        // Класс DataOutputStream представляет поток вывода и предназначен для записи данных примитивных типов, таких, как int, double и т.д
        try (final DataOutputStream dos = new DataOutputStream(new FileOutputStream(outputFile))) {
            for (int i = 0; i < maxRange; i++) {
                int randNumb = random.nextInt(range);
                dos.writeInt(randNumb);
                numbersSet.add(randNumb);
            }
            System.out.println("File has been written");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return numbersSet;
    }

    public Set<Integer> getSet1() {
        return set1;
    }

    public void setSet1(Set<Integer> set1) {
        this.set1 = set1;
    }

    public Set<Integer> getSet2() {
        return set2;
    }

    public void setSet2(Set<Integer> set2) {
        this.set2 = set2;
    }

    public String getInputFile() {
        return inputFile;
    }
}
