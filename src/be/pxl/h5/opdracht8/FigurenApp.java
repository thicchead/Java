package be.pxl.h5.opdracht8;

public class FigurenApp {
    public static void main(String[] args) {
////        System.out.println("Waarschijnlijk klopt het");
//
//        Cirkel cirkel = new Cirkel(5, 5, 2.5);
//
////        System.out.println(cirkel instanceof Object);
//
//        System.out.println(cirkel.toString());
//        System.out.println(cirkel);
//
//        Cirkel cirkel1 = new Cirkel(5, 5, 2.5);
//
//        System.out.println(cirkel.equals(cirkel1));

        GrafischElement[] figuren = new GrafischElement[5];
        figuren[0] = new Vierkant(5);
        figuren[1] = new Cirkel(8);
        figuren[2] = new Rechthoek(6, 9);
        figuren[3] = new Rechthoek(8, 2);
        figuren[4] = new Driehoek(4, 5, 10, 20, 3);

        for (GrafischElement figuur : figuren) {
            System.out.printf("Omtrek: %10.0f Oppervlakte: %10.0f %S %n", figuur.getOmtrek(), figuur.getOppervlakte(), figuur.getClass());
        }
    }
}
