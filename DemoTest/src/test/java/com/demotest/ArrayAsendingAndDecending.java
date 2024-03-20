package com.demotest;

public class ArrayAsendingAndDecending {

    public static void main(String[] args) {
        int[] numbers = { 9, 5, 2, 7, 1, 8, 4, 6, 3 };

        bubbleSortIncreasing(numbers);
        // After sorting in increasing order
        System.out.println("Sorted in increasing order:");
        for (int number : numbers) {
            System.out.println(number);
        }

        bubbleSortDecreasing(numbers);
        // After sorting in decreasing order
        System.out.println("Sorted in decreasing order:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void bubbleSortIncreasing(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDecreasing(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
