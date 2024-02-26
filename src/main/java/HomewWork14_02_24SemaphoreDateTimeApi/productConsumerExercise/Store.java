package HomewWork14_02_24SemaphoreDateTimeApi.productConsumerExercise;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Store {
    private int products;
    private Semaphore consumerSemaphore = new Semaphore(0);
    private Semaphore productSemaphore = new Semaphore(1);
    private Random random = new Random();
    private final int RANDOM_BOUND = 6;

    public Store(int products) {
        this.products = products;
    }

    public int getProducts() {
        return products;
    }

    public void setProducts(int products) {
        this.products = products;
    }

    public Semaphore getConsumerSemaphore() {
        return consumerSemaphore;
    }

    public void setConsumerSemaphore(Semaphore consumerSemaphore) {
        this.consumerSemaphore = consumerSemaphore;
    }

    public Semaphore getProductSemaphore() {
        return productSemaphore;
    }

    public void setProductSemaphore(Semaphore productSemaphore) {
        this.productSemaphore = productSemaphore;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void putProd(int products) {
        try {
            productSemaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.setProducts(this.products + getRandom().nextInt(RANDOM_BOUND));
        consumerSemaphore.release();
        System.out.println("Put products, Products left: " + this.getProducts());
    }

    public void getProd() {
        try {
            consumerSemaphore.acquire();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.setProducts(this.products - getRandom().nextInt(RANDOM_BOUND));
        System.out.println("Get products, Products left: " + this.getProducts());
        productSemaphore.release();
    }
}
