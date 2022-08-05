package be.pxl.h1.charTest;

public class CharApp {
    public static void main(String[] args) {
        char karakter = 'a';

        System.out.println(karakter + 1);

        karakter = (char) (karakter + 1);
        System.out.println(karakter);
    }
}
