package HomeWork27_12_23OOP.Airline;

import HomeWork27_12_23OOP.Airline.Staff.Human;

public class Passengers extends Human {
    private int passengersCapacity;

    public Passengers(String position, int passengersCapacity) {
        this.setPosition(position);
        this.setPassengersCapacity(passengersCapacity);
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }
}
