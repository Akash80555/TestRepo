package com.demotest;

public class OddNumberFinder {
    public static void main(String[] args) {
        // Create an array of numbers
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Find and print odd numbers
        System.out.println("Odd numbers in the array:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}




