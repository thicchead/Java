package be.pxl.h3.mathTester;

import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number = ");
        int x = input.nextInt();

        int answer = (int) Math.pow(x, 3);

        System.out.println(answer);

    }
}
