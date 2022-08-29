package be.pxl.h2.constructorTester;

public class h2 {
    public static final int MAX_STUDENTEN = 40;
    private static int aantalKlassen;
    private static int aantalStudenten;
    private String naam;
    private int studenten;

    public h2(String naam, int studenten) {
        setNaam(naam);
        setStudenten(studenten);
        aantalKlassen++;
    }

    public h2(){
        this("1TINX", 0);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getStudenten() {
        return studenten;
    }

    public void setStudenten(int studenten) {
        if (studenten > MAX_STUDENTEN) {
            this.studenten = MAX_STUDENTEN;
        } else {
            this.studenten = studenten;
        }
        aantalStudenten += this.studenten;
    }

    public static int getAantalKlassen() {
        return aantalKlassen;
    }

    public static void setAantalKlassen(int aantalKlassen) {
        h2.aantalKlassen = aantalKlassen;
    }

    public static int getAantalStudenten() {
        return aantalStudenten;
    }

    public static void setAantalStudenten(int aantalStudenten) {
        h2.aantalStudenten = aantalStudenten;
    }
}
