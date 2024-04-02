package HomewWork14_02_24SemaphoreDateTimeApi.productConsumerExercise;


public class Product implements Runnable{
    private Store products;

    public Product(Store products) {
        this.products = products;
        new Thread(this, "Product").start();
    }

    @Override
    public void run() {
        while(true) {
            products.putProd(products.getProducts());
        }
    }
}
