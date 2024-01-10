package HomeWork27_12_23OOP.HomeAppliances;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Определить иерархию домашней техники. Включить некоторые в розетку. Рассчитать
        //потребляемую мощность. Провести сортировку приборов в квартире на основе одного из
        //параметров. Найти кухонный прибор в квартире, соответствующий заданному диапазону
        //параметров.

        Computer computer = new Computer("Windows", "Small", "Computer", "ASUS TUF GAMING FX505", 200);
        Washer washer = new Washer("Big", "Washer", "LG F2V5HS0W", 2500, 7);
        Hairdryer hairdryer = new Hairdryer("Small", "Hairdryer", "ROWENTA", 500, 2000);
        PressureCooker pressureCooker = new PressureCooker("Small", "Pressure cooker", "Midea", 700, 20);
        TV tv = new TV("Big", "TV", "TCL 55P635", 50, 55);
        ElectricCooker electricCooker = new ElectricCooker("Big", "Electric Cooker", "Beko FFSS62010GB", 3000, 4);

//        computer.turnOn();
//        washer.turnOn();
//        hairdryer.turnOn();
//        pressureCooker.turnOn();
//        tv.turnOn();
//        electricCooker.turnOn();

        sortByParameter("wattage", computer, washer, hairdryer, pressureCooker, tv, electricCooker);

    }
    public static void sortByParameter(String parameter, AbstractHomeAppliences... array) {
        if (parameter.equals("name")) {
            Arrays.sort(array, new Comparator<AbstractHomeAppliences>() {
                @Override
                public int compare(AbstractHomeAppliences o1, AbstractHomeAppliences o2) {
                    return o1.toString().compareTo(o2.toString());
                }
            });
        } else if (parameter.equals("wattage")) {
            Arrays.sort(array, new Comparator<AbstractHomeAppliences>() {
                @Override
                public int compare(AbstractHomeAppliences o1, AbstractHomeAppliences o2) {
                    if (o1.getWattage() < o2.getWattage()) return -1;
                    else if (o1.getWattage() == o2.getWattage()) return 0;
                    else return 1;
                }
            });
        }

        for (AbstractHomeAppliences message: array) {
            message.info();
        }
    }
}
