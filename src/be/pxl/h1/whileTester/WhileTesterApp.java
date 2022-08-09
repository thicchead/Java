package be.pxl.h1.whileTester;

import java.util.Scanner;

public class WhileTesterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int getal = scanner.nextInt();

        while (getal < 10) {
            int dubbel = getal * 2;
            System.out.printf("Het dubbele is %2d%n", dubbel);
            getal = scanner.nextInt();
        }
        scanner.close();
    }
}
