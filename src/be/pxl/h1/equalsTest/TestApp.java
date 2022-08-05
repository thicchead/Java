package be.pxl.h1.equalsTest;

import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Naam = ");
        String naam = scanner.next();

        System.out.println("Naam = ");
        String tweedeNaam = scanner.next();

        if (naam.equals(tweedeNaam)) {
            System.out.println("Juist!");
        } else {
            System.out.println("Fout!");
        }

        scanner.close();
    }
}
