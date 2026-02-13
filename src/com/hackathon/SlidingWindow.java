package com.hackathon;

public class SlidingWindow {
    public static int longestSubarrayWithSumK(int[] nums, int k) {
        int l = 0, sum = 0, maxLen = 0;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r]; // add right element

            // shrink window if sum > k
            while (sum > k) {
                sum -= nums[l]; // remove left element
                l++;
            }

            // update max length
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 2, 3, 2};
        int k = 7;
        System.out.println(longestSubarrayWithSumK(nums, k)); // Output: 3
    }
}
