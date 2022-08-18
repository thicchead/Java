package be.pxl.h5.opdracht8;

import java.util.Objects;

public class Cirkel extends GrafischElement{
    private double straal;

    public Cirkel(double straal) {
        this(0, 0, straal);
    }

    public Cirkel(int x, int y, double straal) {
        super(x, y);
        setStraal(straal);
    }

    @Override
    public double getOmtrek() {
        return Math.PI * (straal * 2);
    }

    @Override
    public double getOppervlakte() {
        return Math.PI * straal * straal;
    }

    @Override
    public String toString() {
        return "Cirkel{" +
                "straal=" + straal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cirkel cirkel = (Cirkel) o;
        return Double.compare(cirkel.straal, straal) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(straal);
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }
}
