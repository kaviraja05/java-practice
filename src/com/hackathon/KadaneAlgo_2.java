package com.hackathon;

class KadaneAlgo_2 {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        KadaneAlgo_2 m = new KadaneAlgo_2();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(m.maxSubArray(nums)); // 6
    }
}
