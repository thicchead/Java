package be.pxl.h1.opdracht2;

public class AutoApp {
    public static void main(String[] args) {
        Auto favorieteAuto = new Auto();


        favorieteAuto.setMerk("Audi");
        favorieteAuto.setKleur("Donkergrijs");
        favorieteAuto.setAantalDeuren(5);
        favorieteAuto.setKilometerstand(0);
        favorieteAuto.setAutomaat(false);


        System.out.println("Mijn favoriete auto is een " + favorieteAuto.getMerk() + " die " + favorieteAuto.getKleur() + " is. Ook is ze " + favorieteAuto.getAantalDeuren() + "-deurs.");
        System.out.println("Ze is ook nieuw dus er staat " + favorieteAuto.getKilometerstand() + " op de kilometerteller.");

        System.out.println("Prijs = " + favorieteAuto.getPrijs());
    }
}
