package HomeWork27_12_23OOP.HomeAppliances;

public abstract class LargeHouseholdAppliances extends AbstractHomeAppliences {
    private String size;

    public LargeHouseholdAppliances(String size, String name, String model, int wattage) {
        super(name, model, wattage);
        this.size = size;
    }
}
