package be.pxl.throwAway.figuren;

public abstract class GrafischElement {
    private static int aantal;
    private int x;
    private int y;

    public GrafischElement(int x, int y) {
        setX(x);
        setY(y);
        aantal++;
    }

    public void setPositie(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int getAantal() {
        return aantal;
    }

    public abstract double getOppervlakte();
    public abstract double getOmtrek();
}
