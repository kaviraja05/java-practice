package com.practice;
//find the largest and smallest number in the array
import java.util.Arrays;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        //    System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
       // System.out.println(maximum(arr));
    //    System.out.println(minimum(arr));

        maxmin(arr);
    }
    static void maxmin(int[] num){
        int maxval = num[0];
        int minval = num[0];
        for (int i = 0; i < num.length; i++) {
            if(maxval < num[i]) maxval = num[i];
            if(minval > num[i]) minval = num[i];
        }
        System.out.println("Smallest element: "+minval);
        System.out.println("Largest element: "+maxval);

    }

    //    static int maxmium(int[] num){
//        int maxval = num[0];
//        for (int i = 0; i < num.length; i++) {
//            if(maxval > num[i]) maxval = num[i];
//        }
//        return maxval;
//    }

//    static int minimum(int[] num){
//        int minval = num[0];
//        for (int i = 0; i < num.length; i++) {
//            if(minval > num[i]) minval = num[i];
//        }
//        return minval;
//    }
}
