package be.pxl.o1.oefening5;

public class SpaceshipApp {
    public static void main(String[] args) {
        Spaceship space = new Spaceship();
        Spaceship ship = new Spaceship();

        space.setName("BS Galactica");
        ship.setName("STS Shade");

        space.fire(ship);
        ship.fire(space);

        space.setShieldOn(true);
        ship.fire(space);

        space.fire(ship);
        space.fire(ship);
        space.fire(ship);
        space.fire(ship);
        space.fire(ship);

        space.isDestroyed();
        ship.isDestroyed();
    }
}
