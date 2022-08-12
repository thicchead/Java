package be.pxl.h1.arrayTester;

import java.util.Scanner;

public class arrayTestApp {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Nummer = ");
            numbers[i] = input.nextInt();
        }

//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

        for (int i : numbers){
            System.out.println(i);
        }

    }
}
