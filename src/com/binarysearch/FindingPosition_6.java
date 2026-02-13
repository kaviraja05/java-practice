package com.binarysearch;

import java.util.Arrays;
//find the first and last position in the sorted array
public class FindingPosition_6 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = findingRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findingRange(int[] arr, int target) {
        int[] ans = {-1, -1};
        //check for first occurences if target first
        ans[0] = search(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
            return ans;
    }

    //this fn returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target < nums[mid]) end = mid - 1;
            else if(target > nums[mid]) start = mid + 1;
            else {
                //potential ans found
                ans = mid;
                if(findStartIndex) end = mid - 1;
                else start = mid + 1;
            }
        }
        return ans;
    }
}
