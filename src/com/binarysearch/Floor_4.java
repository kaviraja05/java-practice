package com.binarysearch;
//Floor of a Number: Find the greatest element in an array which  is lesser than or equal to the target
public class Floor_4 {
    public static void main(String[] args) {
        int[] arr = {2,5,8,12,45,87,99,111};
        int target = 1;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target) {
        if(target < arr[0]) return -1;

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return arr[end];
        //this is the easy way or use like ceiling.
    }
}
