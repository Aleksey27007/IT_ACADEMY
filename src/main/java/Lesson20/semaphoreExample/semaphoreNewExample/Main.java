package Lesson20.semaphoreExample.semaphoreNewExample;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("hey");
        new Echo(message);
        new Player(message);
    }
}
