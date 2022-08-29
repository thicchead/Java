package be.pxl.throwAway.AssociatiesTest;

public class Auteur {
    private String naam;
    private String voornaam;

    public Auteur(String naam, String voornaam) {
        setNaam(naam);
        setVoornaam(voornaam);
    }

    public Auteur() {
        this("onbekend", "onbekend");
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

    public String toString() {
        String antwoord = String.format("Auteur: " + this.voornaam + " " + this.naam);

        return antwoord;
    }
}
