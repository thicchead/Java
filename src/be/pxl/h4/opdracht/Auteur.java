package be.pxl.h4.opdracht;

public class Auteur {
    private String naam;
    private String voornaam;

    public Auteur() {
        this("Karakoruk", "Metehan");
    }

    public Auteur(String naam, String voornaam) {
        setNaam(naam);
        setVoornaam(voornaam);
    }

    public String toString() {
        String auteur = "Auteur";
        return String.format("%s:%s %s", auteur, this.voornaam, this.naam);
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
}
