package be.pxl.o2.oefening2;

public class Bankrekening {
    private String rekeningnummer;
    private String naam;
    private double saldo;
    private double rentepercentage;

    public Bankrekening() {
        this("geen", "onbekend", 0, 1.2);
    }

    public Bankrekening(String rekeningnummer, String naam, double saldo, double rentepercentage) {
        setRekeningnummer(rekeningnummer);
        setNaam(naam);
        setSaldo(saldo);
        setRentepercentage(rentepercentage);

        if (saldo < 0 || rentepercentage < 0) {
            this.saldo = 0;
            this.rentepercentage = 0;
        }
    }

    public void stort(double bedrag) {
        if (valideerRekening()) {
            this.saldo += bedrag;
        }
    }

    public void neemOp(double bedrag) {
        if (valideerRekening()) {
            if (this.saldo < bedrag) {
                System.out.println("U kunt alleen " + this.saldo + " opnemen.");
                this.saldo = 0;
            } else if (this.saldo == 0) {
                System.out.println("U kunt geen geld meer opnemen.");
            } else {
                this.saldo -= bedrag;
            }
        }

    }

    public void doeVerrichting(double bedrag) {
        if (valideerRekening()) {
            if (bedrag > 0) {
                stort(bedrag);
            } else {
                neemOp(bedrag);
            }

            double[] bedragen = {bedrag};

            for (double geld : bedragen) {
                System.out.println(geld);
            }
        }
    }

    public void schrijfRenteBij() {
        if (valideerRekening()) {
            this.saldo += (this.saldo * this.rentepercentage);
        }
    }

    public boolean valideerRekening() {
        if (rekeningnummer != null || naam != null) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        String finalAnswer = String.format("Saldo op spaarrekening %S op naam van %S bedraagt %.2f", rekeningnummer, naam, saldo);
        System.out.println(finalAnswer);
    }

    public String getRekeningnummer() {
        return rekeningnummer;
    }

    public void setRekeningnummer(String rekeningnummer) {
        this.rekeningnummer = rekeningnummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getRentepercentage() {
        return rentepercentage;
    }

    public void setRentepercentage(double rentepercentage) {
        this.rentepercentage = rentepercentage;
    }
}
