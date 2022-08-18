package be.pxl.h5.voorbeeldPersoon;

public class SchoolApp {
    public static void main(String[] args) {
//        Persoon persoon = new Persoon();
//        Student student = new Student();
//
////        System.out.println(persoon.getNaam());
////        System.out.println(student.getNaam());
//
//        student.setNaam("Karakoruk");
//        student.setVoornaam("Metehan");
//
////        System.out.println(student.getNaam() + " " + student.getVoornaam());
//
////        Student student1 = new Student(100, "1", "IT");   // Fout opgespoord na opdracht 6
////        System.out.println(student1.getLeerkrediet());
//
////        student1.setLeerkrediet(140);                     // Fout opgespoord na opdracht 6
////        System.out.println(student1.getLeerkrediet());
//
////        student1.wijzigLeerkrediet(200);                  // Fout opgespoord na opdracht 6
////        System.out.println(student1.getLeerkrediet());
//
////        persoon.print();
////        student1.print();
//
//        Persoon polymorf = new Student();
//        polymorf.setVoornaam("Homer");
//        polymorf.setNaam("Simpson");
////        polymorf.print();
//
//        polymorf = new Persoon();
////        polymorf.print();
//
//        System.out.println("Opdracht 6 zijn testers kloppen waarschijnlijk ook wel.");

        Persoon persoon = new Persoon();
        System.out.println(Persoon.getAantal());

        Student student = new Student();
        System.out.println(Student.getAantal());

        Lector lector = new Lector();
        System.out.println(Lector.getAantal());

        System.out.println(Persoon.getAantal());
        System.out.println(Student.getAantal()); // --> aantal personen in totaal, niet aantal studenten zelf, gefixt na opdracht 7



    }
}
