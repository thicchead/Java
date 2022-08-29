package be.pxl.throwAway.h5;

public class Student extends Persoon{
    private int leerkrediet;
    private String studentnummer;
    private String opleiding;

    public Student(String naam, String voornaam, int leerkrediet, String studentnummer, String opleiding) {
        super(naam, voornaam);
        setLeerkrediet(leerkrediet);
        setStudentnummer(studentnummer);
        setOpleiding(opleiding);
    }

    public Student(Student origineleStudent) {
        this(origineleStudent.getNaam(), origineleStudent.getVoornaam(), origineleStudent.getLeerkrediet(), origineleStudent.getStudentnummer(), origineleStudent.getOpleiding());
    }

    public Student(String naam, String voornaam) {
        this(naam, voornaam, 140, "15999999", "XXX");
    }

    public Student() {
        this("onbekend", "onbekend", 140, "15999999", "XXX");
    }

    public int getLeerkrediet() {
        return leerkrediet;
    }

    public void setLeerkrediet(int leerkrediet) {
        if (leerkrediet > 140) {
            leerkrediet = 140;
        } else if (leerkrediet < 0) {
            leerkrediet = 0;
        }
        this.leerkrediet = leerkrediet;
    }

    public String getStudentnummer() {
        return studentnummer;
    }

    public void setStudentnummer(String studentnummer) {
        this.studentnummer = studentnummer;
    }

    public String getOpleiding() {
        return opleiding;
    }

    public void setOpleiding(String opleiding) {
        this.opleiding = opleiding;
    }

    public void wijzigLeerkrediet(int getal) {
        setLeerkrediet(this.leerkrediet + getal);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Leerkrediet: " + this.leerkrediet + "\n"
                + "Studentennummer: " + this.studentnummer + "\n"
                + "Opleiding: " + this.opleiding);
    }
}
