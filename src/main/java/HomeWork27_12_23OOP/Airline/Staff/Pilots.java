package HomeWork27_12_23OOP.Airline.Staff;

import HomeWork27_12_23OOP.Airline.Airline;

public class Pilots extends Human {
    private int pilotCapacity;
    private String position;

    public Pilots(String position, Airline pilotCapacity) {
        this.pilotCapacity = getPilotCapacity(pilotCapacity);
        this.position = position;
    }

    public void info() {
        System.out.printf("Pilot capacity: %d Position: %s\n", this.pilotCapacity, this.position);
    }
}
