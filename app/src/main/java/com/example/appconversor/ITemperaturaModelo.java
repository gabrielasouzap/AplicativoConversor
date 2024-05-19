package com.example.appconversor;

public interface ITemperaturaModelo {
    void setCelsius(double temperatura);
    void setFahrenheit(double temperatura);
    void setKelvin(double temperatura);
    double getCelsius();
    double getFahrenheit();
    double getKelvin();

    class Companion {
        public static final String TO_CELSIUS = "to Celsius";
        public static final String TO_FAHRENHEIT = "to Fahrenheit";
        public static final String TO_KELVIN = "to Kelvin";
    }


}