package com.kavi;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();
      //  int n = 2333231;
        System.out.println("Enter the value of p:");
        int p = in.nextInt();
        int count = 0;
        while(n>0){
            int rem = n % 10;
            if(rem == p){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);

    }
}
