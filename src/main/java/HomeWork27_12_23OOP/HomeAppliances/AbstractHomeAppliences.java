package HomeWork27_12_23OOP.HomeAppliances;

public abstract class AbstractHomeAppliences {

    private String name;
    private String model;
    private int wattage;

    public AbstractHomeAppliences(String name, String model, int wattage) {
        this.name = name;
        this.model = model;
        this.wattage = wattage;
    }

    public abstract void turnOn();

    public void turnOff() {
        System.out.println("Turned off!");
    }

    public void info() {
        System.out.printf("Name: %s Model: %s Wattage: %d\n", name, model, wattage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }
}
