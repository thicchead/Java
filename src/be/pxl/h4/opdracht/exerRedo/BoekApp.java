package be.pxl.h4.opdracht.exerRedo;

public class BoekApp {
    public static void main(String[] args) {
        Boek boek = new Boek();

        System.out.println(boek.toonBoekgegevens());
        System.out.println(boek.toString());

        Auteur dila = new Auteur("Dila Ayse", "Karakoruk");

        Boek dilasBoek = new Boek("1234", "Ik stink", 50000, dila);

        System.out.println(dilasBoek.toonBoekgegevens());


    }
}
