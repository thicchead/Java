package be.pxl.h3.opdracht6;

import java.util.Scanner;

public class StringApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tekst = ");

        String text = input.nextLine();

        System.out.println(text);
        System.out.println(text.length());

        String newText = text.replace("a", "o");

        System.out.println(newText);

        char letterE = 'e';
        int count = 0;

        for (int i = 0; i < newText.length(); i++) {
            if (newText.charAt(i) == letterE) {
                count++;
            }
        }

        System.out.println("Aantal e's = " + count);

        input.close();
    }
}
