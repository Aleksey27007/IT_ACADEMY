package HomeWork24_01_24Threads.minMaxThreads;

public class MaxValueThread extends Thread {
    private int[] array;

    public MaxValueThread(int[] array) {
        this.array = array;
    }

    public MaxValueThread() {
    }

    @Override
    public void run() {
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        System.out.println("The maximum value of the array: " + maxValue);
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
