package HomeWork27_12_23OOP.HomeAppliances;

public class Hairdryer extends SmallHouseholdAppliances {
    private int power;

    public Hairdryer(String size, String name, String model, int wattage, int power) {
        super(size, name, model, wattage);
        this.power = power;
    }

    @Override
    public void turnOn() {
        System.out.println("Something to dry!");
    }
}
