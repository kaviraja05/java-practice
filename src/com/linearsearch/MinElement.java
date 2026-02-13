package com.linearsearch;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {12,55,41,17,-20};
        int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int[] nums){
        int minval = nums[0];
        for (int i = 0; i < nums.length; i++) {
           if(nums[i] < minval) minval = nums[i];
        }
        return minval;
    }
}
