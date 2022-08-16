package be.pxl.h3.stringBuilderTester;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("metehan");

        str.append(" karakoruk");

        System.out.println(str);

        String tekst = str.toString();
        System.out.println(tekst);
    }
}
