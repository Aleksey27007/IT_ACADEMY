package HomeWork27_12_23OOP.HomeAppliances;

public class Washer extends LargeHouseholdAppliances {
    private float drumVolume;

    public Washer(String size, String name, String model, int wattage, float drumVolume) {
        super(size, name, model, wattage);
        this.drumVolume = drumVolume;
    }

    @Override
    public void turnOn() {
        System.out.println("I'm starting to wash my clothes!");
    }
}
