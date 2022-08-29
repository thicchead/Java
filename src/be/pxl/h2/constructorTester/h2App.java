package be.pxl.h2.constructorTester;

public class h2App {
    public static void main(String[] args) {
        System.out.println(h2.MAX_STUDENTEN);

        h2 klas1 = new h2();
        h2 klas2 = new h2("1TINe", 25);
        h2 klas3 = new h2("1TINa", 50);

        h2[] klassen = new h2[]{klas1, klas2, klas3};

        for (h2 klas : klassen) {
            System.out.println(klas.getNaam());
            System.out.println(klas.getStudenten());
        }

        System.out.println(h2.getAantalStudenten());
        System.out.println(h2.getAantalKlassen());
    }
}
