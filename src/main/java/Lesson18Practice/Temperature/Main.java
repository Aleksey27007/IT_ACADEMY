package Lesson18Practice.Temperature;

public class Main {
    public static void main(String[] args) {
        // 11. Разработайте программу для конвертации температуры из Цельсия в Фаренгейт и наоборот.
        Temperature temperatureInC = new Temperature(25.1, TemperatureType.C);

        Temperature converted = convert(temperatureInC, TemperatureType.F);
        System.out.println(converted);
    }

    private static Temperature convert(Temperature from, TemperatureType to) {
        Temperature convertedTemperature = new Temperature();
        convertedTemperature.setType(to);

        if (from.getType() == to) {
            convertedTemperature.setType(to);
        }

        if (from.getType() == TemperatureType.F && to == TemperatureType.C) {
            System.out.println("sagasasasdas....");
        }

        if (from.getType() == TemperatureType.C && to == TemperatureType.F) {
            convertedTemperature.setValue((from.getValue() * 9/5) + 32);
        }

        return convertedTemperature;
    }
}
