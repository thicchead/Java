package be.pxl.throwAway;

public class ConstructorTests {
    private String voornaam;
    private String naam;
    private int leeftijd;

    public ConstructorTests(String voornaam, String naam, int leeftijd) {
        setVoornaam(voornaam);
        setNaam(naam);
        setLeeftijd(leeftijd);
    }

    public ConstructorTests(String voornaam, String naam) {
        this(voornaam, naam, 18);
    }

    public ConstructorTests(){}

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String readEverything() {
        String answer = String.format("Voornaam: " + this.voornaam + "\n" + "Achternaam: " + this.naam + "\n" + "Leeftijd: " + this.leeftijd);

        return answer;
    }
}
