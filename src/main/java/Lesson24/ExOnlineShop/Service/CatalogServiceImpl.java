package Lesson24.ExOnlineShop.Service;

import Lesson24.ExOnlineShop.Catalogue;
import Lesson24.ExOnlineShop.Category;
import Lesson24.ExOnlineShop.Product;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CatalogServiceImpl implements CatalogueService{
    private Catalogue catalogue;

    @Override
    public void createCatalog(String name) {
        if (catalogue == null) {
            System.out.println("New Catalogue name: " + name +  " created.");
            catalogue = new Catalogue(name, new LinkedList<>());
        } else {
            System.out.println("Catalogue exists.");
        }
    }

    @Override
    public void printCatalogue() {
        if (catalogue == null) {
            System.out.println("Catalogue is not yet.");
            return;
        }

        System.out.println(catalogue.getName());

        catalogue.getCategories().stream()
                .peek(category -> System.out.println(category.getName()))
                .flatMap(category -> category.getProducts().stream())
                .forEach(product -> System.out.println(product.getName()));
    }

    @Override
    public Catalogue getCatalogue() {
        return catalogue;
    }

    @Override
    public void findTopProduct() {
        if (catalogue == null) {
            System.out.println("Catalogue is not yet.");
            return;
        }

        catalogue.getCategories().stream()
                .flatMap(category -> category.getProducts().stream())
                .sorted(Comparator.comparingInt(p -> (int) p.getPrice()))
                .limit(3)
                .forEach(System.out::println);

    }
}
