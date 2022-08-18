package be.pxl.h5.opdracht8;

public abstract class GrafischElement {
    private int x;
    private int y;
    private static int aantal;

    public GrafischElement(int x, int y) {
        this.x = x;
        this.y = y;
        aantal++;
    }

    public void setPositie(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getOppervlakte();
    public abstract double getOmtrek();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAantal() {return aantal;}
}
