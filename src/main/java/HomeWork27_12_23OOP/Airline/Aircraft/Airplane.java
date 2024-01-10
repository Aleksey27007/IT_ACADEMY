package HomeWork27_12_23OOP.Airline.Aircraft;

public class Airplane extends Aircraft {
    public Airplane(String name, int speed, int maxFlightRange, int maxPassengers) {
        this.setNameAircraft(name);
        this.setSpeedAircraft(speed);
        this.setMaxFlightRange(maxFlightRange);
        this.setMaxPassengers(maxPassengers);
    }
}
