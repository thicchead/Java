package be.pxl.h3.mathTester;

import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Straal pizza = ");

        double straal = input.nextDouble();
        int dikte = 1;

        double volume = Math.PI * straal * straal * dikte;

        String answer = String.format("%.2f", volume);

        System.out.println(answer);

    }
}
