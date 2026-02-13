package com.kavi;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //for loop syntax
        /*
        for(initialisation; condition; increment/decrement){
             //body
         }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        for (int i = 1; i <n ; i++) {
            System.out.print(i + " ");
        }
          */
        // while loop syntax
        /*
        while(condition){
        //body
        }
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = input.nextInt();

       /* int i=1;
        while(i<n){
            System.out.println(i);
            i++;
        }*/

        //do while loop
        /*  do{
             }while(condition);
         */

//        int n=1;
//        do{
//            System.out.println(n);
//            n++;
//        }while(n<num);

        int n=1;
        do{
            System.out.println("Excuse me");
        }while(n!=1);

    }
}
