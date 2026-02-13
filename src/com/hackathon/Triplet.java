package com.hackathon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1. Problem Statement
//You are given an array nums[].
//Find all unique triplets (3 numbers) such that:
//nums[i] + nums[j] + nums[k] = 0
//with i < j < k.
public class Triplet {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(findingTriples(arr));
    }
    public static List<List<Integer>> findingTriples(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i< nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate 'i'

            int l = i + 1;
            int r = nums.length - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // move l and r to skip duplicates
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;

                    l++;
                    r--;
                }

                else if (sum < 0) l++;
                else r--;
            }
        }
        return result;
    }
}
