package com.endava.exercises.extra.secondTasks;

import java.util.Scanner;
//Second example
//Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
//Test Data
//Input an integer number less than ten billion: 125463
public class ReadIntegerSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");
        long number = scanner.nextLong();
        if (number > 0 && number <= 10000000000L) {
            String parse = String.valueOf(number);
            long length = parse.length();
            System.out.println("The number's length is: " + length);
        } else
            System.out.println("Invalid number");
    }
}
