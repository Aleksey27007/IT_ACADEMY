package Lesson24.ExOnlineShop;

import java.util.List;

public class Catalogue {
    private String name;
    private List<Category> categories;

    public Catalogue(String name, List<Category> categories) {
        this.name = name;
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Catalogue{" +
                "name='" + name + '\'' +
                ", categories=" + categories +
                '}';
    }
}
