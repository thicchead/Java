package be.pxl.h1.opdracht10;

import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount mijnAccount = new BankAccount();

        mijnAccount.setName("Metehan Karakoruk");
        mijnAccount.setCode("BE");
        mijnAccount.setControlDigits(68);
        mijnAccount.setNumber(539007547034L);

        System.out.println(mijnAccount.getAccount());

        if (mijnAccount.isValid()) {
            System.out.println("Juist!");
        } else {
            System.out.println("Fout!");
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Amount of money you have = ");
        float money = input.nextFloat();
        input.nextLine();

        mijnAccount.setAmount(money);

        System.out.println("Do you want to take some money? ");
        String answer = input.nextLine();

        while (answer.equals("J")){
            System.out.println("Amount you want to take out = ");
            float moneyTakeout = input.nextFloat();

            mijnAccount.withdraw(moneyTakeout);

            System.out.println("Do you want to take some money? ");
            answer = input.nextLine();
            input.nextLine();
        }
        System.out.println(mijnAccount.getAmount());

    }
}
