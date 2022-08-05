package be.pxl.h1.opdracht9;

public class ThermometerApp {
    public static void main(String[] args) {
        Thermometer thermoOne = new Thermometer();

        thermoOne.setTemperature(25);

        System.out.println(thermoOne.getFahrenheit());

    }
}
