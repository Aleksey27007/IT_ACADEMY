package HomewWork14_02_24SemaphoreDateTimeApi.onlineStore;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String categoryName;
    private List<Product> productList;

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.productList = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
