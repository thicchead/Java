package be.pxl.h4.opdracht.exerRedo;

public class Boek {
    private String isbn;
    private String titel;
    private int bladzijden;
    private Auteur auteur;

    public Boek() {
        this("0000", "titelloos", 0, new Auteur("Onbekend", "Onbekend"));
    }

    public Boek(String isbn, String titel, int bladzijden, Auteur auteur) {
        setIsbn(isbn);
        setTitel(titel);
        setBladzijden(bladzijden);
        setAuteur(auteur);
    }

    public String toonBoekgegevens() {
        String boekGegevens = String.format("Het boek %s, geschreven door %s, heeft %d bladzijden en %s als ISBN", this.titel, this.auteur, this.bladzijden, this.isbn);
        return boekGegevens;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getBladzijden() {
        return bladzijden;
    }

    public void setBladzijden(int bladzijden) {
        this.bladzijden = bladzijden;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }
}
