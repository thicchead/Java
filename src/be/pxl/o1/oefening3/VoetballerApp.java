package be.pxl.o1.oefening3;

import java.util.Scanner;

public class VoetballerApp {
    public static void main(String[] args) {
        Voetballer voetballer = new Voetballer();
        Scanner input = new Scanner(System.in);

        System.out.println("Naam = ");
        String naam = input.next();
        input.nextLine();

        while (!naam.equals("stop")) {
            voetballer.setNaam(naam);

            System.out.println("Type speler = ");
            String type = input.nextLine();
            voetballer.setType(type);

            System.out.println("Doelpunten = ");
            int doelpunten = input.nextInt();
            voetballer.setDoelpunten(doelpunten);

            System.out.println("Beoordelingscijfer = ");
            double cijfer = input.nextDouble();
            voetballer.setBeoordelingscijfer(cijfer);

            System.out.println("Leeftijd = ");
            int leeftijd = input.nextInt();
            voetballer.setLeeftijd(leeftijd);

            System.out.println(voetballer.berekenPrijs());

            System.out.println("Naam = ");
            naam = input.next();
            input.nextLine();

        }

        input.close();


    }
}
