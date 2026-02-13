package com.binarysearch;
//Ceiling of a Number: Find the smallest element in an array which  is greater than or equal to the target
public class Ceiling_3 {
    public static void main(String[] args) {
        int[] arr = {2,5,8,12,45,87,99,111};
        int target = 199;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target) {

        if(target > arr[arr.length - 1]) return -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end)/2;
            if(target < arr[mid]) end = mid - 1;
            else if(target > arr[mid]) start = mid + 1;
            else return arr[mid];
        }
        if(end < start) return arr[start];
        return -1;
    }
}

