package HomeWork21_02_24.SOLID.planets;

import java.util.Random;

public class Earth implements Planet {

    private static Earth earth;
    private static int men;
    private static int women;
    private Random random = new Random();

    private Earth() {
    }

    public static Earth getEarth() {
        if (earth == null) {
            earth = new Earth();
        }
        return earth;
    }

    /**
     Уничтожение планеты
     **/
    @Override
    public void destroyThePlanet() {
        if (earth != null) {
            earth = null;
            setMen(0);
            setWomen(0);
            System.out.println("The planet is destroyed.");
        } else {
            System.out.println("The planet has not been created yet.");
        }
    }

    /**
     Уничтожение людей
     **/
    @Override
    public void destroyPeople() {
        if (men > 0 || women > 0) {
            setMen(0);
            setWomen(0);
            System.out.println("People are destroyed.");
        } else {
            System.out.println("There are no living beings on the planet.");
        }
    }

    /**
     Заселение планеты
     **/
    @Override
    public void populateWithPeople() {
        if (men == 0 && women == 0) {
            setMen(random.nextInt(1000) + 1);
            setWomen(random.nextInt(2000) + 1000);
        } else {
            System.out.println("The planet is already inhabited.");
        }
        System.out.printf("There are %d men and %d women on the planet.\n", getMen(), getWomen());
    }

    @Override
    public void getPlanetInfo() {
        if (earth != null) {
            System.out.println("Name: " + Earth.class.getSimpleName() + "\n" +
                    "People: " + (getMen() + getWomen()) + "\n" +
                    "Men: " + getMen() + "\n" +
                    "Women: " + getWomen());
        } else {
            System.out.println("The planet has not yet been created or has been destroyed.");
        }

    }

    public static int getMen() {
        return men;
    }

    public static void setMen(int men) {
        Earth.men = men;
    }

    public static int getWomen() {
        return women;
    }

    public static void setWomen(int women) {
        Earth.women = women;
    }
}
