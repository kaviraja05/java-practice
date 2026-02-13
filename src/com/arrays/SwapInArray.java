package com.arrays;

import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args) {
        int[] arr = {11,22,55,44,33};
        swap(arr, 2, 4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
