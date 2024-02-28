package Lesson24.ExOnlineShop.Service;

import Lesson24.ExOnlineShop.Catalogue;
import Lesson24.ExOnlineShop.Category;
import Lesson24.ExOnlineShop.Exceptions.NoSuchCategoryException;
import Lesson24.ExOnlineShop.Product;

import java.util.LinkedList;
import java.util.Random;

public class CategoryServiceImpl implements CategoryService{
    private final Random random = new Random();
    private final double MAX_PRICE = 10.0;

    @Override
    public void addCategory(Catalogue catalogue, String name) {
        if (catalogue != null) {
            Category newCategory = new Category(name, new LinkedList<>());
            catalogue.getCategories().add(newCategory);
            System.out.println("Category " + name + " added.");
        } else {
            System.out.println("Catalogue is null.");
        }
    }

    @Override
    public void addProduct(Catalogue catalogue,  String categoryName, String name) {

        if (catalogue == null) {
            System.out.println("Catalogue not yet.");
            return;
        }
        Category searchedCategory = catalogue.getCategories().stream()
                .filter(category -> category.getName().equals(categoryName))
                .findAny().orElseThrow(() -> new NoSuchCategoryException("It category is not."));
        Product product = new Product(name, random.nextDouble(MAX_PRICE));
        searchedCategory.getProducts().add(product);

        System.out.println("Product was added.");
    }


}
