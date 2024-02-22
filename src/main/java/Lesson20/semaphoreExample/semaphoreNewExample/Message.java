package Lesson20.semaphoreExample.semaphoreNewExample;

import java.util.concurrent.Semaphore;

public class Message {
    String message;
    Semaphore playerSemaphore = new Semaphore(1);
    Semaphore echoSemaphore = new Semaphore(0);

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Semaphore getPlayerSemaphore() {
        return playerSemaphore;
    }

    public void setPlayerSemaphore(Semaphore playerSemaphore) {
        this.playerSemaphore = playerSemaphore;
    }

    public Semaphore getEchoSemaphore() {
        return echoSemaphore;
    }

    public void setEchoSemaphore(Semaphore echoSemaphore) {
        this.echoSemaphore = echoSemaphore;
    }

    public void say(String message) {
        try {
            playerSemaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.setMessage(message);
        echoSemaphore.release();
        System.out.println("Sent: " + this.getMessage());
    }

    public void reply() {
        try {
            echoSemaphore.acquire();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Received: " + this.getMessage());
        playerSemaphore.release();
    }
}
