package Lesson24.ExOnlineShop;

import java.util.UUID;

public class Product{
    private UUID id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
