package HomeWork27_12_23OOP.Airline.Staff;

import HomeWork27_12_23OOP.Airline.Airline;
import HomeWork27_12_23OOP.Airline.BaseClass;

public abstract class Human implements BaseClass {
    private String name;
    private int age;
    private String position;
    private int staffCapacity;
    private int pilotCapacity;

    @Override
    public void info() {
        System.out.printf("Name: %s Age: %d Position: %s\n", this.name, this.age, this.position);
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int age) {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition(String position) {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getStaffCapacity(Airline stafcap) {
        return stafcap.getStaffCapacity();
    }

    public void setStaffCapacity(int staffCapacity) {
        this.staffCapacity = staffCapacity;
    }

    public int getPilotCapacity(Airline pilotcap) {
        return pilotcap.getPilotCapacity();
    }

    public void setPilotCapacity(int pilotCapacity) {
        this.pilotCapacity = pilotCapacity;
    }
}
