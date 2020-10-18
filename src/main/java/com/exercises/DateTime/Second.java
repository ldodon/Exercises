package com.exercises.DateTime;

import java.time.LocalDate;
import java.time.Period;
//Write a Java program to calculate your age.
public class Second {
    public static void main(String[] args) {

        LocalDate yourBday = LocalDate.of(1993, 10, 30);
        String yourName = "Laura";

        LocalDate now = LocalDate.now();

        Period diff = Period.between(yourBday, now);

        System.out.printf(yourName+" is  %d years, %d months and %d days old.",
                diff.getYears(), diff.getMonths(), diff.getDays());
    }
}
