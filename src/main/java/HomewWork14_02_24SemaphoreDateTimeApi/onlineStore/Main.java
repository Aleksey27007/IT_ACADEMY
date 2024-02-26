package HomewWork14_02_24SemaphoreDateTimeApi.onlineStore;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Category electricalEngineering = new Category("electrical engineering");
        electricalEngineering.setProductList(ProductsForStore.productList);

        Basket basket = new Basket();
        List<Product> purchase = Arrays.asList(electricalEngineering.getProductList().get(0));

        basket.setBasket(purchase);
        basket.printInfo();
    }
}
