package be.pxl.throwAway.AssociatiesTest;

public class Boek {
    private String isbn;
    private String titel;
    private int bladzijden;
    private Auteur auteur;

    public Boek(String isbn, String titel, int bladzijden, Auteur auteur) {
        setIsbn(isbn);
        setTitel(titel);
        setBladzijden(bladzijden);
        setAuteur(auteur);
    }

    public Boek() {
        this("isbn", "xxx", 0, new Auteur("onbekend", "onbekend"));
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

    public String toonBoekGegevens() {
        String antwoord = String.format("Isbn: " + this.isbn + "\n" + "Titel: " + this.titel + "\n" +
                "Bladzijden: " + this.bladzijden + "\n" + "Auteur: " + this.auteur);

        return antwoord;
    }
}
