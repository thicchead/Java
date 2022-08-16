package be.pxl.h3.opdracht3;

import java.util.Random;

public class RNGApp {
    public static void main(String[] args) {
        Random rand = new Random();

        int firstValue = rand.nextInt();
//        System.out.println(firstValue);

        for (int i = 0; i < 20; i++) {
            int secondValue = rand.nextInt(0, 11);
            // System.out.println(i + 1 + ": " + secondValue);
        }
        for (int i = 0; i < 10; i++) {
            int thirdValue = rand.nextInt(20, 31);
            // System.out.println(i + 1 + ": " + thirdValue);
        }
        int fourthValue = rand.nextInt(90, 101);
        System.out.println((char) fourthValue);
    }
}
