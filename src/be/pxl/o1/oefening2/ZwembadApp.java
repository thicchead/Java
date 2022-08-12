package be.pxl.o1.oefening2;

import java.util.Scanner;

public class ZwembadApp {
    public static void main(String[] args) {
        Zwembad zwembad = new Zwembad();

        Scanner input = new Scanner(System.in);

        System.out.println("Breedte = ");
        double breedte = input.nextDouble();
        zwembad.setBreedte(breedte);

        System.out.println("Lengte = ");
        double lengte = input.nextDouble();
        zwembad.setLengte(lengte);

        System.out.println("Diepte = ");
        double diepte = input.nextDouble();
        zwembad.setDiepte(diepte);

        System.out.println(zwembad.getVolumeWater());
        System.out.println(zwembad.getVolumeOntsmettingsmiddel());

        System.out.println(zwembad.getVolume());
    }
}
