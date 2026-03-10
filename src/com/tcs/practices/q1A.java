//another way of solving question 1
package com.tcs.practices;
import java.util.Scanner;

public class q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int totalSum = 0;
        for(int num : arr){
            totalSum += num;
        }

        int leftSum = 0;

        for(int i = 0; i < n; i++){
            int rightSum = totalSum - leftSum - arr[i];

            if(leftSum == rightSum){
                System.out.println(i);
                return;
            }

            leftSum += arr[i];
        }

        System.out.println(-1); // If no equilibrium index
    }
}