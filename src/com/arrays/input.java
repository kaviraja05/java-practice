package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 44;
        arr[2] = 54;
        arr[3] = 78;
//        System.out.println(arr[2]);

        // for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//            System.out.println(arr[i]);
//        }

        //enhanced for loop
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));  // Internally it uses for loop.

        //String example
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
