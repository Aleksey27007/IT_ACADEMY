package HomeWork27_12_23OOP.Airline;

import HomeWork27_12_23OOP.Airline.Aircraft.Aircraft;
import HomeWork27_12_23OOP.Airline.Aircraft.Airplane;
import HomeWork27_12_23OOP.Airline.Aircraft.Helicopter;
import HomeWork27_12_23OOP.Airline.Staff.Director;
import HomeWork27_12_23OOP.Airline.Staff.MaintenanceStaff;
import HomeWork27_12_23OOP.Airline.Staff.Pilots;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Авиакомпания. Определить иерархию самолетов, вертолетов, квадрокоптеров и т.д. Создать
        //авиакомпанию. Посчитать общую вместимость и грузоподъемность. Провести сортировку
        //летных средств компании по дальности полета. Найти самолет в компании, соответствующий
        //заданному диапазону параметров.

        Airline airline = new Airline("SHIP AHEAD");
        Director director = new Director("Aleksey", 27, "Director");
        MaintenanceStaff maintenanceStaff = new MaintenanceStaff(airline, "Maintenance Staff");
        Pilots pilots = new Pilots("Pilot", airline);

        Airplane airplaneTY134 = new Airplane("TY - 134", 850, 2800, 98);
        Airplane airplaneTY154 = new Airplane("TY - 154", 950, 3000, 158);
        Helicopter helicopterMI8P = new Helicopter("MI - 8P", 225, 480, 28);
        Helicopter helicopterMI14GP = new Helicopter("MI - 14GP", 210, 1200, 24);

        airline.info();
        director.info();
        maintenanceStaff.info();
        pilots.info();
        airplaneTY134.info();
        airplaneTY154.info();
        helicopterMI8P.info();
        helicopterMI14GP.info();

        // Общее количество пассажиров
        int numberOfPassengers = airplaneTY134.getMaxPassengers() + airplaneTY154.getMaxPassengers() +
                helicopterMI8P.getMaxPassengers() + helicopterMI14GP.getMaxPassengers();
        System.out.println("Number of passengers: " + numberOfPassengers);

        //Сортировка по дальности полёта
        sortByFlightRange(airplaneTY134, airplaneTY154, helicopterMI8P, helicopterMI14GP);
    }

    public static void sortByFlightRange(Aircraft... aircrafts){
        Arrays.sort(aircrafts, new Comparator<Aircraft>() {
            @Override
            public int compare(Aircraft o1, Aircraft o2) {
                if (o1.getMaxFlightRange() < o2.getMaxFlightRange()) return -1;
                else if (o1.getMaxFlightRange() == o2.getMaxFlightRange()) return 0;
                else return 1;
            }
        });

        for (Aircraft aircraft : aircrafts) {
            aircraft.info();
        }
    }
}
