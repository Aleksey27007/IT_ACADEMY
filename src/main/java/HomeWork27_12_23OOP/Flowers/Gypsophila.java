package HomeWork27_12_23OOP.Flowers;

public class Gypsophila extends AbstractFlowers {

    public Gypsophila(String color) {
        this.setName("Gypsophila");
        this.setColor(color);
        this.setStemHeight(30f);
        this.setPrice(9);
        this.setLifeTime(getLifeTime());
    }

    @Override
    public int getLifeTime() {
        int days = 15 + (int) (Math.random() * 17);
        return days;
    }
}
