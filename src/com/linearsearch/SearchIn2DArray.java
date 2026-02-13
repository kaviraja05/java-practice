package com.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,17,45},
                {14,25,36,47},
                {2,5,7,9},
                {99,77}};
        int target = 17;
        int[] ans = linearSearch(arr, target); // return type value {row, col}
        System.out.println(Arrays.toString(ans));
    }
    static int[] linearSearch(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
