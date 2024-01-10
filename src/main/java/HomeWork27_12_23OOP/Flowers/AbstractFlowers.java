package HomeWork27_12_23OOP.Flowers;

import java.util.Random;

public abstract class AbstractFlowers {

    // Реализовать иерархию цветов (розы, гвоздики, тюльпаны, лилии и... что-то на свой вкус).
    //      Создать несколько объектов-цветов.
    //      Собрать букет и определить его стоимость.
    //      Определить все цвета, используемые в букете.
    //      Определить когда весь букет завянет

    private String name;
    private String color;
    private float stemHeight;
    private int price;

    private int lifeTime;

    public void info() {
        System.out.printf("%s %s %.1fcm %dp %d days\n", name, color, stemHeight, price, lifeTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getStemHeight() {
        return stemHeight;
    }

    public void setStemHeight(float stemHeight) {
        this.stemHeight = stemHeight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public static void getBouquetPrice(AbstractFlowers[] bouquet) {
        int price = 0;
        System.out.println("Your bouquet: ");
        for (AbstractFlowers flower : bouquet) {
            price += flower.getPrice();
            flower.info();
        }
        System.out.println("The price of your bouquet: " + price + "p");
    }

    public static AbstractFlowers[] collectBouquet(AbstractFlowers... flowers) {
        int flowerCount = 0;
        for (AbstractFlowers flower : flowers) {
            flowerCount++;
        }

        AbstractFlowers[] bouquet = new AbstractFlowers[flowerCount];

        for (int i = 0; i < bouquet.length; i++) {
            bouquet[i] = flowers[i];
        }
        return bouquet;
    }

    public static void identifyBouquetColors(AbstractFlowers[] bouquet) {
        String colorsFlowers = "";
        for (AbstractFlowers flower : bouquet) {
            colorsFlowers += flower.getColor() + " " + flower.getName() + " ";
        }
        System.out.println("All the colors used in the bouquet: \n" + colorsFlowers);
    }

    public static void identifyBouquetWither(AbstractFlowers[] bouquet) {
        int dayWhenWitherBouquet = 0;

        for (int i = 0; i < bouquet.length; i++) {
            if (bouquet[i].lifeTime > dayWhenWitherBouquet) {
                dayWhenWitherBouquet = bouquet[i].lifeTime;
            }
        }

        System.out.printf("Your bouquet will wither completely in %d days\n", dayWhenWitherBouquet);
    }
}
