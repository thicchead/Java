package be.pxl.h1.opdracht7;

public class PlanetApp {
    public static void main(String[] args) {
        Planet planetOne = new Planet();
        Planet planetTwo = new Planet();

        planetOne.setName("Jupiter");
        planetTwo.setName("Saturn");

        planetOne.setDiameter(142984);
        planetTwo.setDiameter(120536);

        planetOne.setDistanceFromSun(778600000);
        planetTwo.setDistanceFromSun(1433500000);

        if (planetOne.getDistanceFromSun() < planetTwo.getDistanceFromSun()) {
            System.out.println("Planet one is the closest (" + planetOne.getName() + ")");
        } else {
            System.out.println("Planet two is the closest (" + planetTwo.getName() + ")");
        }

        System.out.println(planetOne.getDistanceFromSun() / 150000000);

    }
}
