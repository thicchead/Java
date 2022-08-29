package be.pxl.throwAway.h5;

public class Persoon {
    private static int aantal;
    private String naam;
    private String voornaam;

    public Persoon(String naam, String voornaam) {
        setNaam(naam);
        setVoornaam(voornaam);
        aantal++;
    }

    public Persoon() {
        aantal++;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public static int getAantal() {
        return aantal;
    }

    public static void setAantal(int aantal) {
        Persoon.aantal = aantal;
    }

    public void print() {
        System.out.println("Naam: " + this.naam + "\n"
                + "Voornaam: " + this.voornaam);
    }

}
