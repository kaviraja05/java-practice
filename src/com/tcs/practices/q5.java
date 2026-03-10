//input : {1,2,4,5}, find the missing number in an array
//output: 3 [Hint: n(n+1) / 2

package com.tcs.practices;

import java.sql.SQLOutput;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int totalsum = n * (n + 1) / 2;
        int avgsum = 0;
        for(int i = 0; i < arr.length; i++){
            avgsum += arr[i];
        }
        System.out.println("Missing number: " + (totalsum - avgsum));
    }
}


