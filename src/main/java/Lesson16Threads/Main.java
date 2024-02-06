package Lesson16Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread(); // эти потоки равны потоку main
////        myThread.run(); // метод ран не нужно запускать он как toString должен переопределятся под свои задачи
//        myThread.start(); // этот метод запускает новый поток в котором переопределен наш метод run()
//
//        Thread.sleep(1000);
//
//        MyThread myThread1 = new MyThread();
//        myThread1.start();

//        System.out.println("I m going to sleep.");
//        Thread.sleep(3000); // поток который первым доходит до метода sleep() засыпает на 3с
//        System.out.println("I m awake!");

        /** 2 ым способ имплементируя интерфейс Runnable **/
        Thread thread = new Thread(new Runner());
        thread.start();

        System.out.println("Hello from main Th");
    }
}


/** 1 способ создавать потоки **/
class MyThread extends Thread { // MyThread теперь поток это один из способов создавать потоки
    public void run() { // тут задается код который хотим что б он выполнялся в своём потоке
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + " from Thread ");
        }
    }
}

/** 2 ой способ **/
class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + " from Thread ");
        }
    }
}
