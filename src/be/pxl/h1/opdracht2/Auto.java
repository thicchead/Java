package be.pxl.h1.opdracht2;

public class Auto {
    private String merk;
    private String kleur;
    private int aantalDeuren;
    private int kilometerstand;
    private boolean automaat;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(int aantalDeuren) {
        this.aantalDeuren = aantalDeuren;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public boolean isAutomaat() {
        return automaat;
    }

    public void setAutomaat(boolean automaat) {
        this.automaat = automaat;
    }

    public int getPrijs() {
        int prijs = 20000;

        if (aantalDeuren == 3) {
            prijs -= 500;
        } else if (aantalDeuren == 5) {
            prijs += 2000;
        }

        if (automaat == true) {
            prijs += 2000;
        } else {
            prijs *= 0.98;
        }
        return prijs;
    }


}
