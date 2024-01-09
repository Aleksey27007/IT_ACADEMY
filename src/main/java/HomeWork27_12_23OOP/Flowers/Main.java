package HomeWork27_12_23OOP.Flowers;

import static HomeWork27_12_23OOP.Flowers.AbstractFlowers.*;

public class Main {
    public static void main(String[] args) {

        Chrysanthemum chrysanthemum = new Chrysanthemum("Blue");
        Chrysanthemum chrysanthemumPink = new Chrysanthemum(30,"Pink");
        Rose rose = new Rose("Red");
        Rose roseWhite = new Rose(30,"White");
        Gypsophila gypsophila = new Gypsophila("White");
        Gypsophila gypsophilaRed = new Gypsophila("Red");

        AbstractFlowers[] bouquet = collectBouquet(chrysanthemum, chrysanthemumPink, rose, roseWhite, gypsophila, gypsophilaRed);

        getBouquetPrice(bouquet);

        identifyBouquetColors(bouquet);

        identifyBouquetWither(bouquet);
    }
}
