package HomewWork14_02_24SemaphoreDateTimeApi.productConsumerExercise;

public class Main {
    public static void main(String[] args) {
        Store products = new Store(10);
        new Product(products);
        new Consumer(products);
    }
}
