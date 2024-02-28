package Lesson24.ExOnlineShop;

import Lesson24.ExOnlineShop.Exceptions.NoSuchCategoryException;
import Lesson24.ExOnlineShop.Service.CatalogServiceImpl;
import Lesson24.ExOnlineShop.Service.CatalogueService;
import Lesson24.ExOnlineShop.Service.CategoryService;
import Lesson24.ExOnlineShop.Service.CategoryServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final CatalogueService catalogueService = new CatalogServiceImpl();
        final CategoryService categoryService = new CategoryServiceImpl();
        String menu = """
                CONSOLE SHOP
                ----------------------------------------
                1) Создать каталог.
                2) Добавить категорию в каталог.
                3) Добавить товар в категорию.
                4) Вывести содержимое каталога на экран.
                5) Вывести 3 самых дорогих товара.
                6) Выход.
                ----------------------------------------
                Enter the required command
                """;


        Scanner sc = new Scanner(System.in);

        try{
            while(true) {
                System.out.println(menu);
                String choice = sc.nextLine();

                switch (Integer.parseInt(choice)) {
                    case 1 -> {
                        System.out.println("Enter name for catalogue: ");
                        catalogueService.createCatalog(sc.nextLine());
                    }
                    case 2 -> {
                        System.out.println("Enter name for category: ");
                        categoryService.addCategory(catalogueService.getCatalogue(), sc.nextLine());
                    }
                    case 3 -> {
                        System.out.println("Enter name for category: ");
                        String categoryName = sc.nextLine();

                        System.out.println("Enter name for product: ");
                        String productName = sc.nextLine();

                        try {
                            categoryService.addProduct(catalogueService.getCatalogue(), categoryName, productName);
                        } catch (NoSuchCategoryException e){
                            System.out.println("Category is not yet.");
                        }

                    }
                    case 4 -> catalogueService.printCatalogue();
                    case 5 -> catalogueService.findTopProduct();
                    case 6 -> System.exit(0);
                    default -> System.out.println("Try again.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Poprobyite eshe raz.");
        }
    }
}
