package be.pxl.h5.voorbeeldPersoon;

public class Student extends Persoon{
    private int leerkrediet;
    private String studentennummer;
    private String opleiding;
    private static int aantal;

    public Student() {
        this("onbekend", "onbekend", 140, "15999999", "XXX");
    }

    public Student(String naam, String voornaam) {
        this(naam, voornaam, 140, "15999999", "XXX");
    }

    public Student(Student originalStudent) {
        this(originalStudent.getNaam(), originalStudent.getVoornaam(), originalStudent.leerkrediet, originalStudent.studentennummer, originalStudent.opleiding);
    }

    public Student(String naam, String voornaam, int leerkrediet, String studentennummer, String opleiding) {
        super(naam, voornaam);
        setLeerkrediet(leerkrediet);
        setStudentennummer(studentennummer);
        setOpleiding(opleiding);
        aantal++;
    }

    public void wijzigLeerkrediet(int getal) {
        if (getal > 0) {
            this.leerkrediet += getal;
        } else if (getal < 0) {
            this.leerkrediet += getal;
        }
        if (leerkrediet > 140) {
            this.leerkrediet = 140;
        } else if (leerkrediet < 0) {
            this.leerkrediet = 0;
        }
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Studentennummer: " + studentennummer);
        System.out.println("Leerkrediet: " + leerkrediet);
        System.out.println("Opleiding: " + opleiding);
    }


    public int getLeerkrediet() {
        return leerkrediet;
    }

    public void setLeerkrediet(int leerkrediet) {
        this.leerkrediet = leerkrediet;

        if (leerkrediet > 140) {
            this.leerkrediet = 140;
        } else if (leerkrediet < 0) {
            this.leerkrediet = 0;
        }
    }

    public String getStudentennummer() {
        return studentennummer;
    }

    public void setStudentennummer(String studentennummer) {
        this.studentennummer = studentennummer;
    }

    public String getOpleiding() {
        return opleiding;
    }

    public void setOpleiding(String opleiding) {
        this.opleiding = opleiding;
    }

    public static int getAantal() {
        return aantal;
    }
}
