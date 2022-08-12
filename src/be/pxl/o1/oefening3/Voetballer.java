package be.pxl.o1.oefening3;

public class Voetballer {
    private String naam;
    private int leeftijd;
    private double beoordelingscijfer;
    private String type;
    private int doelpunten;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public double getBeoordelingscijfer() {
        return beoordelingscijfer;
    }

    public void setBeoordelingscijfer(double beoordelingscijfer) {
        this.beoordelingscijfer = beoordelingscijfer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoelpunten() {
        return doelpunten;
    }

    public void setDoelpunten(int doelpunten) {
        this.doelpunten = doelpunten;
    }

    public double berekenPrijs() {
        double prijs = 0;

        if (this.type.equals("Aanvaller")) {
            prijs = 30000;
        }
        else if (this.type.equals("Middenvelder")) {
            prijs = 28000;
        }
        else if (this.type.equals("Verdediger")) {
            prijs = 29000;
        }
        else {
            prijs = 25000;
        }

        if (leeftijd < 25) {
            prijs *= 1.10;
        }
        else if (leeftijd < 30) {
            prijs *= 1;
        } else {
            prijs *= 0.95;
        }

        if (this.type.equals("Aanvaller")) {
            if (this.doelpunten <= 5) {
                prijs += this.doelpunten * 10000;
            } else {
                prijs += 50000 + (this.doelpunten - 5) * 20000;
            }
        }
        else if (this.type.equals("Doelman")) {
            if (this.doelpunten > 20) {
                prijs -= 9000;
                prijs += this.beoordelingscijfer * 10000;
            }
        } else {
            prijs += this.beoordelingscijfer * 10000;
        }

        return prijs;
    }
}
