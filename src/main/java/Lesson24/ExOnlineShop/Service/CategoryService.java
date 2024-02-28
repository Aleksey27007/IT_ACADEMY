package Lesson24.ExOnlineShop.Service;

import Lesson24.ExOnlineShop.Catalogue;
import Lesson24.ExOnlineShop.Category;

public interface CategoryService {

    void addCategory(Catalogue catalogue, String name);
    void addProduct(Catalogue catalogue, String categoryName, String name);
}
