package be.pxl.h2.opdracht3;

public class KlasgroepApp {
    public static void main(String[] args) {

        System.out.println(Klasgroep.MAX_STUDENTEN);

        Klasgroep groep1 = new Klasgroep("1TINa", 20);
        Klasgroep groep2 = new Klasgroep("1TINb", 30);
        Klasgroep groep3 = new Klasgroep("1TINc", 50);

//        System.out.println(groep3.getStudenten());

        Klasgroep[] klassen = {groep1, groep2, groep3};

        for (Klasgroep klas : klassen) {
            System.out.println(klas.getNaam());
            System.out.println(klas.getStudenten());
        }

        System.out.println(Klasgroep.getAantalKlassen());
        System.out.println(Klasgroep.getAantalStudenten());

        String antwoord = String.format("Gemiddelde studenten = %.1f", Klasgroep.getGemiddeldeStudenten());
        System.out.println(antwoord);
    }
}
