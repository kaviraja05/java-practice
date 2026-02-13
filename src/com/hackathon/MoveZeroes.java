package com.hackathon;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // pointer for where next non-zero should go

        // Step 1: Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Step 2: Fill the rest with zeroes
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 12, 0, 3, 1};
        moveZeroes(nums);
        for (int n : nums) {
            System.out.print(n + " "); // 1 3 12 0 0
        }
    }
}

