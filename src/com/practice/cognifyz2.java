package com.practice;

import java.util.Scanner;

public class cognifyz2 {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display program header and description
        displayHeader();

        // Get number of rows from user
        int numberOfRows = getNumberOfRows(scanner);

        // Generate and print the right-angled triangle pattern
        printRightAngledTriangle(numberOfRows);

        // Display closing message
        displayClosingMessage();

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    /**
     * Displays the program header with a description of the pattern.
     */
    private static void displayHeader() {
        System.out.println("+============================================================+");
        System.out.println("|         RIGHT-ANGLED TRIANGLE NUMBER PATTERN               |");
        System.out.println("+============================================================+");
        System.out.println("|  Pattern Description:                                      |");
        System.out.println("|  - A right-angled triangle made of numbers                 |");
        System.out.println("|  - Each row displays numbers from 1 to the row number      |");
        System.out.println("|  - The pattern grows incrementally with each row           |");
        System.out.println("+============================================================+");
        System.out.println();
    }

    private static int getNumberOfRows(Scanner scanner) {
        int rows = 0;
        boolean validInput = false;

        // Keep asking until valid input is received
        while (!validInput) {
            System.out.print("Enter the number of rows (1-20): ");

            // Check if input is an integer
            if (scanner.hasNextInt()) {
                rows = scanner.nextInt();

                // Validate the range (1 to 20 for readability)
                if (rows >= 1 && rows <= 20) {
                    validInput = true;
                } else {
                    System.out.println("[!] Please enter a number between 1 and 20.");
                }
            } else {
                // Clear invalid input
                scanner.next();
                System.out.println("[!] Invalid input! Please enter a valid number.");
            }
        }

        System.out.println();
        return rows;
    }


    private static void printRightAngledTriangle(int numberOfRows) {
        System.out.println("Generated Pattern (" + numberOfRows + " rows):");
        System.out.println("------------------------------");

        // Outer loop: Iterate through each row
        for (int row = 1; row <= numberOfRows; row++) {

            // Inner loop: Print numbers from 1 to current row number
            for (int column = 1; column <= row; column++) {
                // Print number with space for formatting
                System.out.print(column + " ");
            }

            // Move to the next line after completing each row
            System.out.println();
        }

        System.out.println("------------------------------");
    }


    private static void displayClosingMessage() {
        System.out.println();
        System.out.println("[*] Pattern generated successfully!");
        System.out.println("Thank you for using the Number Pattern Generator.");
        System.out.println("Program ended gracefully.");
    }
}

