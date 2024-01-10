package HomeWork27_12_23OOP.Airline.Staff;

import HomeWork27_12_23OOP.Airline.Airline;

public class MaintenanceStaff extends Human {
    private int stafCapacity;
    private String position;

    public MaintenanceStaff(Airline stafcap, String position) {
        this.stafCapacity = getStaffCapacity(stafcap);
        this.position = position;
    }

    @Override
    public void info() {
        System.out.printf("Staff capacity: %d Position: %s\n", this.stafCapacity, this.position);
    }
}
