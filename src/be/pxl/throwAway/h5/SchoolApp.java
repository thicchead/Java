package be.pxl.throwAway.h5;

public class SchoolApp {
    public static void main(String[] args) {
        Persoon persoon = new Persoon();
        Persoon persoon1 = new Persoon();
        Persoon persoon2 = new Persoon();

        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();

        // System.out.println(student.getVoornaam());
        /*student.setLeerkrediet(150);
        System.out.println(student.getLeerkrediet());

        student.setLeerkrediet(-10);
        System.out.println(student.getLeerkrediet());*/
        /*student.setLeerkrediet(100);
        student.wijzigLeerkrediet(500);
        System.out.println(student.getLeerkrediet());

        persoon.print();
        student.print();*/
        /*Persoon pol = new Student(); // new Persoon() werkt perfect
        pol.setNaam("Metje");
        // pol.setOpleiding(); --> KAN ALLEEN DOEN WAT ER IN PERSOON STAAT (EERSTE)
        System.out.println(pol.getNaam());
        pol.print();  // VAN STUDENT -- LATE BINDING */
        /*Lector lector = new Lector();
        lector.setAanstellingspercentage(120);
        lector.print();*/

        System.out.println(Persoon.getAantal());
        System.out.println(Student.getAantal()); // print aantal personen uit

    }
}
