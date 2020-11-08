package com.endava.exercises.extra.DateTime;

import java.time.LocalDate;
import java.time.Period;

//Write a Java program to calculate your age.
public class AgeTask {
    public static void main(String[] args) {

        LocalDate yourBday = LocalDate.of(1993, 10, 30);
        String yourName = "Laura";

        LocalDate now = LocalDate.now();

        Period diff = Period.between(yourBday, now);

        String y = String.format("%d", diff.getYears());
        String m = String.format("%d", diff.getMonths());
        String d = String.format("%d", diff.getDays());

        System.out.println(yourName + " is " + y + " years," + m + " month and " + d + " days old.");
    }
}
