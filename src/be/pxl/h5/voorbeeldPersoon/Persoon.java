package be.pxl.h5.voorbeeldPersoon;

public class Persoon {
    private String voornaam;
    private String naam;
    private static int aantal;

    public Persoon() {
        this("onbekend", "onbekend");
    }

    public Persoon(String voornaam, String naam) {
        setVoornaam(voornaam);
        setNaam(naam);
        aantal++;
    }

    public void print() {
        System.out.println("Naam: " + naam + " " + voornaam);
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public static int getAantal() {
        return aantal;
    }

}
