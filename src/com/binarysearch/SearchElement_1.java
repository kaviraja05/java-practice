package com.binarysearch;

public class SearchElement_1 {
    public static void main(String[] args) {
        int[] arr = {2,5,8,12,45,87,99,111};
        int target = 55;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // int mid = (start + end)/2;
            //might be possible that (s+e) exceeds the range of integer in java, you get error, so use the optimized way
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) end = mid - 1;
            else if(target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }
}
