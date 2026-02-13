package com.hackathon;

public class PairSum {
    public static int[] findPairIndices(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return new int[]{nums[l], nums[r]}; // return indices
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{}; // empty if no pair
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 7, 9};
        int target = 8;

        int[] result = findPairIndices(nums, target);
        if (result.length > 0) {
            System.out.println("Pair: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }
}


