package be.pxl.throwAway.figuren;

public class Cirkel extends GrafischElement{
    private double straal;

    public Cirkel(int x, int y, double straal) {
        super(x, y);
        setStraal(straal);
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }

    public double getOppervlakte() {
        return Math.PI * (straal * straal);
    }

    public double getOmtrek() {
        return Math.PI * (straal * 2);
    }
}
