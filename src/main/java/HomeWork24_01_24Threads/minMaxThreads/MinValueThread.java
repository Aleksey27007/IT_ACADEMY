package HomeWork24_01_24Threads.minMaxThreads;

public class MinValueThread extends Thread {
    private int[] array;

    public MinValueThread(int[] array) {
        this.array = array;
    }

    public MinValueThread() {
    }

    @Override
    public void run() {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.println("The minimum value of the array: " + minValue);
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
