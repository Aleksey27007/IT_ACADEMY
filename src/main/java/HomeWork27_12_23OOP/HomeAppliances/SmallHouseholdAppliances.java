package HomeWork27_12_23OOP.HomeAppliances;

public abstract class SmallHouseholdAppliances extends AbstractHomeAppliences {
    private String size;

    public SmallHouseholdAppliances(String size, String name, String model, int wattage) {
        super(name, model, wattage);
        this.size = size;
    }
}
