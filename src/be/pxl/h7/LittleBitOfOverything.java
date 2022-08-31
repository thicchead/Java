package be.pxl.h7;

import java.util.Scanner;

public class LittleBitOfOverything {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef getam in = ");
        String input = scanner.nextLine();

        System.out.println(Integer.parseInt(input));
    }
}
