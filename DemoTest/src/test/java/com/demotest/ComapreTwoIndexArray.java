package com.demotest;

import java.util.ArrayList;

public class ComapreTwoIndexArray {

    public static void main(String[] args) {
        // Compare same indexes of 2 different arrays and create a new array for matching values:

        int a[] = {1, 4, 5, 7};
        int b[] = {6, 4, 3, 7};

        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                // Code to add the matching values to the ArrayList:
                al.add(a[i]);
            }
        }

        // Convert ArrayList to an array
        Integer[] c = al.toArray(new Integer[0]);

        // Print the values in the array
        for (Integer num : c) {
            System.out.println(num);
        }
    }
}
