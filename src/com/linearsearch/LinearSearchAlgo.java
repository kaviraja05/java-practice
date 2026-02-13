package com.linearsearch;

public class LinearSearchAlgo {
    public static void main(String[] args) {
        int[] arr = {12,55,41,17,20};
        int target = 122;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] nums, int target){
        if(nums.length == 0){
            return Integer.MIN_VALUE;
            //    return false;
        }
        for (int i = 0; i < nums.length; i++) {
            //int element = nums[i];
            if(nums[i] == target){
                return i;
            }
        }
        return Integer.MIN_VALUE;
        //   return false;
    }
}
