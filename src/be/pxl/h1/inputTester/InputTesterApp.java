package be.pxl.h1.inputTester;

import java.util.Scanner;

public class InputTesterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jouw naam = ");
        String naam = input.next();

        System.out.println(naam);

        input.close();
    }
}
