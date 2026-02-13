package com.hackathon;


//Problem: Given an array and a target, return indices of the two numbers that add up to target.
//        Idea:
//        Use a map to remember numbers you’ve seen.
//        For each number num, check if target - num already exists.
//        Real-world analogy:
//        Shopping with ₹50: if an item costs ₹20, you check if you’ve already seen an item of ₹30. If yes → pair found.
import java.util.*;

class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Two_Sum ts = new Two_Sum();
        int[] nums = {2, 7, 11, 15};
        int[] ans = ts.twoSum(nums, 13);
        System.out.println(Arrays.toString(ans));
    }
}
