package be.pxl.h1.opdracht2;

public class AutoApp {
    public static void main(String[] args) {
        System.out.println("Dit programma maakt een auto");
        Auto auto = new Auto();

        auto.setKleur("Grijs");
        auto.setMerk("Audi");

        System.out.println("Ik heb een " + auto.getMerk() + " die " + auto.getKleur() + " is.");


        Auto auto_twee = new Auto();

        System.out.println(auto_twee.getKleur());

    }
}
