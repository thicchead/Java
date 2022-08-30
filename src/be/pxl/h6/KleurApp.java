package be.pxl.h6;

public class KleurApp {
    public static void main(String[] args) {
        Kleur kleur = Kleur.ROOD;

        printKleur(kleur);
    }
    private static void printKleur(Kleur kleur) {
        System.out.println(kleur.name());
        System.out.println(kleur.ordinal());
        System.out.println(kleur);
        String text = "";

        if (kleur == Kleur.ROOD) {
            text += "Rood";
        } else if (kleur == Kleur.ZWART) {
            text += "Zwart";
        } else if (kleur == Kleur.WIT) {
            text += "Wit";
        } else {
            text += "idc";
        }
        System.out.println(text);
    }
}
