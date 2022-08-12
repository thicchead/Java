package be.pxl.h1.opdracht9;

public class ThermometerApp {
    public static void main(String[] args) {
        Thermometer thermoOne = new Thermometer();

        thermoOne.setTemperature(25);

//        System.out.println(thermoOne.getFahrenheit());

        Thermometer thermometer = new Thermometer();

//        System.out.println("Celsius");
//        for (int temp = -10; temp < 26; temp += 5) {
//            System.out.println(temp);
//        }

        for (double temp = -10; temp < 26; temp += 5) {
            thermometer.setTemperature(temp);
            String print = String.format("|%10.2f| |%10.2f|", thermometer.getTemperature(), thermometer.getFahrenheit());
            System.out.println(print);
        }


    }
}
