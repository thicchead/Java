package be.pxl.h1.opdracht5;

public class StripboekApp {
    public static void main(String[] args) {
        Stripboek stripboek = new Stripboek();

        stripboek.setReeks("Kuifje");
        stripboek.setTitel("Kuifje in Parijs");
        stripboek.setAlbum(95);
        stripboek.setAuteur("Metehan Karakoruk");

        System.out.println(stripboek.getReeks());
        System.out.println(stripboek.getTitel());
        System.out.println(stripboek.getAlbum());
        System.out.println(stripboek.getAuteur());

    }
}
