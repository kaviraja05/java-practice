package com.test;

import java.util.Random;
import java.util.Scanner;

public class RandomNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int secret = rand.nextInt(1000);
        final int Max_attempts = 10;
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Game!");
        System.out.println("Start guessing the number between 1 to 1000");
        System.out.println("Note: The Maximum Attempts is 10");

        while (attempts < Max_attempts) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid Input! Give only Integer");
                scanner.next();
                continue;
            }
            guess = scanner.nextInt();
            attempts++;

            if (guess > 1000) {
                System.out.println("Invalid! enter number less than 1000");
                System.out.println("Attempts left: " + (Max_attempts - attempts));
            } else if (guess < secret)
                System.out.println("Low! Try Big Number. Attempts Left: " + (Max_attempts - attempts));
            else if (guess > secret)
                System.out.println("High! Try Small Number. Attempts Left: " + (Max_attempts - attempts));
            else {System.out.println("Congratulations! You Succeed");
            System.out.println("Total attempts used: " + attempts);
            break;}
        }

        if (attempts == Max_attempts) {
            System.out.println("Sorry! You Failed");
            System.out.println("The Secret Number is: " + secret);
            System.out.println("Game over!");
        }
        scanner.close();
    }
}
