package be.pxl.h2.opdracht3;

import be.pxl.h2.constructorTester.Auto;

public class Klasgroep {
    public final static int MAX_STUDENTEN = 40;
    private static int aantalKlassen;
    private static int aantalStudenten;
    private static double gemiddeldeStudenten;
    private String naam;
    private int studenten;

    public Klasgroep() {
        this("1TINx", 0);
    }

    public Klasgroep(String naam, int studenten) {
        setNaam(naam);
        setStudenten(studenten);
        aantalKlassen++;
        aantalStudenten += studenten;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getStudenten() {
        return studenten;
    }

    public void setStudenten(int studenten) {
        this.studenten = studenten;

        if (studenten > MAX_STUDENTEN) {
            this.studenten = 40;
        }
    }

    public static int getAantalKlassen() {
        return aantalKlassen;
    }

    public static void setAantalKlassen(int aantalKlassen) {
        Klasgroep.aantalKlassen = aantalKlassen;
    }

    public static int getAantalStudenten() {
        return aantalStudenten;
    }

    public static void setAantalStudenten(int aantalStudenten) {
        Klasgroep.aantalStudenten = aantalStudenten;
    }

    public static double getGemiddeldeStudenten() {
        gemiddeldeStudenten = (double) aantalStudenten / aantalKlassen;
        return gemiddeldeStudenten;
    }

    public static void setGemiddeldeStudenten(double gemiddeldeStudenten) {

        Klasgroep.gemiddeldeStudenten = gemiddeldeStudenten;
    }
}
