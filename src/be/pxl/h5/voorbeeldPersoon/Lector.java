package be.pxl.h5.voorbeeldPersoon;

public class Lector extends Persoon{
    private String personeelsnummer;
    private double aanstellingspercentage;
    private double salaris;
    private static int aantal;

    public Lector() {
        this("onbekend", "onbekend", "20999999", 100, 2000);
    }

    public Lector(String naam, String voornaam, double aanstellingspercentage, double salaris) {
        this(naam, voornaam, "20999999", aanstellingspercentage, salaris);
    }

    public Lector(String naam, String voornaam, String personeelsnummer, double aanstellingspercentage, double salaris) {
        super(naam, voornaam);
        setPersoneelsnummer(personeelsnummer);
        setAanstellingspercentage(aanstellingspercentage);
        setSalaris(salaris);
        aantal++;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Personeelsnummer: " + personeelsnummer);
        System.out.println("Aanstellingspercentage: " + aanstellingspercentage);
        System.out.println("Salaris: " + salaris);
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
        this.aanstellingspercentage = aanstellingspercentage;

        if (aanstellingspercentage > 100) {
            this.aanstellingspercentage = 100;
        } else if (aanstellingspercentage < 0) {
            this.aanstellingspercentage = 0;
        }
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

    public static int getAantal() {
        return aantal;
    }
}
