package HomewWork14_02_24SemaphoreDateTimeApi.readerWriterExercise;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        Reader reader1 = new Reader(database, 1);
        Reader reader2 = new Reader(database, 2);
        Writer writer = new Writer(database, 1);
        reader1.start();
        reader2.start();
        writer.start();
    }
}
