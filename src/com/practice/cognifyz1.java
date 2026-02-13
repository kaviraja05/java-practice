package com.practice;

import java.util.Scanner;
import java.util.Random;

/**
 * Number Guessing Game - Console-Based Text Game
 * ================================================
 * A simple number guessing game demonstrating:
 * - Conditional statements (if/else)
 * - Loop structures (while, do-while)
 * - User input handling
 * - Input validation
 */
public class cognifyz1 {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_ATTEMPTS = 10;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayWelcome();
        displayRules();

        // Variable to track if player wants to continue
        boolean playAgain = true;
        while (playAgain) {
            playGame();
            playAgain = askPlayAgain();
        }

        // Display farewell message
        displayFarewell();

        // Close the scanner
        scanner.close();
    }

    private static void displayWelcome() {
        System.out.println();
        System.out.println("+======================================================+");
        System.out.println("|     WELCOME TO THE NUMBER GUESSING GAME!             |");
        System.out.println("+======================================================+");
        System.out.println();
    }


    private static void displayRules() {
        System.out.println("+------------------------------------------------------+");
        System.out.println("|                    GAME RULES                        |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("| 1. The computer will think of a number between " +
                MIN_NUMBER + "-" + MAX_NUMBER + " |");
        System.out.println("| 2. You have " + MAX_ATTEMPTS + " attempts to guess the correct number  |");
        System.out.println("| 3. After each guess, you'll get a hint:              |");
        System.out.println("|    - 'Too HIGH' if your guess is above the number    |");
        System.out.println("|    - 'Too LOW' if your guess is below the number     |");
        System.out.println("| 4. Guess correctly to WIN!                           |");
        System.out.println("| 5. Run out of attempts and you LOSE!                 |");
        System.out.println("+------------------------------------------------------+");
        System.out.println();
    }


    private static void playGame() {
        // Generate random secret number
        Random random = new Random();
        int secretNumber = random.nextInt(100);//MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;

        int attemptsUsed = 0;

        boolean hasWon = false;

        System.out.println(">>> I'm thinking of a number between " + MIN_NUMBER + " and " + MAX_NUMBER + "...");
        System.out.println(">>> Can you guess it?\n");

        // Game loop - continues until player wins or runs out of attempts
        while (attemptsUsed < MAX_ATTEMPTS && !hasWon) {
            // Display remaining attempts
            int attemptsRemaining = MAX_ATTEMPTS - attemptsUsed;
            System.out.println("Attempts remaining: " + attemptsRemaining);

            int playerGuess = getValidGuess();

            // Increment attempts counter
            attemptsUsed++;

            // Check the guess using conditional statements
            if (playerGuess == secretNumber) {
                // Player guessed correctly - WIN condition
                hasWon = true;
                displayWinMessage(attemptsUsed);

            } else if (playerGuess < secretNumber) {
                // Guess is too low - provide feedback
                System.out.println(">>> Too LOW! Try a higher number.\n");

            } else {
                // Guess is too high - provide feedback
                System.out.println(">>> Too HIGH! Try a lower number.\n");
            }

            // Additional hint when running low on attempts
            if (!hasWon && attemptsRemaining == 2) {
                System.out.println("*** WARNING: Only 1 attempt left after this! ***\n");
            }
        }

        // Check if player lost (ran out of attempts without winning)
        if (!hasWon) {
            displayLoseMessage(secretNumber);
        }
    }

    private static int getValidGuess() {
        int guess = 0;
        boolean validInput = false;

        // Loop until valid input is received
        while (!validInput) {
            System.out.print("Enter your guess (" + MIN_NUMBER + "-" + MAX_NUMBER + "): ");

            // Check if input is an integer
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();

                // Validate the range using conditional statement
                if (guess >= MIN_NUMBER && guess <= MAX_NUMBER) {
                    // Valid input within range
                    validInput = true;
                } else {
                    // Input is out of range
                    System.out.println("!!! Invalid: Please enter a number between " +
                            MIN_NUMBER + " and " + MAX_NUMBER + ".\n");
                }
            } else {
                // Input is not a number - handle gracefully
                System.out.println("!!! Invalid: That's not a number! Please enter a valid integer.\n");
                scanner.next(); // Clear the invalid input
            }
        }

        return guess;
    }

    private static void displayWinMessage(int attempts) {
        System.out.println();
        System.out.println("+======================================================+");
        System.out.println("|       *** CONGRATULATIONS! YOU WIN! ***              |");
        System.out.println("+======================================================+");
        System.out.println();
        System.out.println("You guessed the number in " + attempts + " attempt(s)!");

        // Performance feedback based on attempts using conditional statements
        if (attempts == 1) {
            System.out.println(">>> INCREDIBLE! First try! Are you psychic?!");
        } else if (attempts <= 4) {
            System.out.println(">>> EXCELLENT! You're a natural at this!");
        } else if (attempts <= 7) {
            System.out.println(">>> GOOD JOB! Solid guessing skills!");
        } else {
            System.out.println(">>> PHEW! That was close, but you made it!");
        }
        System.out.println();
    }

    private static void displayLoseMessage(int secretNumber) {
        System.out.println();
        System.out.println("+======================================================+");
        System.out.println("|           *** GAME OVER - YOU LOSE! ***              |");
        System.out.println("+======================================================+");
        System.out.println();
        System.out.println("You've run out of attempts!");
        System.out.println("The secret number was: " + secretNumber);
        System.out.println(">>> Better luck next time!");
        System.out.println();
    }

    /**
     * Asks if the player wants to play again
     * Handles input validation for yes/no response
     */
    private static boolean askPlayAgain() {
        boolean validResponse = false;
        boolean playAgain = false;

        // Loop until valid response
        while (!validResponse) {
            System.out.print("Would you like to play again? (yes/no): ");
            String response = scanner.next().trim().toLowerCase();

            // Check response using conditional statements
            if (response.equals("yes") || response.equals("y")) {
                playAgain = true;
                validResponse = true;
                System.out.println("\n>>> Starting a new game...\n");
                System.out.println("--------------------------------------------------------\n");
            } else if (response.equals("no") || response.equals("n")) {
                playAgain = false;
                validResponse = true;
            } else {
                // Invalid response - ask again
                System.out.println("!!! Please enter 'yes' or 'no'.\n");
            }
        }

        return playAgain;
    }

    /**
     * Displays the farewell message when game ends
     */
    private static void displayFarewell() {
        System.out.println();
        System.out.println("+======================================================+");
        System.out.println("|      THANK YOU FOR PLAYING! SEE YOU NEXT TIME!       |");
        System.out.println("|                    Goodbye!                          |");
        System.out.println("+======================================================+");
        System.out.println();
    }
}
