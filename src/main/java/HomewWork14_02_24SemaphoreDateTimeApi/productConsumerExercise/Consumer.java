package HomewWork14_02_24SemaphoreDateTimeApi.productConsumerExercise;

public class Consumer implements Runnable{

    private Store products;

    public Consumer(Store products) {
        this.products = products;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while(true) {
            products.getProd();
        }
    }
}
