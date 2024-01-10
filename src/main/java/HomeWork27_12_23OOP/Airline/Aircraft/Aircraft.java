package HomeWork27_12_23OOP.Airline.Aircraft;

import HomeWork27_12_23OOP.Airline.BaseClass;

public abstract class Aircraft implements BaseClass {
    private int maxFlightRange;
    private int speedAircraft;
    private String nameAircraft;
    private int maxPassengers;
    private String type;

    public void info(){
        System.out.printf("Name airplane %s Speed airplane %d km/h Maximum flight range %d kilometers Maximum passengers %d Type: %s\n",
                this.nameAircraft, this.speedAircraft, this.maxFlightRange, this.maxPassengers, getType());
    }

    public int getMaxFlightRange() {
        return maxFlightRange;
    }

    public void setMaxFlightRange(int maxFlightRange) {
        this.maxFlightRange = maxFlightRange;
    }

    public int getSpeedAircraft() {
        return speedAircraft;
    }

    public void setSpeedAircraft(int speedAircraft) {
        this.speedAircraft = speedAircraft;
    }

    public String getNameAircraft() {
        return nameAircraft;
    }

    public void setNameAircraft(String nameAircraft) {
        this.nameAircraft = nameAircraft;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getType() {
        return getClass().getSimpleName();
    }
}
