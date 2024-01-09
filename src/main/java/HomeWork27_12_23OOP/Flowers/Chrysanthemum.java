package HomeWork27_12_23OOP.Flowers;

public class Chrysanthemum extends AbstractFlowers{
    public Chrysanthemum(String color) {
        this.setName("Chrysanthemum");
        this.setColor(color);
        this.setStemHeight(60.5f);
        this.setPrice(6);
        this.setLifeTime(getLifeTime());
    }

    public Chrysanthemum(float height, String color) {
        this.setName("Chrysanthemum");
        this.setColor(color);
        this.setStemHeight(height);
        this.setPrice(4);
        this.setLifeTime(getLifeTime());
    }

    @Override
    public int getLifeTime() {
        int days = 7 + (int) (Math.random() * 15);
        return days;
    }
}
