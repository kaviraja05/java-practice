package com.practice;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean ans = isPrime(num);
        System.out.println(ans);

        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0,1, negatives are not prime

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // divisible by i → not prime
        }

        return true; // prime if no divisors
    }
}

