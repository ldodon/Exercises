package com.endava.exercises.extra.array;

import java.util.Arrays;
import java.util.Scanner;

//Write a Java program to find the second smallest element in an array.
public class SecondSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number");
            numbers[i] = input.nextInt();}
        System.out.println("Your array list : "+Arrays.toString(numbers));
            int firstMin = Integer.MAX_VALUE;
            int secondMin =Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == firstMin) {
                    secondMin = firstMin;
                } else if (numbers[i] < firstMin) {
                    secondMin = firstMin;
                    firstMin = numbers[i];
                } else if (numbers[i] < secondMin) {
                    secondMin = numbers[i];
                }

            }
            System.out.println("Second lowest number is : " + secondMin);
        }
    }

