package HomeWork21_02_24.SOLID.planets;

import static HomeWork21_02_24.SOLID.planets.Earth.getEarth;

public class TheSolarSistem {
    public static void main(String[] args) {
        Planet earth = getEarth();

        earth.getPlanetInfo();
        earth.populateWithPeople();
        earth.getPlanetInfo();

        earth.destroyPeople();
        earth.getPlanetInfo();

        earth.destroyThePlanet();
        earth.getPlanetInfo();
    }
}
