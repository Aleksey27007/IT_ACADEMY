package HomeWork27_12_23OOP.Flowers;

public class Rose extends AbstractFlowers {

    public Rose (String color) {
        this.setName("Rose");
        this.setColor(color);
        this.setStemHeight(60.5f);
        this.setPrice(8);
        this.setLifeTime(getLifeTime());
    }

    public Rose (float height, String color) {
        this.setName("Rose");
        this.setColor(color);
        this.setStemHeight(height);
        this.setPrice(5);
        this.setLifeTime(getLifeTime());
    }

    @Override
    public int getLifeTime() {
        int days = 7 + (int) (Math.random() * 7);
        return days;
    }
}
