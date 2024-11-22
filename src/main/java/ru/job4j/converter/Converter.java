package ru.job4j.converter;

public class Converter {

    public static float rubleToDollar(float value) {
        return value / 100;
    }

    public static float rubleToEuro(float value) {
        return value / 105;
    }

    public static void main(String[] args) {
        float dollar = Converter.rubleToDollar(140);
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}