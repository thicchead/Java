package be.pxl.throwAway.figuren;

public class FigurenApp {
    public static void main(String[] args) {
        Cirkel cirkel = new Cirkel(5, 5, 10);

        System.out.println(cirkel.getOmtrek());
        System.out.println(cirkel.getOppervlakte());

        System.out.println(GrafischElement.getAantal());
    }
}
