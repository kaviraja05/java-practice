package com.arrays;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] nums = {2,32,21,44,76,51,32};
        System.out.println(Arrays.toString(nums));

        // System.out.println(nums);// It is wrong. you must use a for loop to print like this in a array format.
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i]+ " ");
//        }

        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
        System.out.println(Arrays.toString(arr));
    }
}
