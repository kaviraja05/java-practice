package com.practice;
// Random no game
import java.util.*;

public class RandomNoGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secret = rand.nextInt(1000);
        int attempts = 0;
        final int MAX_ATTEMPTS = 10;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!!");
        System.out.println("Start Guessing the Number between 1 to 1000");
        System.out.println("You have only 10 attempts.");
        System.out.println("Entering a number greater than 1000 will end the game.");

        while(attempts < MAX_ATTEMPTS){

            // Check if input is an integer
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter numbers only.");sc.next();//clear invalid input
                continue;}
            guess = sc.nextInt();
            attempts++;

            if(guess > 1000) {System.out.println("Invalid Input! the game ends"); break;}
            if(guess > secret) {System.out.println("Too High! Attempts Left: " + (MAX_ATTEMPTS - attempts)); }
            else if(guess < secret) {System.out.println("Too Low! Attempts Left" +  (MAX_ATTEMPTS - attempts));}
            else {System.out.println("Congratulations! You Succeeeded"); System.out.println("Total attempts used: " + attempts); break;}
        }

        // If attempts are exhausted
        if (attempts == MAX_ATTEMPTS) {
            System.out.println(" You have used all 10 attempts.");
            System.out.println("The secret number was: " + secret);
            System.out.println("Game Over.");
        }
        sc.close();
    }
}
