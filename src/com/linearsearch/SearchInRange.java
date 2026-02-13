package com.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12,55,41,17,20,76,51,80};
        int target = 80;
        boolean ans = linearSearch(arr, target, 2, 5);
        System.out.println(ans);
    }
    static boolean linearSearch(int[] nums, int target, int start, int end){
        if(nums.length == 0){
            return false;
        }
        for (int i = start; i <= end; i++) {
            //int element = nums[i];
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }

}
