package be.pxl.o1.oefening5;

public class Spaceship {
    private String name;
    private int hits;
    private boolean shieldOn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public boolean isShieldOn() {
        return shieldOn;
    }

    public void setShieldOn(boolean shieldOn) {
        if (shieldOn) {
            System.out.println(this.name + " sets shield on");
        }
        this.shieldOn = shieldOn;
    }

    public void fire(Spaceship other) {
        if (!other.shieldOn) {
            System.out.println(this.name + " fires at " + other.name);
            other.hits += 1;
        } else {
            System.out.println(other.name + " has its shield on!");
            this.hits += 1;
        }
    }

    public void isDestroyed() {
        if (this.hits >= 5) {
            System.out.println("This ship is destroyed!");
        } else {
            System.out.println("You continue to see another day");
        }
    }
}
