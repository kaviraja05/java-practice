package com.linearsearch;

import java.util.Arrays;

public class MaxIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23,17,45},
                {14,625,36,47},
                {2,555,7,9},
                {99,77}};
        int ans = search(arr); // return type value {row, col}
        System.out.println(ans);
    }
    static int search(int[][] arr){
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}

