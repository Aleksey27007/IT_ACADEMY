package HomewWork14_02_24SemaphoreDateTimeApi.readerWriterExercise;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reader extends Thread {
    private Database database;
    private int ID;


    public Reader(Database database, int ID) {
        this.database = database;
        this.ID = ID;
    }

    @Override
    public void run() {
        while (true) {
            database.readDatabase();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("...Read...");
        }
    }
}
