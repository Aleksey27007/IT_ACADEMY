package HomewWork14_02_24SemaphoreDateTimeApi.readerWriterExercise;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Writer extends Thread {
    private Database database;
    private int ID;

    public Writer(Database database, int ID) {
        this.database = database;
        this.ID = ID;
    }

    @Override
    public void run() {
        while (true) {
            database.writeDatabase();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("...Recorded...");
        }
    }
}
