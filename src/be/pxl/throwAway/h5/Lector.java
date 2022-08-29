package be.pxl.throwAway.h5;

public class Lector extends Persoon{
    private String personeelsnummer;
    private double aanstellingspercentage;
    private double salaris;

    public Lector(String naam, String voornaam, String personeelsnummer, double aanstellingspercentage, double salaris) {
        super(naam, voornaam);
        setPersoneelsnummer(personeelsnummer);
        setAanstellingspercentage(aanstellingspercentage);
        setSalaris(salaris);
    }

    public Lector(String naam, String voornaam, double aanstellingspercentage, double salaris) {
        this(naam, voornaam, "20009999", aanstellingspercentage, salaris);
    }

    public Lector() {
        this("onbekend", "onbekend", "20009999", 100, 2000);
    }

    public String getPersoneelsnummer() {
        return personeelsnummer;
    }

    public void setPersoneelsnummer(String personeelsnummer) {
        this.personeelsnummer = personeelsnummer;
    }

    public double getAanstellingspercentage() {
        return aanstellingspercentage;
    }

    public void setAanstellingspercentage(double aanstellingspercentage) {
        if (aanstellingspercentage > 100) {
            aanstellingspercentage = 100;
        } else if (aanstellingspercentage < 0) {
            aanstellingspercentage = 0;
        }
        this.aanstellingspercentage = aanstellingspercentage;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Personeelsnummer: " + this.personeelsnummer + "\n"
                + "Aanstellingspercentage: " + this.aanstellingspercentage + "\n"
                + "Salaris: " + this.salaris);
    }
}
