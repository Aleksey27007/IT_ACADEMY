package HomeWork27_12_23OOP.Airline;

public class Airline extends AbstractAirline {
    public Airline(String name) {
        this.setNameAirline(name);
        this.setStaffCapacity(40);
        this.setPilotCapacity(10);
        this.setPassengerCapacity(200);
    }
}
