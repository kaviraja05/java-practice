package com.practice;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue; // Skip 5
            }

            if (i == 8) {
                break; // Stop at 8
            }

            System.out.println(i);
        }
    }

}
