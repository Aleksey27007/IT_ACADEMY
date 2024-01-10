package HomeWork27_12_23OOP.HomeAppliances;

public class ElectricCooker extends LargeHouseholdAppliances {
    private int numberOfPanels;

    public ElectricCooker(String size, String name, String model, int wattage, int numberOfPanels) {
        super(size, name, model, wattage);
        this.numberOfPanels = numberOfPanels;
    }

    @Override
    public void turnOn() {
        System.out.println("The Electric cooker is ready for use!");
    }
}
