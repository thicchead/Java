package be.pxl.h4.opdracht.exerRedo;

public class Auteur {
    private String voornaam;
    private String naam;

    public Auteur() {
        this("onbekend", "onbekend");
    }

    public Auteur(String voornaam, String naam) {
        setVoornaam(voornaam);
        setNaam(naam);
    }

    public String toString() {
        String info = String.format("Auteur: %s %s", this.voornaam, this.naam);
        return info;
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
}
