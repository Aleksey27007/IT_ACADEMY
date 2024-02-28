package Lesson24.ExOnlineShop.Service;

import Lesson24.ExOnlineShop.Catalogue;

public interface CatalogueService {

    void createCatalog(String name);
    void printCatalogue();

    Catalogue getCatalogue();

    void findTopProduct();
}
