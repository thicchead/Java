package be.pxl.throwAway.AssociatiesTest;

public class App {
    public static void main(String[] args) {
        Boek boek = new Boek("123", "titel", 50, new Auteur("Metehan", "Karakoruk"));

        System.out.println(boek.getAuteur());
    }
}
