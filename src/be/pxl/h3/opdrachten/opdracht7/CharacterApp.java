package be.pxl.h3.opdracht7;

import java.util.Scanner;

public class CharacterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Artikelcode = ");

        String artikelcode = input.nextLine();

        char eerste = artikelcode.charAt(0);
        char tweede = artikelcode.charAt(1);

        if (!Character.isLetter(eerste) || !Character.isLetter(tweede)) {
            System.out.println("Fout");
        }

        char eersteUpper = Character.toUpperCase(eerste);

        String codeTwee = eersteUpper + artikelcode.substring(1);

        System.out.println(codeTwee);
    }
}
