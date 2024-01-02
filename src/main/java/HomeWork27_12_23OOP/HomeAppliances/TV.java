package HomeWork27_12_23OOP.HomeAppliances;

public class TV extends LargeHouseholdAppliances {
    private float diagonal;

    public TV(String size, String name, String model, int wattage, float diagonal) {
        super(size, name, model, wattage);
        this.diagonal = diagonal;
    }

    @Override
    public void turnOn() {
        System.out.println("The TV turned on!");
    }
}
