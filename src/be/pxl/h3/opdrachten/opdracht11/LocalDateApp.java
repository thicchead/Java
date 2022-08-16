package be.pxl.h3.opdrachten.opdracht11;

import java.time.LocalDate;

public class LocalDateApp {
    public static void main(String[] args) {
        LocalDate myBirthday = LocalDate.of(2003, 9, 15);

        System.out.println(myBirthday);

        System.out.println("I was born on the " + myBirthday.getDayOfYear() + "th day of the year");
        System.out.println("It was on a " + myBirthday.getDayOfWeek());
        System.out.println("Was 2003 a leap year? " + myBirthday.isLeapYear());
    }
}
