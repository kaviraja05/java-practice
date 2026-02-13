package com.binarysearch;
//Q: Find the Rotation Count in Rotated Sorted Array.
public class RotationCount_12 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(count(arr));
    }
    static int count(int[] arr){
        int pivot = pivot(arr);
      //  if(pivot == -1) return 0; //array is not rotated
        return pivot+1;
    }
    //Assume that this is non duplicated rotated sorted array
    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // 4 cases
            if (end > mid && arr[mid] > arr[mid + 1]) return mid;
            if (start < mid && arr[mid] < arr[mid - 1]) return mid - 1;
            if (arr[mid] <= arr[start]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

}
