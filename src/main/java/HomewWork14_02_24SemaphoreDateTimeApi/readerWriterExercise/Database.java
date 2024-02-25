package HomewWork14_02_24SemaphoreDateTimeApi.readerWriterExercise;

import java.util.concurrent.Semaphore;

public class Database {
    private Semaphore dbSemaphore = new Semaphore(10);
    private boolean accessFlag = false;
    public Database() {
    }

    public void readDatabase() {
        try {
            if (!accessFlag) {
                dbSemaphore.acquire();
                System.out.println("Database is being read");

                dbSemaphore.release();
                System.out.println("...Read...");
            } else {
                System.out.println("Database is already being read, waiting... FOR READER");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void writeDatabase() {
        try {
            if (!accessFlag) {
                dbSemaphore.acquire(dbSemaphore.availablePermits());
                accessFlag = true;
                System.out.println("Database is being write");


            } else {
                System.out.println("Database is already being read, waiting... FOR WRITER");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            accessFlag = false;
            dbSemaphore.release(dbSemaphore.availablePermits());

        }
    }
}
