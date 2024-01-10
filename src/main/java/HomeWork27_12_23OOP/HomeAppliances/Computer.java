package HomeWork27_12_23OOP.HomeAppliances;

public class Computer extends SmallHouseholdAppliances {
    private String operationSystem;

    public Computer(String operationSystem, String size, String name, String model, int wattage) {
        super(size, name, model, wattage);
        this.operationSystem = operationSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the computer!");
    }
}
