package HomeWork27_12_23OOP.Airline;

public abstract class AbstractAirline implements BaseClass{

    private int passengerCapacity;
    private int staffCapacity;
    private String nameAirline;
    private int pilotCapacity;

    public void info(){
        System.out.printf("Name Airline: %s Staff capacity: %d Pilot capacity %d Passenger capacity: %d\n",
                this.nameAirline, this.staffCapacity, this.pilotCapacity, this.passengerCapacity);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        if (passengerCapacity < 0) System.out.println("Can't be zero.");
        else this.passengerCapacity = passengerCapacity;
    }

    public int getStaffCapacity() {
        return staffCapacity;
    }

    public void setStaffCapacity(int staffCapacity) {
        if (staffCapacity < 0) System.out.println("Can't be zero.");
        else this.staffCapacity = staffCapacity;
    }

    public String getNameAirline() {
        return nameAirline;
    }

    public void setNameAirline(String nameAirline) {
        if (nameAirline.equals("")) System.out.println("Can't be null.");
        else this.nameAirline = nameAirline;
    }

    public int getPilotCapacity() {
        return pilotCapacity;
    }

    public void setPilotCapacity(int pilotCapacity) {
        if (pilotCapacity < 0) System.out.println("Can't be zero.");
        else this.pilotCapacity = pilotCapacity;
    }
}
