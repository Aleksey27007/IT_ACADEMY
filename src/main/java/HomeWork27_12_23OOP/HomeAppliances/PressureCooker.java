package HomeWork27_12_23OOP.HomeAppliances;

public class PressureCooker extends SmallHouseholdAppliances {
    private int timeCooking;

    public PressureCooker(String size, String name, String model, int wattage, int timeCooking) {
        super(size, name, model, wattage);
        this.timeCooking = timeCooking;
    }

    @Override
    public void turnOn() {
        System.out.println("I'm starting to cook!");
    }
}
