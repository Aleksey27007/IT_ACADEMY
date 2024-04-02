package HomewWork14_02_24SemaphoreDateTimeApi.onlineStore;

import java.util.Arrays;
import java.util.List;

public class Basket {
    private List<Product> basket;

    public Basket() {
    }

    public List<Product> getBasket() {
        return basket;
    }

    public void setBasket(List<Product> basket) {
        this.basket = basket;
    }

    public void printInfo() {
        for (Product product : basket) {
            System.out.printf("Product name: %s\n Price: %.1f; Rating: %.1f\n", product.getName(), product.getPrice(), product.getRating());
        }
    }
}
