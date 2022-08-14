package be.pxl.h2.constructorTester;

public class Auto {
    public final static int AANTAL_WIELEN = 4;
    private String merk;
    private String kleur;
    private int kilometerstand;
    private int aantalDeuren;

    public Auto(String merk, String kleur, int aantalDeuren) {
//        this.merk = merk;
//        this.kleur = kleur;
//        this.aantalDeuren = aantalDeuren;
        this(merk, kleur, aantalDeuren, 0);
    }

    public Auto(String merk, String kleur, int aantalDeuren, int kilometerstand) {
        setMerk(merk);
        setKleur(kleur);
        setAantalDeuren(aantalDeuren);
        setKilometerstand(kilometerstand);

        if (kilometerstand < 0) {
            this.kilometerstand = - kilometerstand;
        } else {
            this.kilometerstand = kilometerstand;
        }
    }

    public Auto(Auto basisAuto){
        this(basisAuto.merk, basisAuto.kleur, basisAuto.aantalDeuren, basisAuto.kilometerstand);
    }

    public Auto() {}

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

    public int getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(int aantalDeuren) {
        this.aantalDeuren = aantalDeuren;
    }
}
