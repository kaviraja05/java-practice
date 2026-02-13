package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] array = {{1,2,3,4},
                    {7,6,5,3},
                {5,4,1}};

        int[][] arr = new int[3][2];
        System.out.println(arr.length);

//        for (int row = 0; row < array.length; row++) {
//            for (int col = 0; col < array[row].length; col++) {
            //    arr[row][col] = in.nextInt();
            //    System.out.println(array[row][col]+" ");
 //           }

            for(int[] row : array){
            System.out.println(Arrays.toString(row));
        }
    }
}
