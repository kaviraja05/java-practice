package com.practice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Gentl e Men ";
        String str2 = "Ele gent Mn ";

        // Step 1: Remove spaces & convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Step 2: Check if lengths are equal
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
        } else {
            // Step 3: Convert strings to char arrays
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            // Step 4: Sort both arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Step 5: Compare arrays
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
    }
}
