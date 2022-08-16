package be.pxl.h3.randomTester;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt(10));
        System.out.println(random.nextDouble(5));
    }
}
