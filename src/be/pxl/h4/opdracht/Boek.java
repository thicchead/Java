package be.pxl.h4.opdracht;

public class Boek {
    private String isbn;
    private String titel;
    private int bladzijden;
    private Auteur auteur;

    public Boek() {
        this("geen", "geen", 0, new Auteur("onbekend", "onbekend"));
    }

    public Boek(String isbn, String titel, int bladzijden, Auteur auteur) {
        setIsbn(isbn);
        setTitel(titel);
        setBladzijden(bladzijden);
        setAuteur(auteur);
    }

    public void toonBoekGegevens() {
        String boekGegevens = String.format("Het boek %s met %d bladzijden, is geschreven door %s, en heeft als isbn %s.", this.titel, this.bladzijden, this
                .auteur, this.isbn);

        System.out.println(boekGegevens);
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
